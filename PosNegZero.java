import java.util.Scanner;

public class PosNegZero {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num > 0){
            System.out.println(num + " is positive");
        } else if (num < 0) {
            System.out.println(num + "negative number");

        }else {
            System.out.println(num + "number is zero");
        }

    }
}
