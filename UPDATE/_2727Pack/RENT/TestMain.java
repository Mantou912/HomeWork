package HomeWork.UPDATE._2727Pack.RENT;


import java.util.Scanner;

public class TestMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car BuckG = new Car("��BK5543", "BUCK", "BLACK", 1000, "�����GL8", 600);
        Car BuckL = new Car("��AK5678", "BUCK", "WHITE", 1500, "������", 300);
        Car BMW = new Car("��AH8585", "BMW", "RED", 2500, "550i", 500);
        Bus GoldCup = new Bus("��AS5455", "��", "WHITE", 5200, 16, 800);
        Bus GoldGragon = new Bus("��BS6542", "����", "BLUE", 10000, 16, 800);

        MoToVehicle[] moToVehicles = new MoToVehicle[5];
        moToVehicles[0] = new Car("��BK5543", "BUCK", "BLACK", 1000, "�����GL8", 600);
        moToVehicles[1] = new Car("��AK5678", "BUCK", "WHITE", 1500, "������", 300);
        moToVehicles[2] = new Car("��AH8585", "BMW", "RED", 2500, "550i", 500);
        moToVehicles[3] = new Bus("��AS5455", "��", "WHITE", 5200, 16, 800);
        moToVehicles[4] = new Bus("��BS6542", "����", "BLUE", 10000, 16, 800);

        System.out.println("��ӭ�������������޹�˾��");
        System.out.print("������Ҫ���޵�����: ");
        int Days = scanner.nextInt();
        System.out.print("������Ҫ���޵��������ͣ�1���γ�  2���ͳ���: ");
        int flag = scanner.nextInt();
        if (flag == 1) {
            System.out.print("������Ҫ���޵�����Ʒ�ƣ�1������  2����ˣ�: ");
            flag = scanner.nextInt();
            if (flag == 1) {
                System.out.println("��ѡ����Ǳ���550i");
                System.out.println("��������������ƺ��ǣ� " + BMW.getNo());
                BMW.CalcRent(Days);
            } else if (flag == 2) {
                System.out.print("��ѡ��γ����ͺţ�1�������GL8   2������������ ");
                flag = scanner.nextInt();
                if (flag == 1) {
                    System.out.println("��������������ƺ��ǣ� " + BuckG.getNo());
                    BuckG.CalcRent(Days);
                } else if (flag == 2) {
                    System.out.println("��������������ƺ��ǣ� " + BuckL.getNo());
                    BuckL.CalcRent(Days);
                }
            }
        } else if (flag == 2) {
            System.out.print("������Ҫ���޵�����Ʒ�ƣ�1����  2��������: ");
            flag = scanner.nextInt();
            if (flag == 1) {
                System.out.print("���������޵���λ���� ");
                flag = scanner.nextInt();
                System.out.println("��������������ƺ��ǣ� " + GoldCup.getNo());
                if (flag <= 16) {
                    GoldCup.CalcRent(Days);
                } else {
                    GoldCup.setRent(1500);
                    GoldCup.CalcRent(Days);
                }
            } else if (flag == 2) {
                System.out.print("���������޵���λ���� ");
                flag = scanner.nextInt();
                System.out.println("��������������ƺ��ǣ� " + GoldGragon.getNo());
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
