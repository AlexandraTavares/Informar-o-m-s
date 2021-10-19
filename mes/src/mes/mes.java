package mes;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class mes {

	  public static void main(String[] args) {
		  Scanner ler = new Scanner(System.in);
		  String s;
		  System.out.printf("Informe uma data:\n");
		    s = ler.nextLine();

		  DateFormat df = new SimpleDateFormat ("dd/MM/yyyy");
		  Date dt = null;
		try {
			dt = df.parse (s);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  DateFormat df2 = new SimpleDateFormat ("MMMMM", new Locale ("pt", "BR"));
		  System.out.println (df2.format (dt));
	  }
	}