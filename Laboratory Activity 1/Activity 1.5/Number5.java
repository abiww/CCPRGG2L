import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class App5 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter file name (INPUT): ");
        String inputFileName = sc.nextLine();
        
        System.out.print("Enter file name (OUTPUT): ");
        String outputFileName = sc.nextLine();

        File inputFile = new File(inputFileName);
        Scanner input = new Scanner(inputFile);
        
        FileWriter outputFile = new FileWriter(outputFileName);
        PrintWriter pw = new PrintWriter(outputFile);

        ArrayList<String> rev = new ArrayList<String>();

        try {
            while(input.hasNextLine()){
                rev.add(input.nextLine());
            }
            
                for (int i = (rev.size()-1); i >= 0; i--){
                    String words[] = rev.get(i).split(" ");
                
                    for (int e = (words.length-1); e >= 0; e--){
                        pw.print(words[e] + " ");
                    }
                    pw.println(" ");
                    words = null;
                }
        } catch (Exception e) {
            System.out.println("An error has occured" + e.getMessage());

        } finally {
            sc.close();
            input.close();
            pw.close();
        }            
    }
}
