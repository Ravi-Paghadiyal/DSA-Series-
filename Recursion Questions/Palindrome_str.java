public class Palindrome_str {
    public static void main(String[] args) {
        String str = "madam";
        if (check_str(str)) {
            System.out.println(str+" is Palindrome");
        }else{
            System.out.println(str+" is Not a Palindrome");
        }
    }

   public static boolean check_str(String str){
    if (str.length() <= 1) {
        return true;
    }

    if (str.charAt(0) != str.charAt(str.length()-1)) {
        return false;
    }

    return check_str(str.substring(1,str.length()-1));
   }
}
