public class main {
    public static void main(String[] args) {

        int n = 6;
        int counter = 1;
           while(n!=1) {
               if (n % 2 == 0) {
                   n = n / 2;}
               else if (n % 2 != 0) n = (3 * n) + 1;
               counter++;
           }
        System.out.println(counter);
    }

}
