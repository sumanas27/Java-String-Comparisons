import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        if(s.length() == 0){
            return smallest + "\n" + largest;
        } else {
            java.util.SortedSet<String> sortedStrings = new java.util.TreeSet<String>();

            for(int i = 0; i <= s.length() - k; i++){
                sortedStrings.add(s.substring(i, i+k));
            }

            smallest = sortedStrings.first();
            largest = sortedStrings.last();

            return smallest + "\n" + largest;

        }
        
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
