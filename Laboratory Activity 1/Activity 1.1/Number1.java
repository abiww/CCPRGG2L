import java.io.*;
import java.util.Scanner;

public class Number1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Laboratory Activity 1.1\n");
        
        File inputFile = new File ("C:\\Users\\user\\OneDrive\\Documents\\data.txt");
        Scanner inFile = new Scanner(inputFile);
        
        int sum = 0;
        int count = 0;

        try {
            while(inFile.hasNextInt()) {  
                int data = inFile.nextInt();
                sum += data;
                count++;
                
                System.out.println(data);
            
            } System.out.println("The sum of all data in text: " +sum);

            File sumFile = new File("sum.txt");
            System.out.println("\n" + sumFile.getName() + " is successfully created");
            System.out.println("File path: " + sumFile.getAbsolutePath());
            FileWriter fw = new FileWriter(sumFile, true);

            fw.write("\nThe total sum of data in (data.txt) is: "+sum);
            fw.flush();
            fw.close();

        } catch (Exception e) {
            System.out.println("An error has occurred: " + e.getMessage());
        } finally {
            inFile.close();
        }
    }
}
