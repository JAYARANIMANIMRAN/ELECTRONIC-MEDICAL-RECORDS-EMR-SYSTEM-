package newhospital;
import java.util.Date;
import java.io.Serializable;

public abstract class Medicalrecord {
	 private int recordId;
	    private int patientId;
	    private Date recordDate;
	    private String notes;

	    public Medicalrecord(int recordId, int patientId, Date recordDate, String notes) {
	        this.recordId = recordId;
	        this.patientId = patientId;
	        this.recordDate = recordDate;
	        this.notes = notes;
	    }

	    public int getRecordId() { return recordId; }
	    public int getPatientId() { return patientId; }
	    public Date getRecordDate() { return recordDate; }
	    public String getNotes() { return notes; }

	    public abstract String getRecordType();
	}
	
