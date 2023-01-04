import java.io.*;

public class Number3 {
    public static void main(String[] args) throws IOException {
        System.out.println("Laboratory Activity 1.3\n");

        File inFile = new File("C:\\Users\\user\\OneDrive\\Documents\\dummy.txt");
        BufferedReader br = new BufferedReader(new FileReader (inFile));
        
        int lineCount = 1;
        int vowelCount = 0;
        String text;

        try {
            while (((text = br.readLine()) != null) && lineCount <= 5) {
                System.out.println(text);
                lineCount++;

                for(int i = 0; i < text.length(); i++) {    
                    if (text.charAt(i) == 'a'|| text.charAt(i) == 'e'|| text.charAt(i) == 'i'|| text.charAt(i) == 'o'||text.charAt(i) == 'u'|| 
                        text.charAt(i) == 'A'|| text.charAt(i) == 'E'|| text.charAt(i) == 'I'|| text.charAt(i) == 'O'|| text.charAt(i) == 'U') {
                            vowelCount++;
                    } 
                } 
            } System.out.println("\nThe total vowel (big or small) in text are: "+ vowelCount);
          
        } catch (Exception e) {
            System.out.println("There is an error reading the file: ");
            System.out.println(e.getMessage());
        } finally {
            br.close();
            
        }
    }
}
