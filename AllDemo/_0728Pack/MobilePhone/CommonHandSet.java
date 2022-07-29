package HomeWork.AllDemo._0728Pack.MobilePhone;

public class CommonHandSet extends HandSet implements PlayWiring {
    public CommonHandSet(String brand, String type) {
        super(brand, type);
    }

    public void SendInfo() {
        System.out.println("������Ϣ�������");
    }

    public void Call() {
        System.out.println("����ͨ��������~~~");
    }

    public void Info() {
        System.out.println("�ͺ�: " + getType() + "Ʒ��: " + getBrand());
    }

    public void Play(int content, String str) {
        switch (content) {
            case 1 -> System.out.println("��ʼ�������֡�" + str + "��~~~");
            case 2 -> System.out.println("��ʼ������Ƶ��" + str + "��~~~");
        }
    }
}
