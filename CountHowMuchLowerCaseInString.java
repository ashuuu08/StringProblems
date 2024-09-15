public class CountHowMuchLowerCaseInString {
    
    public static int countLoweerLatter( String str ){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for(char ch='a';ch<='z';ch++){
             if (str.charAt(i)==ch) {
                count++;
             }
            }
        }
        return count;
    }

    public static void main(String args[]){
        String str = " Ashish Kumar Rathour";
        System.out.println(countLoweerLatter(str));
    }
}
