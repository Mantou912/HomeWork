package HomeWork.UPDATE._0726Pack.PET;

public abstract class Pet {
    //私有化的内容是不能被继承的
    private String name;
    private int health;
    private int love;

    int a;   //默认修饰符修饰的内容 如果不和子类在同一个包下的话 是不可以被继承

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