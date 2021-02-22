package dao;

import model.CategoryRecept;
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
public class CategoryReceptDaoImpl implements CategoryReceptDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private DataSource dataSource;

    private SimpleJdbcInsertOperations insertOperations;

    private NamedParameterJdbcOperations parameterJdbcOperations;

    private RowMapper <CategoryRecept> categoryReceptRowMapper;


    @PostConstruct
    public void init() {

        this.parameterJdbcOperations=new NamedParameterJdbcTemplate(dataSource);
        this.insertOperations=new SimpleJdbcInsert(dataSource)
                .withTableName("CategoryRecept")
                .usingGeneratedKeyColumns("id");

        this.categoryReceptRowMapper=(resultSet, i) -> {
            CategoryRecept categoryRecept=CategoryRecept.create(resultSet.getString("name"));
            categoryRecept.setId(resultSet.getInt("id"));
            return categoryRecept;
        };

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
    public List <CategoryRecept> getAllCategoryRecept() {
        return parameterJdbcOperations.query("select * from CategoryRecept", this.categoryReceptRowMapper);
    }

    @Override
    public void showCategories() {
       getAllCategoryRecept().forEach(System.out::println);
    }

}
