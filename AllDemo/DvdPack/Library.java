package HomeWork.AllDemo.DvdPack;


public class Library {
    int full = 6;
    int flag = 1;                           //从1开始
    String[] Name = new String[6];          //名称
    Boolean[] Status = new Boolean[6];      //状态，true可借false已借出
    int[] Date = new int[6];                //借出日期
    int[] Time = new int[6];                //借出次数
}
