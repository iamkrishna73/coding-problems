package IOStream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInput {
    public static  void main(String [] args){
        try {
            FileInputStream fis = new FileInputStream("c:/myJava/text.txt");
            int x;
            while(( x= fis.read()) != -1){
                System.out.print((char)x);
            }
            fis.close();
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
