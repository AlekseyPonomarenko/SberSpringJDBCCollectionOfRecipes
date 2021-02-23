package dao;

import model.CategoryRecept;
import model.Recept;

import java.util.List;

public interface ReceptDao {

    Recept createRecept(Recept recept);
    public List <Recept> getAllRecept();
    void showAllRecept();
    void showFullRecept(Recept recept);
}
