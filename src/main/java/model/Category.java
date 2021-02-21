package model;

public class Category {
    private Integer id;
    private String name;

    public static Category create(String name){
        Category category = new Category();
        category.setName(name);
        return category;
    }

    private Category() {
    }

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

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                '}';
    }
}
