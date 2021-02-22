package dao;

import model.Ingridient;
import model.Recept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.jdbc.core.simple.SimpleJdbcInsertOperations;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

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

    @PostConstruct
    public void init(){
        this.parameterJdbcOperations = new NamedParameterJdbcTemplate(dataSource);
        this.insertOperations = new SimpleJdbcInsert(dataSource)
                .withTableName("Recept")
                .usingGeneratedKeyColumns("id");
    }

    @Override
    public Recept createRecept(Recept recept) {

        Number returnKey = insertOperations.executeAndReturnKey(new BeanPropertySqlParameterSource(recept));
        recept.setId((Integer) returnKey);

        //Чистим ингридиенты
        jdbcTemplate.update("DELETE FROM Ingridient WHERE receptId = ?", new Object[] {recept.getId()});

        //в цикле записываем каждый ингридиент
        for (Ingridient ingridient: recept.getIngridients()){
            ingridient.setReceptId(recept.getId());
            ingridientDao.createIngridient(ingridient);
        }
        return recept;
    }

}
