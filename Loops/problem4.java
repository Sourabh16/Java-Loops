import java.util.*;
public class problem4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.print("Enter number: ");
            int n = sc.nextInt();
            if(n % 10 == 0){
                continue;
            }
            sc.close();
            System.out.println("The number is " + n);
        }
        while(true);
        
    }
}
