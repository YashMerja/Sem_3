import java.util.*;
public class FactorDemo{
    public static void main(String[] s){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int a=sc.nextInt();

        for(int i=1;i<=a;i++){
            if(a%i==0){
                System.out.println(i);
            }
        }
    }
}