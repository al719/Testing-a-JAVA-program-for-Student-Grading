package Implementation;

import java.io.FileNotFoundException;

public class main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		FileHandler filehandle = new FileHandler("D:\\Senior 2 - Semester 2\\Software Testing\\Project\\Test Input.txt");
//		filehandle.setPath("F:\\senior\\2nd\\Testing\\project\\phase1\\testing_prj\\src\\testing_prj\\Fa_BBTC10.txt");//F:\\senior\\2nd\\Testing\\project\\phase1\\testing_prj\\src\\testing_prj\\
		outputGenerator out = new outputGenerator(filehandle);
		out.generateOutputFile();
	}

}
