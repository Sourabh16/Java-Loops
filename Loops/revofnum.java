/*public class revofnum {
    public static void main(String[] args){
        int n = 10899;
        int rev = 0;
        while(n>0){
            int lastDigit = n%10;
            rev = (rev*10)+lastDigit;
            n/=10;

        }
        System.out.println(rev);
    }
}*/
import java.util.*;
public class revofnum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int rev = 0;
        while(n>0){
            int lastDigit = n%10;
            rev = (rev*10)+lastDigit;
            n/=10;

        }
        System.out.println(rev);
        sc.close();
    }
}

