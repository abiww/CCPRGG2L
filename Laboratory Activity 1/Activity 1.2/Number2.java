import java.io.*;

public class Number2 {
    public static void main(String[] args) throws IOException {
        System.out.println("Laboratory Activity 1.2\n");

        File inFile = new File("C:\\Users\\user\\OneDrive\\Documents\\dummy.txt");
        BufferedReader br = new BufferedReader(new FileReader (inFile));
        
        int count = 1;

        try {
            String text;
            while (((text = br.readLine()) != null) && count <= 5) {
                System.out.println(text);
                count++;
            }
        }
        catch (Exception e) {
            System.out.println("There is an error reading the file: ");
            System.out.println(e.getMessage());
        }
        finally {
            br.close();
        }
    }
}
