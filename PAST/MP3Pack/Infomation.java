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
        System.out.println("Ʒ�ƣ�" + brand);
        System.out.println("������" + weight);
        System.out.println("������ͣ�" + batteryType);
        System.out.println("�۸�" + price);
    }
}
