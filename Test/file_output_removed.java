package Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;

public class file_output_removed {

    public static void main(String [] args) {
        String path1 = "D:/Chrome downloads/file_one.csv";
        String path2 = "D:/Chrome downloads/file_two.csv";
        try {
            BufferedReader reader1 = new BufferedReader(new FileReader(path1));
            BufferedReader reader2 = new BufferedReader(new FileReader(path2));
            BufferedWriter writer = Files.newBufferedWriter(Paths.get("D:/Chrome downloads/file_output_removed.csv"));
            HashSet<String> setValues = new HashSet<>();
            String line1 = reader1.readLine();
            String line2 = reader2.readLine();

            while (line1 != null) {
                setValues.add(line1.toString());
                line1 = reader1.readLine();
            }
            while (line2 != null) {
                if (setValues.contains(line2.toString())) {
                    setValues.remove(line2.toString());
                }
                line2 = reader2.readLine();
            }

            for (String record : setValues) {
                writer.write(record);
                writer.newLine();
            }
            reader1.close();
            reader2.close();
            writer.close();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
// data of file2 in set2;
