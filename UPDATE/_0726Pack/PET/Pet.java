package HomeWork.UPDATE._0726Pack.PET;

public abstract class Pet {
    //˽�л��������ǲ��ܱ��̳е�
    private String name;
    private int health;
    private int love;

    int a;   //Ĭ�����η����ε����� �������������ͬһ�����µĻ� �ǲ����Ա��̳�

    protected int b;
    public int c;

    public Pet() {
    }

    public Pet(String name, int health, int love, int a) {
        this.name = name;
        this.health = health;
        this.love = love;
        this.a = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }

    public abstract void show();

    public abstract void print();

}