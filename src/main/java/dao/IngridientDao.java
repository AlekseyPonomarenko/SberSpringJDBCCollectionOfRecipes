package dao;

import model.Ingridient;
import model.Recept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.jdbc.core.simple.SimpleJdbcInsertOperations;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.util.List;

public interface IngridientDao {
    Ingridient createIngridient(Ingridient ingridient);
    public List <Ingridient> getIngridientList(Recept recept);
}
