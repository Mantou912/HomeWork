package HomeWork.AllDemo._0728Pack.MobilePhone;

public class AptitudeHandSet extends HandSet implements TakePhoto, NetWork, PlayWiring {

    public AptitudeHandSet(String brand, String type) {
        super(brand, type);
    }

    public void SendInfo() {
        System.out.println("邮件已发送至对方邮箱~~~");
    }

    public void Call() {
        System.out.println("视频通话连接中~~~");
    }

    public void Info() {
        System.out.println("型号: " + getType() + "品牌: " + getBrand());
    }

    public void NetWorkConn() {
        System.out.println("已经启用移动数据网络~~~");
    }

    public void Play(int content, String str) {
        switch (content) {
            case 1 -> System.out.println("开始播放音乐《" + str + "》~~~");
            case 2 -> System.out.println("开始播放视频《" + str + "》~~~");
        }
    }

    public void TakePictures() {
        System.out.println("拍照完成，处理图像中~~~");
    }
}
