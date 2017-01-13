/*
package TimeCalc;


import java.io.IOException;

public class SecondsYet {
	//This program calculates how many seconds you've spent [since your birth]
	//Accuracy +/- 60 seconds [Based on user input]

	public static void main(String[] args) throws IOException {
		Date bday = Date.takeIn("Enter Your Birthdate");
		Date tday = Date.takeIn("Enter Today's Date");
		int bm=bday.getM();
		int tm=tday.getM();
		int bd=bday.getD();
		int td=tday.getD();
		int ty=tday.getY();
		int by=bday.getY();
		
		/*java.util.Date dNow = new java.util.Date( );
	    SimpleDateFormat ft = new SimpleDateFormat ("dd/MM/yyyy");
	    System.out.println("Current Date: " + ft.format(dNow));*/
	//   }

	//}

