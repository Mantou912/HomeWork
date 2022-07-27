package HomeWork.UPDATE._2727Pack.PET;

public class Master {
    public void toHospital(Pet pet) {
        if (pet.getHealth() < 60) {
            pet.Hospital();
        } else {
            System.out.println("³èÎïºÜ½¡¿µ...");
        }

    }
}
