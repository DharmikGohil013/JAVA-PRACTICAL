import java.util.Scanner;

public class substringcommpar {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        int x =s.length();
        String[] z= new String[100]; 
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for(int i=0;i<x;i++)
        {
            int beginIndex = i;
            int endIndex = i+k;
            z[i] = s.substring(beginIndex, endIndex);
            System.out.println(z[i]);
            if(i==(s.length()- x))
            {
                break;
            }
        }
        
        
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}