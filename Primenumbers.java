public class Primenumbers {
    public static void main(String[] args){
        int i,j, count ;
        for ( i = 1; i <101 ; i++) {
            count = 0;
            for ( j = 1; j <101 ; j++) {
                if(i % j ==0){
                    count = count+1;

                }
                }if(count == 2){
                System.out.println("prime no is "+i);
            }

        }
    }
}
