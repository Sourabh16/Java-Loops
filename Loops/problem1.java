import java.util.*;
public class problem1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers do you want to print");
        int n = sc.nextInt();
        int counter=0;
        while(counter<=n){
            System.out.println(counter);
            counter++;
            
        }
        sc.close();
    }
}
