package IOStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutput {
    public static void main(String [] args) {
        try {
            FileInputStream fis = new FileInputStream("C:/MyJava/Source1.txt");
            FileOutputStream fos = new  FileOutputStream("c:/MyJava/Source2.txt");
            int n;
            while((n = fis.read()) != -1){
                fos.write((char)n);
            }
            fis.close();
            fos.close();
        }
        catch (FileNotFoundException e){
            System.out.println(e);
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
