package model;

import java.util.ArrayList;
import java.util.List;

public class Recept {

    private Integer id;

    private String name;
    private Category category;
    private String description;

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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category=category;
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
}
