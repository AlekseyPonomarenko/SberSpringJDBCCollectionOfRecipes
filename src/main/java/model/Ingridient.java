package model;

public class Ingridient {

    private Integer id;
    private Integer receptId;
    private String item;
    private Integer count;
    private String unit;

    public static Ingridient create(String item, Integer count, String unit) {

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

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count=count;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit=unit;
    }


    public Integer getReceptId() {
        return receptId;
    }

    public void setReceptId(Integer receptId) {
        this.receptId=receptId;
    }

    @Override
    public String toString() {
        return "Ingridient{" +
                "item='" + item + '\'' +
                ", count=" + count +
                ", unit='" + unit + '\'' +
                '}';
    }
}
