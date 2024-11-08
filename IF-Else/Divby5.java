import java.util.Scanner;

public class Divby5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a % 5 == 0){
            System.out.println(a +" divisible by 5");
        }else {
            System.out.println(a + "not divisible 5");
        }
    }
}
