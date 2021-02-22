package run;

import config.DataConfiguration;
import dao.CategoryReceptDao;
import model.CategoryRecept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.jdbc.datasource.init.ScriptUtils;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class run {

    private static ApplicationContext applicationContext;


    public CategoryReceptDao categoryReceptDao;


    public static void main(String args[]) throws SQLException, ClassNotFoundException {
        applicationContext = new AnnotationConfigApplicationContext(DataConfiguration.class);

        new run().demo();
    }

    public void  demo(){

        categoryReceptDao = applicationContext.getBean(CategoryReceptDao.class);
        categoryReceptDao.createCategoryRecept(CategoryRecept.create("Первые блюда"));
        categoryReceptDao.createCategoryRecept(CategoryRecept.create("Вторые блюда"));
        categoryReceptDao.createCategoryRecept(CategoryRecept.create("Напитки"));
        categoryReceptDao.createCategoryRecept(CategoryRecept.create("Салаты"));
        categoryReceptDao.createCategoryRecept(CategoryRecept.create("Десерты, сладкие блюда"));








    }




}
