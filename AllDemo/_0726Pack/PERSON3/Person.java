package HomeWork.AllDemo._0726Pack.PERSON3;

import java.util.Objects;

public class Person {
    private String Name;
    private double Height;
    private String Weapon;
    private String Race;

    public Person(String name, double height, String weapon, String race) {
        Name = name;
        Height = height;
        Weapon = weapon;
        Race = race;
    }

    public void Show() {
        System.out.println("ÐÕÃû£º " + Name + " ; ÖÖ×å£º " + Race);
    }

    public void skill() {
        if ("ËïÎò¿Õ".equals(Name)) {
            System.out.println("ÆßÊ®¶þ±ä");
        } else if ("ÌÆÉ®".equals(Name)) {
            System.out.println("½ô¹¿Öä");
        } else if ("°×¹Ç¾«".equals(Name)) {
            System.out.println("¾ÅÒõ°×¹Ç×¦");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        if (person.Race.equals("Ñý×å")) {
            return false;
        }
        return Objects.equals(Race, person.Race);
    }


    public void setName(String name) {
        Name = name;
    }

    public void setHeight(double height) {
        Height = height;
    }

    public void setWeapon(String weapon) {
        Weapon = weapon;
    }

    public void setRace(String race) {
        Race = race;
    }

    public String getName() {
        return Name;
    }

    public double getHeight() {
        return Height;
    }

    public String getWeapon() {
        return Weapon;
    }

    public String getRace() {
        return Race;
    }
}
