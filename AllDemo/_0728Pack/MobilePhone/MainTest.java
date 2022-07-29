package HomeWork.AllDemo._0728Pack.MobilePhone;

public class MainTest {
    public static void main(String[] args) {
        AptitudeHandSet aptitudeHandSet = new AptitudeHandSet("I9100", "HTC");
        CommonHandSet commonHandSet = new CommonHandSet("G502C", "Sony");
        aptitudeHandSet.Info();
        aptitudeHandSet.NetWorkConn();
        aptitudeHandSet.Play(2, "Ð¡Ê±´ú");
        aptitudeHandSet.TakePictures();
        aptitudeHandSet.SendInfo();
        aptitudeHandSet.Call();
    }
}
