public class main {
    public static void main(String[] args) {

        int[] sir= new int[]{2,3,7,8,6,2,10,3,7,4,6,9,10};
        int cnt=0;
        int suma=0;
            for(int i=0;i<sir.length;i++)
            {
                if(sir[i]%2==0)
                {
                    cnt++;
                    if(cnt<=5)
                    {
                        suma = suma + sir[i];
                    }
                }
            }
            System.out.println(suma);

    }
    }
