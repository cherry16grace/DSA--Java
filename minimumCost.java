import java.util.*;
public class minimumCost{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int odd=0,even=0;
        for(int pos:arr){
            if(pos%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.print(Math.min(even,odd));
    }

}