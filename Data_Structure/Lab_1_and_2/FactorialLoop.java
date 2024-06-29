import java.util.Scanner;
public class FactorialLoop{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number ");
        int number = sc.nextInt();
        int Facto = 1;
        for(int i=1;i<=number;i++){
            Facto*=i;
        }
            System.out.println("Factorail of "+ number + " is " + Facto);
        sc.close();
         
    }
}