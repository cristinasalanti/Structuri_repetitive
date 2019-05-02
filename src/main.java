        public class main {
            public static void main(String[] args) {

            int n=12345678;
            int x;
            int i=-1;
            int suma=0;
           while(n!=0) {
                    x = n%10;
                    i++;
                    if(i%2 ==0 )
                        suma = suma+x;

                    n = n/10;
               System.out.println(suma);


           }
            }

            }

