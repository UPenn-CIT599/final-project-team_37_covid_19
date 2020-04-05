import java.util.ArrayList;
import java.util.HashMap;

/**
 * DataAnalysis class performs various analytic tests on outcomes data
 * read in from the patient dataset
 * @author cbusc
 *
 */
public class DataAnalysis {
	
	private ArrayList<Patient> patients;
	/**
	 * Constructor which initializes patients array list
	 * @param patients
	 */
	public DataAnalysis(ArrayList<Patient> patients)
	{
		this.patients = patients;
	}
	/**
	 * Gets patients
	 * @return patients
	 */
	public ArrayList<Patient> getPatients() {
		return patients;
	}
	/**
	 * Gets released patients
	 * @return releasedPatients
	 */
	public ArrayList<Patient> getReleasedPatients()
	{
		ArrayList<Patient> releasedPatients = new ArrayList<>();
		for (Patient p : patients)
		{
			if (p.getState().equals("released"))
			{
				releasedPatients.add(p);
			}
		}
		return releasedPatients;
	}
	/**
	 * Gets deceased patients
	 * @return deceasedPatients
	 */
	public ArrayList<Patient> getDeceasedPatients()
	{
		ArrayList<Patient> deceasedPatients = new ArrayList<>();
		for (Patient p : patients)
		{
			if (p.getState().equals("deceased"))
			{
				deceasedPatients.add(p);
			}
		}
		return deceasedPatients;
	}
	
	/**
	 * Maps age as decade to number released; data for population chart
	 * @return decade, numb released
	 */
	public HashMap<String, Integer> getAgeAsDecadeToNumReleased()
	{
	}
	/**
	 * Maps age as decade to number deceased; data for population chart
	 * @return decade, numb deceased
	 */
	public HashMap<String, Integer> getAgeAsDecadeToNumDeceased()
	{
	}
	
	/**
	 * Maps date to number infected; data for time series line chart
	 * @return date, number infected
	 */
	public HashMap<String, Integer> getDateToNumInfected()
	{
	}
	/**
	 * Maps date to no number released; data for time series line chart
	 * @return date, number released
	 */
	public HashMap<String, Integer> getDateToNumReleased()
	{
	}
	/**
	 * Maps date to number deceased; data for line chart
	 * @return date, number deceased
	 */
	public HashMap<String, Integer> getDateToNumDeceased()
	{
	}
	
	/**
	 * Maps gender to number released; data for unspecified chart
	 * @return gender, number released
	 */
	public HashMap<String, Integer> getGenderToNumberReleased()
	{
	}
	/**
	 * Maps gender to number deceased; data for unspecified chart
	 * @return gender, number deceased
	 */
	public HashMap<String, Integer> getGenderToNumberDeceased()
	{
	}
	
	/**
	 * Maps healthcare-exposure to number released; data for unspecified chart
	 * @return gender, number released
	 */
	public HashMap<Boolean, Integer> getHealthcareExposureToNumberReleased()
	{
	}
	/**
	 * Maps healthcare-exposure to number deceased; data for unspecified chart
	 * @return gender, number deceased
	 */
	public HashMap<Boolean, Integer> getHealthcareExposureToNumberDeceased()
	{
	}

	/**
	 * Utility method to calculate average age
	 * @param pArray
	 * @return average age
	 */
	public static double getAveAge(ArrayList<Patient> pArray) 
	{
		double sum = 0;
		int count = 0;         
		for (Patient p : pArray)
		{
			sum+= p.getAge();
			count++;
		}
		return sum / count;
	}
}
