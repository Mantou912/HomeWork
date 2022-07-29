package HomeWork.AllDemo._0728Pack.MobilePhone;

public class CommonHandSet extends HandSet implements PlayWiring {
    public CommonHandSet(String brand, String type) {
        super(brand, type);
    }

    public void SendInfo() {
        System.out.println("文字信息发送完成");
    }

    public void Call() {
        System.out.println("语音通话连接中~~~");
    }

    public void Info() {
        System.out.println("型号: " + getType() + "品牌: " + getBrand());
    }

    public void Play(int content, String str) {
        switch (content) {
            case 1 -> System.out.println("开始播放音乐《" + str + "》~~~");
            case 2 -> System.out.println("开始播放视频《" + str + "》~~~");
        }
    }
}
