package fileDat;

public class ReadLog {
//Prints the External Version Log 
	public void main()
			throws java.io.IOException
	{
		FileReader read = new FileReader();
		read.checkedShowFile("Log.txt");		
	}

}
