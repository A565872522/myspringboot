package entity;

public class Computer {
    private Integer cId;

    private String name;

    private String type;

    private Double price;

    public Computer(){
    }

    public Computer(Integer cId, String name, String type, Double price) {
        this.cId = cId;
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}