package dao;

import model.CategoryRecept;
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
public class CategoryReceptDaoImpl implements CategoryReceptDao {

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
                .withTableName("CategoryRecept")
                .usingGeneratedKeyColumns("id");
    }

    public CategoryReceptDaoImpl() {

    }

    @Override
    public CategoryRecept createCategoryRecept(CategoryRecept categoryRecept) {

        Number returnKey = insertOperations.executeAndReturnKey(new BeanPropertySqlParameterSource(categoryRecept));
        categoryRecept.setId((Integer) returnKey);
        return categoryRecept;

    }

    @Override
    public void showCategories() {

    }
}
