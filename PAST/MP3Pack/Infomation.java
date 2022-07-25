package HomeWork.PAST.MP3Pack;

public class Infomation {
    String brand;
    double weight;
    String batteryType;
    double price;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setBatteryType(String batteryType) {
        this.batteryType = batteryType;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void show() {
        System.out.println("品牌：" + brand);
        System.out.println("重量：" + weight);
        System.out.println("电池类型：" + batteryType);
        System.out.println("价格：" + price);
    }
}
