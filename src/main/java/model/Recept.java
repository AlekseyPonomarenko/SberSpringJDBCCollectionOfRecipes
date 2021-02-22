package model;

import java.util.ArrayList;
import java.util.List;

public class Recept {

    private Integer id;
    private String name;
    private Integer categoryReceptId;
    private String description;

    private CategoryRecept categoryRecept;

    public static Recept receptCreate(CategoryRecept categoryRecept, String name, String description){
        Recept recept = new Recept();
        recept.setCategoryRecept(categoryRecept);
        recept.setName(name);
        recept.setDescription(description);
        return recept;
    }


    private List <Ingridient> ingridients = new ArrayList <>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public Integer getCategoryReceptId() {
        return categoryReceptId;
    }

    public void setCategoryReceptId(Integer categoryReceptId) {
        this.categoryReceptId=categoryReceptId;
    }

    public CategoryRecept getCategoryRecept() {
        if (categoryRecept != null) {
            return categoryRecept;
        }
        return  null;//по дао попробовать обратиться
    }

    public void setCategoryRecept(CategoryRecept categoryRecept) {
        this.categoryRecept=categoryRecept;
        this.categoryReceptId = categoryRecept.getId();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description=description;
    }

    public List <Ingridient> getIngridients() {
        return ingridients;
    }

    public void setIngridients(List <Ingridient> ingridients) {
        this.ingridients=ingridients;
    }

    @Override
    public String toString() {
        return "Recept{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", categoryRecept=" + categoryRecept.getName() +
                '}';
    }
}
