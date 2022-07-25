package HomeWork.AllDemo.EatPack;

public class CheckOrder {
    public void check(Information[] client) {
        System.out.println("***查看餐袋***");
        System.out.println("序号\t订餐人\t餐品信息\t送餐日期\t地址\t\t总金额\t状态");
        for (int i = 0; i < client.length; i++) {
            if (client[i].name != null) {
                String time = client[i].times + "时";
                String pri = client[i].sumPrices + "元";
                String status = client[i].status == 0 ? "已完成" : "已预订";
                System.out.println((i + 1) + "\t" + client[i].name + "\t" + "\t" + client[i].dishMegs + "\t" + time + "\t" + client[i].addresses + "\t" + pri + "\t" + status);
            }
        }
        System.out.println("************");
    }
}
