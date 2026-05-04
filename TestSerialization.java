package Jan_Batch_2026;

//serialization
import java.io.*;
class Student implements Serializable {
  int id;
  String name;

  Student(int id, String name) {
      this.id = id;
      this.name = name;
  }
}

public class TestSerialization {
  public static void main(String[] args) throws Exception {

      Student s1 = new Student(1, "John");
      FileOutputStream fos = new FileOutputStream("student.ser");
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(s1);
      oos.close();
      fos.close();
      System.out.println("Object serialized");
  }
}














