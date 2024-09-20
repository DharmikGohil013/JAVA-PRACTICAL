import java.io.*;
import java.util.Scanner;

public class pra28 
{
    public static void searchWordInFile(String filePath, String wordToFind) {
        int count = 0; 
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) 
            {
                String[] words = line.split("\\s+");  
                for (String word : words) {
                    if (word.equalsIgnoreCase(wordToFind)) {
                        count++;
                    }
                }
            }   
            reader.close();

            if (count > 0) {
                System.out.println("The word '" + wordToFind + "' was found " + count + " times in the file.");
            } else {
                System.out.println("The word '" + wordToFind + "' was not found in the file.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("The file was not found. Please check the file path.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
        }
    }

   
    public static void wrapperClassExample() {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number in string format: ");
        String numberString = scanner.nextLine();
        Integer number = Integer.parseInt(numberString);
        int result = number * 2;
        System.out.println("The entered number as Integer is: " + number);
        System.out.println("After multiplying it by 2: " + result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the path of the file to search:");
        String filePath = scanner.nextLine();
        System.out.println("Enter the word to search for:");
        String wordToFind = scanner.nextLine();
        searchWordInFile(filePath, wordToFind); 
        wrapperClassExample(); 
    }
}
