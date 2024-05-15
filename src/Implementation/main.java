package Implementation;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		FileHandler filehandle = new FileHandler(s.nextLine());
//		filehandle.setPath("F:\\senior\\2nd\\Testing\\project\\phase1\\testing_prj\\src\\testing_prj\\Fa_BBTC10.txt");//F:\\senior\\2nd\\Testing\\project\\phase1\\testing_prj\\src\\testing_prj\\
		outputGenerator out = new outputGenerator(filehandle);
		out.generateOutputFile();
	}

}
