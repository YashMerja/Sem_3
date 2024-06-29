import java.util.Scanner;
public class FactorialRec{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number ");
        int number = sc.nextInt();
       int Factorail  = Rec(number);
       System.out.println("Factorial of " + number + " is " + Factorail);
        sc.close(); 
    }

 static int Rec(int number){
    if(number<=1){
        return 1;

    }
    return n * Rec(n-1);
 }
}