package HomeWork.AllDemo._0728Pack.Door;

public class AntiTheftDoor extends Door implements Lock, DoorBell {
    void OpenDoor() {
        System.out.println("开门~~~");
    }

    void CloseDoor() {
        System.out.println("关门~~~");
    }

    public void OpenLock() {
        System.out.println("解锁~~~");
    }

    public void CloseLock() {
        System.out.println("上锁~~~");
    }

    public void TakePhoto() {
        System.out.println("拍照存档！");
    }
}
