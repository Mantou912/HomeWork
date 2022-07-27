package HomeWork.UPDATE._2727Pack.PET;

public class MainTest {
    public static void main(String[] args) {

        Master master = new Master();
        Pet pet = new Penguin();
        pet.setHealth(50);
        master.toHospital(pet);
        System.out.println(pet.getHealth());
    }
}
