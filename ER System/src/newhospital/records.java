package newhospital;

import java.sql.SQLException;

public interface records {
    void viewMedicalHistory(int patientId);
    void updateDiagnosis(int recordId, String newDiagnosis) throws SQLException;
    void generateReport(int patientId);
}
