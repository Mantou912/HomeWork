package HomeWork.AllDemo._0728Pack.MobilePhone;

public class AptitudeHandSet extends HandSet implements TakePhoto, NetWork, PlayWiring {

    public AptitudeHandSet(String brand, String type) {
        super(brand, type);
    }

    public void SendInfo() {
        System.out.println("�ʼ��ѷ������Է�����~~~");
    }

    public void Call() {
        System.out.println("��Ƶͨ��������~~~");
    }

    public void Info() {
        System.out.println("�ͺ�: " + getType() + "Ʒ��: " + getBrand());
    }

    public void NetWorkConn() {
        System.out.println("�Ѿ������ƶ���������~~~");
    }

    public void Play(int content, String str) {
        switch (content) {
            case 1 -> System.out.println("��ʼ�������֡�" + str + "��~~~");
            case 2 -> System.out.println("��ʼ������Ƶ��" + str + "��~~~");
        }
    }

    public void TakePictures() {
        System.out.println("������ɣ�����ͼ����~~~");
    }
}
