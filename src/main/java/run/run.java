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
        CategoryRecept categoryRecept1 = categoryReceptDao.createCategoryRecept(CategoryRecept.create("Первые блюда"));
        CategoryRecept categoryRecept2 = categoryReceptDao.createCategoryRecept(CategoryRecept.create("Вторые блюда"));
        CategoryRecept categoryRecept3 = categoryReceptDao.createCategoryRecept(CategoryRecept.create("Напитки"));
        CategoryRecept categoryRecept4 = categoryReceptDao.createCategoryRecept(CategoryRecept.create("Салаты"));
        CategoryRecept categoryRecept5 = categoryReceptDao.createCategoryRecept(CategoryRecept.create("Десерты, сладкие блюда"));

        receptDao = applicationContext.getBean(ReceptDao.class);


        Recept recept=new Recept();
        recept.setName("Африканский куриный суп");
        recept.setCategoryRecept(categoryRecept1);
        recept.setDescription("Большую часть горошка отварить до мягкости в курином бульоне и протереть через сито вместе с бульоном. Меньшую часть гороха оставить на ночь, обсушить.");

        List <Ingridient> ingridients = new ArrayList();
        ingridients.add(Ingridient.create("лук репчатый", 2, "шт"));
        ingridients.add(Ingridient.create("масло сливочное", 3, "ст.л."));
        ingridients.add(Ingridient.create("яблоко", 1, "шт."));
        ingridients.add(Ingridient.create("порошок карри", 1, "ч.л."));
        ingridients.add(Ingridient.create("мука", 1, "ст.л."));
        ingridients.add(Ingridient.create("бульон куриный", 500, "мл"));
        ingridients.add(Ingridient.create("горошек зеленый", 500, "г"));
        ingridients.add(Ingridient.create("сливки", 1, "г"));
        ingridients.add(Ingridient.create("соль, перец", 0, "по вкусу"));
        recept.setIngridients(ingridients);
        recept=receptDao.createRecept(recept);






    }




}
