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
public class IngridientDaoImpl implements IngridientDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private DataSource dataSource;

    private SimpleJdbcInsertOperations insertOperations;
    private NamedParameterJdbcOperations parameterJdbcOperations;

    @PostConstruct
    public void init(){
        this.parameterJdbcOperations = new NamedParameterJdbcTemplate(dataSource);
        this.insertOperations = new SimpleJdbcInsert(dataSource)
                .withTableName("Ingridient")
                .usingGeneratedKeyColumns("id");
    }

    @Override
    public Ingridient createIngridient(Ingridient ingridient) {

        Number returnKey=insertOperations.executeAndReturnKey(new BeanPropertySqlParameterSource(ingridient));
        ingridient.setId((Integer) returnKey);
        return ingridient;

    }



}
