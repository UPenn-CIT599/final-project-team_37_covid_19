import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * WriteToCSV is responsible for writing processed data to a .csv file
 * @author cbusc
 *
 */
public class WriteToCSV {
	
	private DataAnalysis analysis;

	public WriteToCSV(DataAnalysis analysis)
	{
		this.analysis = analysis;
	}
	/**
	 * Writes out pertinent data to .csv file in 
	 * preparation for classification
	 */
	public void write()
	{
		try
		{
			FileWriter fw = new FileWriter("PatientInfoClean");
			PrintWriter out = new PrintWriter(fw);
			
			//Get patient ArrayList
			ArrayList<Patient> patients = analysis.getPatients();
			out.print("Gender," + "Age," + "AgeAsDecade," + "Comorbid," + "HealthcareRelatedExposure," + "SymptomOnsetDate," + "ConfirmedDate," + "ReleasedDate," + "DeceasedDate," + "State\n");
			for (Patient p : patients)
			{
				out.print(p.getGender() + "," + p.getAge() + "," + p.getAgeAsDecade() + "," + p.getComorbid() + "," + p.getHealthcareRelatedExposure() 
				+ "," + p.getSymptomOnsetDate() + "," + p.getConfirmedDate() + "," + p.getReleasedDate() + "," + p.getDeceasedDate() + "," + p.getState() + "\n");
			}	
			out.flush();
			out.close();
			System.out.println("You have written cleaned data to 'PatientInfoClean.csv'");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
