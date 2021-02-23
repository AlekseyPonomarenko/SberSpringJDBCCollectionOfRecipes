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
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.jdbc.core.simple.SimpleJdbcInsertOperations;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class IngridientDaoImpl implements IngridientDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private DataSource dataSource;

    private SimpleJdbcInsertOperations insertOperations;
    private NamedParameterJdbcOperations parameterJdbcOperations;
    private RowMapper <Ingridient> ingridientRowMapper;


    @PostConstruct
    public void init(){
        this.parameterJdbcOperations = new NamedParameterJdbcTemplate(dataSource);
        this.insertOperations = new SimpleJdbcInsert(dataSource)
                .withTableName("Ingridient")
                .usingGeneratedKeyColumns("id");


        this.ingridientRowMapper=(resultSet, i) -> {
            Ingridient ingridient = Ingridient.create(resultSet.getString("item"), resultSet.getInt("count"), resultSet.getString("unit"));
            ingridient.setId(resultSet.getInt("id"));
            return ingridient;
        };

    }

    @Override
    public Ingridient createIngridient(Ingridient ingridient) {

        Number returnKey=insertOperations.executeAndReturnKey(new BeanPropertySqlParameterSource(ingridient));
        ingridient.setId((Integer) returnKey);
        return ingridient;

    }

    @Override
    public List <Ingridient> getIngridientList(Recept recept) {
        Map<String, Integer> map = new HashMap <>();
        map.put("receptId",recept.getId());
        return parameterJdbcOperations.query("select * from Ingridient where receptId = :receptId", map, this.ingridientRowMapper);
    }




}
