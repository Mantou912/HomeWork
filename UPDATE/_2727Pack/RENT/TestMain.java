package HomeWork.UPDATE._2727Pack.RENT;


import java.util.Scanner;

public class TestMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car BuckG = new Car("京BK5543", "BUCK", "BLACK", 1000, "商务舱GL8", 600);
        Car BuckL = new Car("沪AK5678", "BUCK", "WHITE", 1500, "林荫大道", 300);
        Car BMW = new Car("京AH8585", "BMW", "RED", 2500, "550i", 500);
        Bus GoldCup = new Bus("京AS5455", "金杯", "WHITE", 5200, 16, 800);
        Bus GoldGragon = new Bus("京BS6542", "金龙", "BLUE", 10000, 16, 800);

        MoToVehicle[] moToVehicles = new MoToVehicle[5];
        moToVehicles[0] = new Car("京BK5543", "BUCK", "BLACK", 1000, "商务舱GL8", 600);
        moToVehicles[1] = new Car("沪AK5678", "BUCK", "WHITE", 1500, "林荫大道", 300);
        moToVehicles[2] = new Car("京AH8585", "BMW", "RED", 2500, "550i", 500);
        moToVehicles[3] = new Bus("京AS5455", "金杯", "WHITE", 5200, 16, 800);
        moToVehicles[4] = new Bus("京BS6542", "金龙", "BLUE", 10000, 16, 800);

        System.out.println("欢迎您来到汽车租赁公司！");
        System.out.print("请输入要租赁的天数: ");
        int Days = scanner.nextInt();
        System.out.print("请输入要租赁的汽车类型（1、轿车  2、客车）: ");
        int flag = scanner.nextInt();
        if (flag == 1) {
            System.out.print("请输入要租赁的汽车品牌（1、宝马  2、别克）: ");
            flag = scanner.nextInt();
            if (flag == 1) {
                System.out.println("您选择的是宝马550i");
                System.out.println("分配给您的汽车牌号是： " + BMW.getNo());
                BMW.CalcRent(Days);
            } else if (flag == 2) {
                System.out.print("请选择轿车的型号（1、商务舱GL8   2、林荫大道）： ");
                flag = scanner.nextInt();
                if (flag == 1) {
                    System.out.println("分配给您的汽车牌号是： " + BuckG.getNo());
                    BuckG.CalcRent(Days);
                } else if (flag == 2) {
                    System.out.println("分配给您的汽车牌号是： " + BuckL.getNo());
                    BuckL.CalcRent(Days);
                }
            }
        } else if (flag == 2) {
            System.out.print("请输入要租赁的汽车品牌（1、金杯  2、金龙）: ");
            flag = scanner.nextInt();
            if (flag == 1) {
                System.out.print("请输入租赁的座位数： ");
                flag = scanner.nextInt();
                System.out.println("分配给您的汽车牌号是： " + GoldCup.getNo());
                if (flag <= 16) {
                    GoldCup.CalcRent(Days);
                } else {
                    GoldCup.setRent(1500);
                    GoldCup.CalcRent(Days);
                }
            } else if (flag == 2) {
                System.out.print("请输入租赁的座位数： ");
                flag = scanner.nextInt();
                System.out.println("分配给您的汽车牌号是： " + GoldGragon.getNo());
                if (flag <= 16) {
                    GoldGragon.CalcRent(Days);
                } else {
                    GoldGragon.setRent(1500);
                    GoldGragon.CalcRent(Days);
                }
            }
        }
    }

}
