package HomeWork.AllDemo._0728Pack.MobilePhone;

public abstract class HandSet {
    private String Brand;

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    private String Type;

    public HandSet(String brand, String type) {
        Brand = brand;
        Type = type;
    }

    public abstract void SendInfo();

    public abstract void Call();

    public abstract void Info();
}
