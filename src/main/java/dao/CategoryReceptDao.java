package dao;

import model.CategoryRecept;

import java.util.List;

public interface CategoryReceptDao {

    CategoryRecept createCategoryRecept(CategoryRecept categoryRecept);
    public List <CategoryRecept> getAllCategoryRecept();
    void showCategories();

}
