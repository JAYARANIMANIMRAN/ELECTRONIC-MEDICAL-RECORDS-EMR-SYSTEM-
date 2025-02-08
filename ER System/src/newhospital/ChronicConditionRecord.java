package newhospital;
import java.util.Date;
public class ChronicConditionRecord extends Medicalrecord {

	private String conditionName;

	public ChronicConditionRecord(int recordId, int patientId, Date recordDate, String notes, String conditionName) {
		// TODO Auto-generated constructor stub
		 super(recordId, patientId, recordDate, notes);
	        this.conditionName = conditionName;
	}

	@Override
	public String getRecordType() {
		// TODO Auto-generated method stub
		return "Chronic Condition";
	}

}
