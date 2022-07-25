package HomeWork.PAST._0722Pack;

import java.util.Scanner;

public class CodeForClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float d = .14f;
//        int data = 100;
//        int result = (data * 10 + 5) / 2 + (int) 3.14159;
//        System.out.println(result);
//        System.out.println("请输入年龄");
//        int age = input.nextInt();
//        System.out.println("年龄为:" + age);
//        String brand = new String("爱国者F928");
//        double weight = 12.4;
//        String type = new String("内置锂电池");
//        int price = 499;
//        System.out.print("品牌:" + brand + "\n" + "重量:" + weight + "\n" + "型号:" + type + "\n" + "价格:" + price + "\n");
//        int a = 12;
//        int b = 4;
//        String str = a > b ? "你好" : "不好";
//        System.out.print(str + "\n");
//        int money=0;
//        money = input.nextInt();
//        if(money>500){
//            System.out.print("你购买了车、房");
//        }
//        else{
//            System.out.print("四八");
//        }
//        int scoreOfjava = 0;
//        int scoreOfmusic = 0;
//        System.out.print("Java成绩：");
//        scoreOfjava = input.nextInt();
//        System.out.print("Music成绩：");
//        scoreOfmusic = input.nextInt();
//        if ((scoreOfjava > 98 && scoreOfmusic > 80) || (scoreOfjava == 100 && scoreOfmusic > 70)) {
//            System.out.print("给你MP4");
//        } else {
//            System.out.print("给你个惊喜");
//        }
//        System.out.println("请确认分数");
//        double score = input.nextDouble();
//        if (score >= 90) {
//            System.out.print("你很优秀");
//        } else if (score >= 80) {
//            System.out.print("你是良好");
//        } else if (score >= 60) {
//            System.out.print("你及格了");
//        } else {
//            System.out.print("你不及格");
//        }
//        System.out.println("请输入成绩");
//        int score = input.nextInt();
//        if (score < 10) {
//            System.out.println("请输入性别");
//            String sex = input.next();
//            if ("男".equals(sex)) {
//                System.out.println("男子组");
//            } else {
//                System.out.println("女子组");
//            }
//        } else {
//            System.out.println("See You Next Year!");
//        }
//        int mc= input.nextInt();
//        switch (mc){
//            case 1:
//                System.out.println("夏令营");
//                break;
//            case 2:
//                System.out.println("电脑");
//                break;
//            case 3:
//                System.out.println("硬盘");
//                break;
//            default:
//                System.out.println("No");
//        }
//        int tel=input.nextInt();
//        switch (tel){
//            case 1:
//                System.out.println("Calling Dad");
//                break;
//            case 2:
//                System.out.println("Calling Mom");
//                break;
//            case 3:
//                System.out.println("Calling GrandPa");
//                break;
//            case 4:
//                System.out.println("Calling GrandMom");
//                break;
//            default:
//                System.out.println("No");
//        }
//        System.out.println("Sorry!The subscriber you dialed can not be connected for the moment, please redial later. ");

//        System.out.print("请输入消费金额：");
//        int sum = input.nextInt();
//        System.out.println("是否参加优惠换购活动");
//        System.out.println("1:满50，加2元换购百事");
//        System.out.println("2:满100，加3元换购农夫山泉");
//        System.out.println("3:满100，加10元");
//        System.out.println("4:满200，加10元");
//        System.out.println("5:满200，加20元");
//        System.out.print("0:不换购" + "\n" + "请选择:");
//        switch (input.nextInt()) {
//            case 1:
//                if(sum>=50) {
//                    sum += 2;
//                    System.out.println("本次消费总金额:"+(double)sum);
//                    System.out.println("百事可乐");
//                }
//                break;
//            case 2:
//                if(sum>=100) {
//                    sum += 3;
//                    System.out.println("本次消费总金额:"+(double)sum);
//                    System.out.println("可乐500mL");
//                }
//                break;
//            case 3:
//                if(sum>=100) {
//                    sum += 10;
//                    System.out.println("本次消费总金额:"+(double)sum);
//                    System.out.println("5kg面粉");
//                }
//                break;
//            case 4:
//                if(sum>=200) {
//                    sum += 10;
//                    System.out.println("本次消费总金额:"+(double)sum);
//                    System.out.println("苏泊尔炒锅");
//                }
//                break;
//            case 5:
//                if(sum>=50) {
//                    sum += 20;
//                    System.out.println("本次消费总金额:"+(double)sum);
//                    System.out.println("爽肤水");
//                }
//                break;
//            default:
//        }

//        int age = input.nextInt();
//        if (age < 6) {
//            System.out.println("儿童");
//        } else if (age < 13) {
//            System.out.println("少儿");
//        } else if (age < 17) {
//            System.out.println("青少年");
//        } else if (age < 35) {
//            System.out.println("青年");
//        } else if (age < 50) {
//            System.out.println("中年");
//        } else {
//            System.out.println("中老年");
//        }

//        int a, b, c;
//        a = input.nextInt();
//        b = input.nextInt();
//        c = input.nextInt();
//        a = a > b ? a : b;
//        a = a > c ? a : c;
//        System.out.println(a);

//        int i = 0;
//        while (i <= 50) {
//            System.out.println(2*i++);
//        }

//        int i = 0;
//        int num = 25;
//        while (num <= 100) {
//            num *= 1.25;
//            i++;
//        }
//        System.out.println(i+" "+num);

//        int i = 1;
//        int num = 0;
//        while (i <= 100) {
//            if (i % 3 != 0) {
//                num += i;
//            }
//            i++;
//        }
//        System.out.println(num);

//        System.out.println("MyShopping管理系统 > 购物结算");
//        System.out.println("**************************************");
//        System.out.println("请选择购买的商品编号：");
//        System.out.println("1.T 恤  2.网球鞋  3.网球拍");
//        System.out.println("**************************************");
//        String chs = "y";
//        while (chs.equals("y")) {
//            System.out.print("请输入商品编号: ");
//            int num = input.nextInt();
//            switch (num) {
//                case 1:
//                    System.out.println("T 恤    ￥245.0");
//                    break;
//                case 2:
//                    System.out.println("网球鞋    ￥1500.0");
//                    break;
//                case 3:
//                    System.out.println("网球拍    ￥3000.0");
//                    break;
//                default:
//                    System.out.println("");
//            }
//            System.out.print("是否继续(y/n)");
//            chs = input.next();
//        }
//        System.out.println("程序结束！");

//        System.out.print("输入学生姓名：");
//        String name = input.next();
//        double num = 0;
//        for (int i = 0; i < 5; i++) {
//            System.out.print("请输入5门功课中第" + (i + 1) + "门课的成绩：");
//            num += input.nextInt();
//        }
//        System.out.println(name + "的平均分是：" + num / 5);

//        double j = 0;
//        for (int i = 0; i < 10; i++) {
//            System.out.print("请输入第" + (i + 1) + "位顾客的年龄：");
//            int age = input.nextInt();
//            if (age >= 30) {
//                j++;
//            }
//        }
//        System.out.println("30岁以下的比例是：" + (10.0 - j) / 10 * 100 + "%");
//        System.out.println("30岁以上的比例是：" + j / 10 * 100 + "%");

//        System.out.print("输入学生姓名：");
//        String name = input.next();
//        double num = 0;
//        int judge = 0;
//        for (int i = 0; i < 5; i++) {
//            System.out.print("请输入5门功课中第" + (i + 1) + "门课的成绩：");
//            judge = input.nextInt();
//            if (judge < 0) {
//                System.out.println("抱歉，分数录入错误，请重新进行录入！");
//                break;
//            }
//            num += judge;
//        }
//        if (judge >= 0) {
//            System.out.println(name + "的平均分是：" + num / 5);
//        }

//        int num = 0;
//        for (int i = 1; i <= 10; i++) {
//            num += i;
//            if (num > 20) {
//                System.out.println(i + " " + num);
//                break;
//            }
//        }

//        System.out.print("输入班级总人数：");
//        int num = input.nextInt();
//        int judge = 0;
//        for (int i = 0; i < 5; i++) {
//            System.out.print("请输入第" + (i + 1) + "位学生的成绩：");
//            num = input.nextInt();
//            if (num > 80)
//                judge++;
//        }
//        System.out.println("80分以上的学生人数是：" + judge);
//        System.out.println("80分以上的学生所占的比例为：" + (double) judge / 5 * 100 + "%");

//
//        String[] name = new String[5];
//
//        for (int i = 0; i < 5; i++) {
//            name[i] = input.next();
//        }
//        for (String x : name) {
//            System.out.print(x + " ");
//        }

//        int[] arr = new int[5];
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("请输入第" + (i + 1) + "名同学的成绩");
//            arr[i] = input.nextInt();
//            sum += arr[i];
//        }
//        System.out.println("五名同学的的平均分为:" + (double) sum / 5 + "分");

//        int[] arr = {8, 4, 2, 1, 23, 344, 12};
//        int sum = 0;
//        //
//        for (int x : arr) {
//            System.out.print(x + " ");
//            sum += x;
//        }
//        System.out.println(sum);
//        //
//        sum = input.nextInt();
//        int judge = 0;
//        for (int x : arr) {
//            if (x == sum) {
//                System.out.println("数列中包含该数");
//                break;
//            }
//            judge++;
//        }
//        if (judge == arr.length && sum != arr[arr.length - 1]) {
//            System.out.println("数列中不包含该数");
//        }

//        double[] price = new double[5];
//        double sum1 = 0;
//        System.out.println("请输入会员本月的消费记录");
//        for (int i = 0; i < price.length; i++) {
//            System.out.print("请输入第"+(i+1)+"笔购物金额：");
//            price[i] = input.nextDouble();
//            sum1 += price[i];
//        }
//        System.out.println("");
//        System.out.println("序号" + "              " + "金额（元）");
//        for (int i = 0; i < price.length; i++) {
//            System.out.println(" "+(i + 1) + "                " + price[i]);
//        }
//        System.out.println("总金额" + "             " + sum1);

//        int[] arr = new int[10];
//        for (int i = 0; i < args.length; i++) {
//            arr[i] = input.nextInt();
//        }
//        int[] judge = {arr[0], 0};
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > judge[0]) {
//                judge[0] = arr[i];
//                judge[1] = i;
//            }
//        }
//        System.out.print(judge[0] + "  " + judge[1]);

//        int[] arr = new int[3];
//        int[] jud1 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//        int[] jud0 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//        arr[0] = input.nextInt();
//        arr[1] = input.nextInt();
//        arr[2] = input.nextInt();
//        if (arr[0] % 4 == 0 && arr[0] % 100 != 0 || (arr[0] % 400 == 0)) {
//            arr[0] = 1;//闰年
//        } else {
//            arr[0] = 0;//非闰年
//        }
//        int sum = 0;
//        switch (arr[0]) {
//            case 1:
//                for (int i = 1; i < arr[1]; i++) {
//                    sum += jud1[i - 1];
//                }
//                sum += arr[2];
//                break;
//            case 0:
//                for (int i = 1; i < arr[1]; i++) {
//                    sum += jud0[i - 1];
//                }
//                sum += arr[2];
//                break;
//        }
//        System.out.print(sum);

//        int[] jud1 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//        Arrays.sort(jud1);
//        int index = Arrays.binarySearch(jud1, 31);
//        System.out.print(index);

//        System.out.println("请输入家店的价格");
//        int[] price = new int[4];
//        for (int i = 0; i < price.length; i++) {
//            System.out.print("第" + (i + 1) + "家店的价格：");
//            price[i] = input.nextInt();
//        }
//        Arrays.sort(price);
//        System.out.print("最低的价格是：" + price[0]);

//        int[] list = new int[6];
//        list[0] = 12;
//        list[1] = 7;
//        list[2] = 9;
//        list[3] = 102;
//        list[4] = 22;
//        int index = list.length - 1;
//        System.out.print("请输入一个整数：");
//        int n = input.nextInt();
//        for (int i = 0; i < list.length; i++) {
//            //判断输入的值   n  是否有大于list[i]
//            if (n > list[i]) {
//                index = i;
//                break;
//            }
//        }
//        for (int i = list.length - 1; i > index; i--) {
//            list[i] = list[i - 1];
//        }
//        list[index] = n;
//        System.out.println("下标是：" + index);
//        System.out.println("值是：" + n);
//        System.out.println("插入后的值是：");
//        for (int j : list) {
//            System.out.print(j + " ");
//        }

//        int[][] arr = new int[5][5];
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                arr[i][j] = input.nextInt();
//            }
//        }
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//        }

//        int score = 0;
//        int sum = 0;
//        for (int j = 1; j <= 3; j++) {
//            System.out.println("请输入第" + j + "个班级的成绩");
//            sum = 0;
//            for (int i = 1; i <= 4; i++) {
//                System.out.print("请输入第" + i + "个学生的成绩");
//                score = input.nextInt();
//                sum += score;
//            }
//            System.out.println("第" + j + "个班级的平均分是：" + sum / 4);
//        }

//        for(int i=5;i>0;i--){
//            for(int j=0;j<2*i-1;j++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }

//        for (int i = 0; i < 5; i++) {
//            for (int j = 4; j > i; j--) {
//                System.out.print("#");
//            }
//            for (int j = 0; j < 2 * (i + 1) - 1; j++) {
//
//                System.out.print("*");
//            }
//            System.out.println("");
//        }

//        for (int i = 1; i <= 9; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j + "*" + i + "=" + i * j + "  ");
//            }
//            System.out.println("");
//        }

//        int[] arr = {15, 56, 85, 2, 0, 3, 59, 47, 98, 85,-12};
//        int len = arr.length;
//        for (int i = 0; i < len-1; i++) {
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

//        int[] arr = new int[5];
//        System.out.println("请输入五名学员的成绩");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = input.nextInt();
//        }
//
//        int len = arr.length;
//        for (int i = 0; i < len - 1; i++) {
//            for (int j = 0; j < len - i - 1; j++) {
//                if (arr[j + 1] > arr[j]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//        System.out.println("五名学员的成绩排序为：");
//        for (int x : arr) {
//            System.out.print(x + " ");
//        }

//        int judge = 0;
//        for (int i = 0; i < 3; i++) {
//            int sum = 0;
//            int temp = 0;
//            System.out.println("请输入第" + (i + 1) + "个班级的成绩");
//            for (int j = 0; j < 4; j++) {
//                System.out.print("第" + (j + 1) + "个学员的成绩:");
//                temp = input.nextInt();
//                sum += temp;
//                if (temp < 85) {
//                    continue;
//                }
//                judge++;
//            }
//            System.out.println("第" + (i + 1) + "个班级参赛学员的平均分是:" + (double) sum / 4);
//            System.out.println("");
//        }
//        System.out.println("成绩85分以上的学员人数有" + judge + "人");


//        int sum = 0;
//        String judge;
//        for (int i = 0; i < 5; i++) {
//            System.out.println("\n" + "欢迎光临第" + (i + 1) + "家专卖店");
//            for (; ; ) {
//                System.out.print("要离开吗（y/n）?");
//                judge = input.next();
//                if ("n".equals(judge)) {
//                    System.out.println("买了一件衣服");
//                    sum++;
//                } else if ("y".equals(judge)) {
//                    System.out.println("离店结账");
//                    break;
//                }
//            }
//        }
//        System.out.println("\n" + "总共买了" + sum + "件衣服");

        ClassForTest classForTest = new ClassForTest();
//        classForTest.show();
//        classForTest.setName("张杰");
//        classForTest.setAge(21);
//        classForTest.setHeight(177);
//        classForTest.setWeight(70);
//        classForTest.show();
        int[] arr = {15, 56, 85, 2, 0, 3, 59, 47, 98, 85, -12};
        arr = classForTest.sort(arr);
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println("\n最大值：" + classForTest.max(arr));
        System.out.println("最小值：" + classForTest.min(arr));
        System.out.println("平均值：" + classForTest.average(arr));

    }
}
