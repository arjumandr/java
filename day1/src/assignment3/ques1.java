package assignment3;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ques1 {
	public static void main(String[] args) {
		File src = new File("//C://Users//VE00YN363//Desktop//spring//java//day1//src//assignment3//sample.txt");
		File dest = new File("/src/assignment3/dest.txt");
		try (FileReader fr = new FileReader(src);
	             FileWriter fw = new FileWriter(dest)) {

	            int ch;
	            while ((ch = fr.read()) != -1) {
	                fw.write(ch);
	            }

	            System.out.println("Character-by-character copy completed.");

	            // Check file sizes
	            System.out.println("Source size: " + src.length());
	            System.out.println("Copied size: " + dest.length());

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}
}
