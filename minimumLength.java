import java.util.*;

public class minimumLength {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();   // tc: O(n)  sc: O(1)

        int left = 0, right = n - 1;

        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                break;
            }
            else{
                char ch = s.charAt(left);

                while(left <= right && s.charAt(left) == ch){
                    left++;
                }

                while(left <= right && s.charAt(right) == ch){
                    right--;
                }
            }
        } 

        System.out.print(right - left + 1);
    }
}
