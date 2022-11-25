package Test;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;


public class file_output_modified {
    public static void main(String [] args) {
        String path1 = "D:/Chrome downloads/file_one.csv";
        String path2 = "D:/Chrome downloads/file_two.csv";
        try {
            BufferedReader reader1 = new BufferedReader(new FileReader(path1));
            BufferedReader reader2 = new BufferedReader(new FileReader(path2));
            BufferedWriter writer = Files.newBufferedWriter(Paths.get("D:/Chrome downloads/file_output_modified.csv"));
            HashMap<String, String>  mapValues = new HashMap<>();
            HashMap<String, String>  result = new HashMap<>();
            String line1 = reader1.readLine();
            String line2 = reader2.readLine();
            while (line2 != null) {
                String[] tokens = line2.split(",");
                mapValues.put(tokens[0].toString(), tokens[1].toString());
                line2 = reader2.readLine();
            }
            while (line1 != null) {
                String[] tokens = line1.split(",");
                String key = tokens[0], value = tokens[1];
                String v = mapValues.getOrDefault(key, null);
                if (v == null) {
                    mapValues.remove(key);
                }
                if (v != null && !v.equals(value)) {
                    result.put(key, value);
                }
                line1 = reader1.readLine();
            }

            for (var record : result.entrySet()) {
                String entry = record.getKey() + "," + record.getValue();
                writer.write(entry);
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
