package HomeWork.AllDemo.ScorePack;

import java.util.Scanner;

public class Score {
    Scanner cin = new Scanner(System.in);
    double scoreOfjava;
    double scoreOfmath;
    double scoreOfphy;

    public Score() {
        System.out.print("Java³É¼¨£º");
        scoreOfjava = cin.nextDouble();
        System.out.print("Math³É¼¨£º");
        scoreOfmath = cin.nextDouble();
        System.out.print("Physics³É¼¨£º");
        scoreOfphy = cin.nextDouble();
    }

    public double Average() {
        return (scoreOfjava + scoreOfmath + scoreOfphy) / 3;
    }

    public double Sum() {
        return scoreOfmath + scoreOfjava + scoreOfphy;
    }
}
