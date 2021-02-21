package model;

public class Ingridient {

    private Integer id;
    private String item;
    private double count;
    private String unit;

    public static Ingridient create(String item, double count, String unit) {

        Ingridient ingridient = new Ingridient();
        ingridient.setItem(item);
        ingridient.setCount(count);
        ingridient.setUnit(unit);
        return ingridient;

    }

    private Ingridient() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id=id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item=item;
    }

    public double getCount() {
        return count;
    }

    public void setCount(double count) {
        this.count=count;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit=unit;
    }
}
