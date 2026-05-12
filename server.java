package Jan_Batch_2026;

//server program
import java.io.*;
import java.net.*;
public class MyServer {
  public static void main(String[] args) {
      try {
          ServerSocket ss = new ServerSocket(5000);
          System.out.println("Server is waiting...");

          Socket s = ss.accept();  // waits for client
          System.out.println("Client connected");

          DataInputStream dis = new DataInputStream(s.getInputStream());
          String str = dis.readUTF();
          System.out.println("Client says: " + str);

          ss.close();
          
          
      } catch (Exception e) {
          System.out.println(e);
      }}}
