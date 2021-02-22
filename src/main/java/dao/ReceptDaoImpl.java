package dao;

import model.CategoryRecept;
import model.Ingridient;
import model.Recept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.jdbc.core.simple.SimpleJdbcInsertOperations;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.util.List;

@Component
public class ReceptDaoImpl implements ReceptDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private DataSource dataSource;

    @Autowired
    private IngridientDao ingridientDao;

    private SimpleJdbcInsertOperations insertOperations;

    private NamedParameterJdbcOperations parameterJdbcOperations;

    private RowMapper <Recept> receptRowMapper;


    @PostConstruct
    public void init(){
        this.parameterJdbcOperations = new NamedParameterJdbcTemplate(dataSource);
        this.insertOperations = new SimpleJdbcInsert(dataSource)
                .withTableName("Recept")
                .usingGeneratedKeyColumns("id");

        this.receptRowMapper=(resultSet, i) -> {

            CategoryRecept categoryRecept = CategoryRecept.create(resultSet.getString("category_name"));
            categoryRecept.setId(resultSet.getInt("categoryReceptID"));

            Recept recept = Recept.receptCreate(categoryRecept, resultSet.getString("name"), resultSet.getString("description"));
            recept.setId(resultSet.getInt("id"));

            return recept;
        };

    }

    @Override
    public Recept createRecept(Recept recept) {

        Number returnKey = insertOperations.executeAndReturnKey(new BeanPropertySqlParameterSource(recept));
        recept.setId((Integer) returnKey);

        //Чистим ингридиенты
        if (recept.getIngridients() != null) {

            jdbcTemplate.update("DELETE FROM Ingridient WHERE receptId = ?", new Object[]{recept.getId()});

            //в цикле записываем каждый ингридиент
            for (Ingridient ingridient : recept.getIngridients()) {
                ingridient.setReceptId(recept.getId());
                ingridientDao.createIngridient(ingridient);
            }

        }
        return recept;
    }

    @Override
    public List <Recept> getAllRecept() {
        return parameterJdbcOperations.query("select Recept.*, CategoryRecept.name as category_name from Recept LEFT JOIN CategoryRecept on  Recept.categoryReceptID = CategoryRecept.id", this.receptRowMapper);
    }

    @Override
    public void showAllRecept() {
        getAllRecept().forEach(System.out::println);
    }
}
