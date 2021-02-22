package model;

public class CategoryRecept {
    private Integer id;
    private String name;

    public static CategoryRecept create(String name){
        CategoryRecept categoryRecept= new CategoryRecept();
        categoryRecept.setName(name);
        return categoryRecept;
    }

    private CategoryRecept() {
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
        return "CategoryRecept {" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
