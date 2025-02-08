package newhospital;
import java.util.Date;
public class GeneralMedicalRecord extends Medicalrecord {

	public GeneralMedicalRecord(int recordId, int patientId, Date recordDate, String notes) {
        super(recordId, patientId, recordDate, notes) ;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getRecordType() {
		// TODO Auto-generated method stub
		return "General";
	}

}
