        public class main {
            public static void main(String[] args) {

            int n=1234567891;
            int m;
           int i=-1;
            int sumapare=0;
            int sumaimpare=0;
            int x=0;
           while(n!=0) {

                    x = n%10;
                    i++;
                    if(i%2 ==0 )
                        sumapare = sumapare+x;
                    else sumaimpare = sumaimpare + x;

                    n = n/10;



           }

                m = sumapare-sumaimpare;
                System.out.println(m);

                }
            }

            

