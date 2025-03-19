import java.util.Arrays;

public class Str_search {
    public static void main(String[] args) {
        char[] latters = {'A','B','C','D','E','F'};
        System.out.println("Character Array : "+Arrays.toString(latters));
        System.out.println("Search character Present at Index Number : "+ch_search(latters, 'D'));
    }
    public static int ch_search(char[] arr,char search_num){
        if(arr == null  || arr.length == 0) return 0;

        int i=0;
        while (arr.length != 0) {
            if(arr[i] == search_num){
                return i;
            }
            i++;
        }
        return -1;
    }

}
