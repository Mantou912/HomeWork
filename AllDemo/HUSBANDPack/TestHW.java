package HomeWork.AllDemo.HUSBANDPack;

public class TestHW {
    public static void main(String[] args) {

        Husband husband = new Husband();
        Wife wife = new Wife();

        husband.wife = new Wife(wife);
        wife.husband = new Husband(husband);

        husband.getInfo();
        wife.getInfo();

    }
}
