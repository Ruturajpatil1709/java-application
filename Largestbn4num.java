import java.util.Scanner;

public class Largestbn4num {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println(a + " is the largest number");
            }
        } else {
            if (b > c) {
                if(b > d){
                    System.out.println(b +" is the greatest number");
                }
            }else {
                System.out.println(d + " is the greates number");
            }
            if(c > d){
                System.out.println(c + " is the greatest number");
            }else {
                System.out.println(d + " is the greatest number");
            }
        }
        }
    }

