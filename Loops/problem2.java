import java.util.*;
public class problem2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter last number:");
        int counter = 0;
        int n = sc.nextInt();
        int sum = 0;
        while(counter<=n){
            sum+=counter;
            counter++;
        }
        System.out.println(sum);
        sc.close();
    }
}
