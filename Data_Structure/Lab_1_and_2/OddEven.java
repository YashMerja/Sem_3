import java.util.Scanner;
public class OddEven{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
        int num = sc.nextInt();
        if((num & 1) == 1){
           System.out.println("odd");
        }
        else{
           System.out.println("even");
        }
        sc.close();
	}
}