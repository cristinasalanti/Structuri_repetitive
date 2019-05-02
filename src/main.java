        public class main {
            public static void main(String[] args) {

             int n=90;
             int m=9;
             int numar=0;
               while(n!=0) {

                  numar =numar *10+n%10;
                  n=n/10;


                }
                if(numar == m)
                {
                    System.out.println("true");
                }
                else if (numar !=  m) System.out.println("false");
        // nu am reusit sa verific conditiile pentru numere cu 01,02,03...09

            }

            }

