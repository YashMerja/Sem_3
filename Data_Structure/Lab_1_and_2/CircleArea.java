import java.util.Scanner;
public class CircleArea{
 public static void main(String[] args){

Scanner sc = new Scanner(System.in);
System.out.print(" Enter Radious");
double Radious= sc.nextDouble();
double ans = Math.PI*Radious*Radious;
System.out.println("Area is = "+ans);
sc.close();
 }
 
}