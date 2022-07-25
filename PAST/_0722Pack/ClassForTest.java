package HomeWork.PAST._0722Pack;

import java.util.Scanner;

public class ClassForTest {
    Scanner input = new Scanner(System.in);
    String name;
    int age;
    int height;
    int weight;

    public ClassForTest() {
//        System.out.print("请输入姓名");
//        name = input.next();
//        System.out.print("请输入年龄");
//        age = input.nextInt();
//        System.out.print("请输入身高");
//        height = input.nextInt();
//        System.out.print("请输入体重");
//        weight = input.nextInt();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void show() {
        System.out.println(name + " " + age + " " + height + " " + weight);
    }

    public int[] sort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j + 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public int max(int[] arr) {
        ClassForTest classForTest = new ClassForTest();
        arr = classForTest.sort(arr);
        return arr[0];
    }

    public int min(int[] arr) {
        ClassForTest classForTest = new ClassForTest();
        arr = classForTest.sort(arr);
        return arr[arr.length - 1];
    }

    public double average(int[] arr) {
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        return (double) (sum / arr.length);
    }
}
