package dao;

import model.CategoryRecept;

public interface CategoryReceptDao {

    CategoryRecept createCategoryRecept(CategoryRecept categoryRecept);
    void showCategories();

}
