public class Stringcompress {

     public static StringBuilder stringCompressin(String name){
        StringBuilder newsb = new StringBuilder("");
        for(int i=0; i<name.length();i++){

            Integer count = 1;
            while (i<(name.length()-1) && name.charAt(i)==name.charAt(i+1)) {
                count++;
                i++;
            }
            newsb.append(name.charAt(i));
            if (count>1) {
                newsb.append(count.toString());
            }
        }
        return newsb;
     }
    public static void main(String args[]){
      String name = new String("aaabbccccddd");
      System.out.println(stringCompressin(name));
    }
}
