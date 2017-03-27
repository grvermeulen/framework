package Runner;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestNG runner = new TestNG();
		
		
		List<String> list = new ArrayList<String>();
		
		list.add("C:\\Users\\Guido\\Google Drive\\Add automation\\Framework\\test-output\\testng-failed.xml");
		
		
		
		runner.setTestSuites(list);
		
		runner.run();
	
		
	}

}
