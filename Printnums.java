public class Printnums {
    public static void main (String [] args){
        int i = 0;
        int sum = 0;
        for ( i = 0; i <=101 ; i++) {
            if(i % 2 == 0){
                sum = sum + i;
                System.out.println(sum);
            }

        }
    }
}
