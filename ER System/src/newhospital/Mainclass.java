package newhospital;

import java.util.Date;
import java.util.Scanner;

public class Mainclass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            hospitaldatabase emrDb = new hospitaldatabase();

            System.out.print("Enter Record ID: ");
            int recordId = scanner.nextInt();

            System.out.print("Enter Patient ID: ");
            int patientId = scanner.nextInt();

            scanner.nextLine(); // Consume newline

            System.out.print("Enter Notes: ");
            String notes = scanner.nextLine();

            Medicalrecord record = new GeneralMedicalRecord(recordId, patientId, new Date(), notes);
            emrDb.addMedicalRecord(record);
            System.out.println("Medical record added.");

            System.out.print("Enter Patient ID to view history: ");
            int viewPatientId = scanner.nextInt();
            emrDb.viewMedicalHistory(viewPatientId);

            System.out.print("Enter Record ID to update diagnosis: ");
            int updateRecordId = scanner.nextInt();

            scanner.nextLine(); // Consume newline
            System.out.print("Enter new diagnosis: ");
            String newDiagnosis = scanner.nextLine();
            emrDb.updateDiagnosis(updateRecordId, newDiagnosis);
            System.out.println("Diagnosis updated.");

            System.out.print("Enter Record ID to delete: ");
            int deleteRecordId = scanner.nextInt();
            emrDb.deleteMedicalRecord(deleteRecordId);
            System.out.println("Medical record deleted.");

            System.out.print("Enter Patient ID to generate report: ");
            int reportPatientId = scanner.nextInt();
            emrDb.generateReport(reportPatientId);
            System.out.println("Report generated.");

        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
