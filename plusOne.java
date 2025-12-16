import java.util.*;
public class plusOne{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] digit=new int[n];
        for(int i=0;i<n;i++){
            digit[i]=sc.nextInt();
        }
        for(int i=digit.length-1;i>=0;i--){
            if(digit[i]<9){
                digit[i]++;
                for(int j=0;j<n;j++){
                    System.out.print(digit[j]+" ");
                }
                return;
                
            }
            digit[i]=0;
        }
        int[] newArr=new int[n+1];
        newArr[0]=1;
        for(int i=0;i<newArr.length;i++){
            System.out.print(newArr[i]+" ");
        }
    }
}
