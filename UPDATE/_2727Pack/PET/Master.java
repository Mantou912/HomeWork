package HomeWork.UPDATE._2727Pack.PET;

public class Master {
    public void toHospital(Pet pet) {
        if (pet.getHealth() < 60) {
            pet.Hospital();
        } else {
            System.out.println("����ܽ���...");
        }
    }

    public void play(Pet pet) {
        if (pet instanceof Dog dog) {
            dog.catchingFlyDisc();
        } else if (pet instanceof Penguin penguin) {
            penguin.swimming();
        }
    }
}
