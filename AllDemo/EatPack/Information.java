package HomeWork.AllDemo.EatPack;

public class Information {
    String name;                            //订餐人
    String dishMegs;                        //菜品名
    int num;                                //菜品份数
    int times;               //送餐时间//10-20
    String addresses;     //送餐地址
    int status;              //订单状态//0代表已完成，1代表已预定
    double sumPrices;     //总金额

    public Information() {
    }

    public void setName(String n) {
        name = n;
    }

    public void setDishMegs(String n) {
        dishMegs = n;
    }

    public void setNum(int n) {
        num = n;
    }

    public void setTimes(int n) {
        times = n;
    }

    public void setAddresses(String n) {
        addresses = n;
    }

    public void setStatus(int n) {
        status = n;
    }

    public void setSumPrices(double n) {
        sumPrices = n;
    }

    public void Delete() {
        name = null;
        dishMegs = null;
        addresses = null;
        num = 0;
        times = 0;
        status = 0;
        sumPrices = 0;
    }
}
