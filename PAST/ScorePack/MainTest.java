package HomeWork.PAST.ScorePack;

public class MainTest {
    public static void main(String[] args) {
        Score score = new Score();
        System.out.println("平均分：" + score.Average());
        System.out.println("总分为：" + score.Sum());
    }
}
