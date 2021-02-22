package dao;

import model.Recept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.jdbc.core.simple.SimpleJdbcInsertOperations;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

public class ReceptDaoImpl implements ReceptDao {

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
                .withTableName("Recept")
                .usingColumns("name, categoryReceptId, description")
                .usingGeneratedKeyColumns("id");
    }

    @Override
    public Recept createRecept(Recept recept) {
        Number returnKey = insertOperations.executeAndReturnKey(new BeanPropertySqlParameterSource(recept));
        recept.setId((Integer) returnKey);
        return recept;
    }



}
