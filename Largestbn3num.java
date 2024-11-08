import java.util.Scanner;

public class Largestbn3num {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println(a + " is the largest number");
            }
        } else if (b > c) {
            System.out.println(b +" is the greatest number");

        }else {
            System.out.println(c + " is the greates number");
        }
    }
}
