import java.util.Arrays;

public class Search {

    public static boolean check(String name , char ch){
        if (name.length() == 0) {
            return false;
        }

        for(int i=0; i<name.length(); i++){
            char ch_of_name = name.charAt(i);

            if(ch == ch_of_name){
                System.out.println("Character "+ch_of_name+" is Founded ");
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        String name = "Ravi";
        char ch = 'v';

        System.out.println(check(name, ch));
        System.out.println(Arrays.toString(name.toCharArray()));
    }
}
