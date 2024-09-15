public class FindPalindrom{
    public static boolean isPalindrome(String str){
        int n= str.length();
        for(int i=0; i<str.length()/2;i++){
         if (str.charAt(i)!=str.charAt(n-1)) { 
            return false;
         }
         n--;
        }
        return true;
    }
    public static void main(String args[]){
        String str = "raceeycar";

      System.out.println(isPalindrome(str));
    }
}