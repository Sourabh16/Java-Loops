import java.util.*;
public class factorial {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int factorial = 1;
        for(int i=1; i<n;i++){
            factorial*=i;
        }
        sc.close();
        System.out.println("Factorial is "+factorial);
    }
}
