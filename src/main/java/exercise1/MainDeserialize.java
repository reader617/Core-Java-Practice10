package exercise1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MainDeserialize {

	public static void main(String[] args) {
		Student s1 = null;
		try (FileInputStream file = new FileInputStream("./student.txt");) {
			ObjectInputStream obj = new ObjectInputStream(file);
			s1 = (Student) obj.readObject();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(s1);

	}

}
