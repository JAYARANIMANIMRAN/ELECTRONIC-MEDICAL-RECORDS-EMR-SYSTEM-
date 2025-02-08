package newhospital;

import java.sql.*;  


public class hospitaldatabase implements records {
    private static final String URL = "jdbc:mysql://localhost:3306/hospital";
    private static final String USER = "root";
    private static final String PASSWORD = "jaya@2005";

    public void addMedicalRecord(Medicalrecord record) throws SQLException {
        String sql = "INSERT INTO MedicalRecord (patient_id, record_date, record_type, notes) VALUES (?, ?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, record.getPatientId());
            stmt.setDate(2, new java.sql.Date(record.getRecordDate().getTime()));
            stmt.setString(3, record.getRecordType());
            stmt.setString(4, record.getNotes());
            stmt.executeUpdate();
        }
    }

    public void viewMedicalHistory(int patientId) {
        String sql = "SELECT * FROM MedicalRecord WHERE patient_id = ?";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, patientId);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println("Record ID: " + rs.getInt("record_id") + ", Notes: " + rs.getString("notes"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateDiagnosis(int recordId, String newDiagnosis) throws SQLException {
        String sql = "UPDATE Diagnosis SET diagnosis_name = ? WHERE record_id = ?";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, newDiagnosis);
            stmt.setInt(2, recordId);
            stmt.executeUpdate();
        }
    }

    public void deleteMedicalRecord(int recordId) throws SQLException {
        String sql = "DELETE FROM MedicalRecord WHERE record_id = ?";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, recordId);
            stmt.executeUpdate();
        }
    }

    public void generateReport(int patientId) {
        System.out.println("Generating report for patient ID: " + patientId);
        // Implement report generation logic here
    }
}

