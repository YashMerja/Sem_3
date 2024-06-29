import java.util.*;
public class PowerDemo{
    public static void main(String[] s){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter theb number");
        int x= sc.nextInt();

        System.out.println("Enter theb number");
        int y= sc.nextInt();

        int z=1;
        for(int i=1;i<=y;i++){
            z=z*x;
        }
         System.out.println("ans is "+z);
    }
}