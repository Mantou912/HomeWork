package HomeWork.PAST._0722Pack;

import java.util.Scanner;

public class CodeForTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //1、计算3个班，每个班4名学生的平均分以及3个班中的最高分是多少(平均分5，最高分10)
//        int[][] score = new int[3][4];
//        int[] ave = new int[3];
//        int maxS = 0;
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 4; j++) {
//                score[i][j] = input.nextInt();
//                ave[i] += score[i][j];
//                maxS = Math.max(score[i][j], maxS);
//            }
//            ave[i] /= 4;
//        }

        //2、编写冒泡排序的程序(15)
//        int[] arr = {15, 56, 85, 2, 0, 3, 59, 47, 98, 85, -12};
//        int len = arr.length;
//        for (int i = 0; i < len - 1; i++) {
//            for (int j = 0; j < len - i - 1; j++) {
//                if (arr[j + 1] < arr[j]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//        for (int x : arr) {
//            System.out.print(x + " ");
//        }

        //3、根据输入的行数，打印一个等腰三角形【10】
//        int flag = input.nextInt();
//        for (int i = 0; i < flag; i++) {
//            for (int j = flag - 1; j > i; j--) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < 2 * (i + 1) - 1; j++) {
//
//                System.out.print("*");
//            }
//            System.out.println("");
//        }

        //4、插入字符串至指定位置
//        System.out.print("原字符序列：");
//        char[] chars = {'a', 'b', 'c', 'e', 'f', 'p', 'u', 'z', ' '};
//        for (char aChar : chars) {
//            System.out.print(aChar + " ");
//        }
//        System.out.print("\n待插入的字符是：");
//        char flag = input.next().charAt(0);
//        System.out.print("插入字符的下标是：");
//        int locate = input.nextInt();
//        for (int i = chars.length - 1; i > locate; i--) {
//            char temp = chars[i];
//            chars[i] = chars[i - 1];
//            chars[i - 1] = temp;
//        }
//        chars[locate] = flag;
//        for (char aChar : chars) {
//            System.out.print(aChar + " ");
//        }

//        System.out.println("\t********\t&&&&1234^^^");
//        System.out.println("\t********\t&&&&\t^^^");
//        System.out.println("\t********\t&&&\t^^^");
//        System.out.println("\t********\t&&\t^^^");
//        System.out.println("\t*******\t&\t^^^");
//        System.out.println("\t一二三四五\t一二三\t^^^");
//        System.out.println("\t一二三四\t一二三\t^^^");
//        System.out.println("\t一二三\t一二三\t^^^");
//        System.out.println("\t一二\t一二三\t^^^");
//        System.out.println("\t一\t一二三\t^^^");

//        System.out.println("""
//                \t********\t&&&&1234^^^
//                \t********\t&&&&\t^^^
//                \t********\t&&&&\t^^^
//                \t********\t&&&\t^^^
//                \t*******\t&\t^^^
//                \t一二三四五\t一二三\t^^^
//                \t一二三四\t一二三\t^^^
//                \t一二三\t一二三\t^^^
//                \t一二\t一二三\t^^^
//                \t一\t一二三\t^^^
//                """);
    }
}
