package run;

import config.DataConfiguration;
import dao.CategoryReceptDao;
import dao.ReceptDao;
import model.CategoryRecept;
import model.Ingridient;
import model.Recept;
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
import java.util.ArrayList;
import java.util.List;

public class run {

    private static ApplicationContext applicationContext;


    public CategoryReceptDao categoryReceptDao;
    public ReceptDao receptDao;


    public static void main(String args[]) throws SQLException, ClassNotFoundException {
        applicationContext = new AnnotationConfigApplicationContext(DataConfiguration.class);
        new run().demo();
    }

    public void  demo(){

        categoryReceptDao = applicationContext.getBean(CategoryReceptDao.class);
        receptDao = applicationContext.getBean(ReceptDao.class);
        //new FillDemo().fillDemo(categoryReceptDao, receptDao);
        categoryReceptDao.showCategories();
        receptDao.showAllRecept();
    }

}
