package config;

import dao.CategoryReceptDao;
import dao.CategoryReceptDaoImpl;
import dao.ReceptDao;
import dao.ReceptDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.jdbc.datasource.init.ScriptUtils;
import org.springframework.jdbc.support.lob.DefaultLobHandler;
import org.springframework.jdbc.support.lob.LobHandler;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.SQLException;

@Configuration
@ComponentScan
public class DataConfiguration {

    @Autowired
    private DataSource dataSource;

    @Bean
    public DataSource dataSource() {

        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
        try {
            dataSource.setDriverClass((Class <? extends Driver>) Class.forName("org.sqlite.JDBC"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        dataSource.setUrl("jdbc:sqlite:catalog.s3db");
        return  dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    @Bean
    public LobHandler lobHandler() {
        return new DefaultLobHandler();
    }

    @Bean
    public CategoryReceptDao categoryReceptDao() {
        return new CategoryReceptDaoImpl();
    }

    @Bean
    public ReceptDao receptDao() {
        return new ReceptDaoImpl();
    }

    @PostConstruct
    public void makeScript() throws SQLException {
        ScriptUtils.executeSqlScript(dataSource.getConnection(), new ClassPathResource("/data.sql"));
    }


}
