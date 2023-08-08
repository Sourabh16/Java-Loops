import java.util.*;
public class AssignmentQ2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int evenSum = 0;
        int oddSum = 0;
        int choice;
        do{
            System.out.print("Enter the number: ");
            int n = sc.nextInt();
            if(n%2==0){
                evenSum+=n;
            }
            else{
                oddSum+=n;
            }
            System.out.println("Do you want to continue press 1 else prss 0");
            choice = sc.nextInt();
        }
        while(choice==1);
        System.out.println("Even Sum is "+evenSum);
        System.out.println("Odd Sum is "+oddSum);
        sc.close();
    }
}
