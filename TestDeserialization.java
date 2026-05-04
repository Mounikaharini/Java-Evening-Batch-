package Jan_Batch_2026;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestDeserialization {
	public static void main(String[] args) throws Exception {

	      FileInputStream fis = new FileInputStream("student.ser");
	      ObjectInputStream ois = new ObjectInputStream(fis);

	      Student s2 = (Student) ois.readObject();
	      ois.close();
	      fis.close();

	      System.out.println(s2.id + " " + s2.name);
	  }
}
