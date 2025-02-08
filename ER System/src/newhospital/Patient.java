package newhospital;

public class Patient {
	private int patientId;
    private String name;
    private String gender;

    public Patient(int patientId, String name, String gender) {
        this.patientId = patientId;
        this.name = name;
        this.gender = gender;
    }

    public int getPatientId() { return patientId; }
    public String getName() { return name; }
    public String getGender() { return gender; }
}
