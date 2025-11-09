public class Cardiologist extends HealthProfessional {
    private String specializedEquipment;

    public Cardiologist() {
        super();
        this.specializedEquipment = "ECG Machine";
    }

    public Cardiologist(int id, String name, String department, String specializedEquipment) {
        super(id, name, department);
        this.specializedEquipment = specializedEquipment;
    }

    @Override
    public void printDetails() {
        System.out.println("=== Health Professional Type: Cardiologist ===");
        super.printDetails();
        System.out.println("Specialized Equipment: " + this.specializedEquipment);
        System.out.println("-----------------------------------------------------");
    }

    public String getSpecializedEquipment() {
        return specializedEquipment;
    }

    public void setSpecializedEquipment(String specializedEquipment) {
        this.specializedEquipment = specializedEquipment;
    }
}