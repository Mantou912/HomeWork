package HomeWork.UPDATE._0801Pack.Dog;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        Dog dog1 = new Dog("123", "321");
        Dog dog2 = new Dog("456", "654");
        Dog dog3 = new Dog("789", "987");
        List<Object> list = new ArrayList<>();
        list.add(dog1);
        list.add(dog2);
        list.add(dog3);
        for (Object o : list) {
            Dog dog = (Dog) o;
            System.out.println(dog.getName() + "  " + dog.getStrain());
        }

        LinkedList<Object> linkedList = new LinkedList<>();
        linkedList.add(dog2);
        linkedList.add(dog3);
        linkedList.addFirst(dog1);
        for (Object o : linkedList
        ) {
            Dog dog = (Dog) o;
            System.out.println(dog.getName() + "  " + dog.getStrain());
        }
    }
}
