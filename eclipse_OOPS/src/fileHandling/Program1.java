package fileHandling;

import java.io.FileWriter;

public class Program1 {

	public static void main(String[] args) {
		// file writer

		try (FileWriter fw = new FileWriter("fileWriter.txt", true);) {

			fw.write("hello\n");
			fw.write("hii\n");

			System.out.println("file write successful ");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
