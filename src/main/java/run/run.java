package run;

import config.DataConfiguration;
import dao.CategoryReceptDao;
import dao.ReceptDao;
import model.CategoryRecept;
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
        CategoryRecept categoryRecept1 = categoryReceptDao.createCategoryRecept(CategoryRecept.create("Первые блюда"));
        CategoryRecept categoryRecept2 = categoryReceptDao.createCategoryRecept(CategoryRecept.create("Вторые блюда"));
        CategoryRecept categoryRecept3 = categoryReceptDao.createCategoryRecept(CategoryRecept.create("Напитки"));
        CategoryRecept categoryRecept4 = categoryReceptDao.createCategoryRecept(CategoryRecept.create("Салаты"));
        CategoryRecept categoryRecept5 = categoryReceptDao.createCategoryRecept(CategoryRecept.create("Десерты, сладкие блюда"));

        receptDao = applicationContext.getBean(ReceptDao.class);

       Recept  recept = new Recept();
       // recept.setName("Африканский куриный суп");
       // recept.setCategoryRecept(categoryRecept1);
       // recept.setDescription("Большую часть горошка отварить до мягкости в курином бульоне и протереть через сито вместе с бульоном. Меньшую часть гороха оставить на ночь, обсушить.");
       // recept = receptDao.createRecept(recept);






    }




}
