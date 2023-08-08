
import java.util.*;
public class checkifprime {
        public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        if(n==2){
                    System.out.println("Prime");
                }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                System.out.println("The number is not Prime");
                break;
            }
            else{
                System.out.println("The number is Prime");
            }
        }sc.close();
        
    }
}
