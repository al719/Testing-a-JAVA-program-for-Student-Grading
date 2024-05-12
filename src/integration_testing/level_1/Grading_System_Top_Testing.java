package integration_testing;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sun.tools.javac.Main;

import testing_prj.FileHandler;
import testing_prj.main;

class Grading_System_Top_Testing {

	
	@Test
	void test1() throws Exception {
		String userInput = String.format("F:\\senior\\2nd\\Testing\\project\\phase1\\phase2\\test cases\\Fa_BBTC01.txt");
        ByteArrayInputStream bais = new ByteArrayInputStream(userInput.getBytes());

        System.setIn(bais);
        
        File file = new File("F:\\senior\\2nd\\Testing\\project\\phase1\\phase2\\test cases\\Fa_BBTC01.txt");
		FileReader FR1 = new FileReader(file);
        BufferedReader BR1 = new BufferedReader(FR1);
        String[] subjectProb1 = BR1.readLine().split(",");
        String subjectName = "Subject Name: "+subjectProb1[0];
        String maxMArk = " Max Mark: "+subjectProb1[2];
        
        //FileOutputStream baos = new FileOutputStream(subjectProb[0]+".txt");
        //ByteArrayOutputStream baos = new ByteArrayOutputStream();
        //PrintStream printStream = new PrintStream(baos);
        //System.setOut(printStream);
		main.main(null);
		File myfile = new File("AdvancedAlgorithms.txt");
		///////////////////////////////////////////////////////////////////////////////////
		/////////////////// check output file is correctly generated    ///////////////////
		///////////////////////////////////////////////////////////////////////////////////
		assertTrue(myfile.exists());
		
		FileReader FR2 = new FileReader(myfile);
		Scanner scanner = new Scanner(myfile);
        //BufferedReader BR2 = new BufferedReader(FR2);
        String firstLine = scanner.nextLine();
		String[] subjectProb = firstLine.split("\t");
        
        
		///////////////////////////////////////////////////////////////////////////////////
		/////////////////////////     check subject validation    /////////////////////////
		///////////////////////////////////////////////////////////////////////////////////
        assertEquals(subjectName, subjectProb[0]);
        assertEquals(maxMArk, subjectProb[2]);   
		
	}
	@Test
	void test2() throws Exception {
		String userInput = String.format("F:\\senior\\2nd\\Testing\\project\\phase1\\phase2\\test cases\\Fa_BBTC02.txt");
        ByteArrayInputStream bais = new ByteArrayInputStream(userInput.getBytes());

        System.setIn(bais);
        
        File file = new File("F:\\senior\\2nd\\Testing\\project\\phase1\\phase2\\test cases\\Fa_BBTC02.txt");
		FileReader FR1 = new FileReader(file);
        BufferedReader BR1 = new BufferedReader(FR1);
        String[] subjectProb1 = BR1.readLine().split(",");
        String subjectName = "Subject Name: "+subjectProb1[0];
        String maxMArk = " Max Mark: "+subjectProb1[2];
        
        //FileOutputStream baos = new FileOutputStream(subjectProb[0]+".txt");
        //ByteArrayOutputStream baos = new ByteArrayOutputStream();
        //PrintStream printStream = new PrintStream(baos);
        //System.setOut(printStream);
		main.main(null);
		File myfile = new File("DataStructure.txt");
		///////////////////////////////////////////////////////////////////////////////////
		/////////////////// check output file is correctly generated    ///////////////////
		///////////////////////////////////////////////////////////////////////////////////
		assertTrue(myfile.exists());
		
		FileReader FR2 = new FileReader(myfile);
        BufferedReader BR2 = new BufferedReader(FR2);
        String[] subjectProb = BR2.readLine().split("\t");
        
        
		///////////////////////////////////////////////////////////////////////////////////
		/////////////////////////     check subject validation    /////////////////////////
		///////////////////////////////////////////////////////////////////////////////////
        assertEquals(subjectName, subjectProb[0]);
        assertEquals(maxMArk, subjectProb[2]);   

		
	}


}
