package exercise2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopying {

	public static void main(String[] args) {
		File f = new File("./file.txt");
		BufferedReader reader = null;
		BufferedWriter bw = null;
		try {
			reader = new BufferedReader(new FileReader(f));
		
			String info = reader.readLine();
			FileWriter f2 = new FileWriter("./fileCopy.txt");
			bw = new BufferedWriter(f2);
			while(info != null) {
				info += "\n";
				bw.write(info);
				info = reader.readLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			reader.close();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
