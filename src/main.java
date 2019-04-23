
// 2*(3^n)
public class main {
    public static void main(String[] args) {

        int n = 7;
        int suma = 0;
        int pow = 1;
        int inmultire = 1;
        for (int i = 0; i < n; i++)
        {
            pow = 3*pow;

            inmultire = 2 * (pow);

        }

        System.out.println(inmultire);

        while(inmultire!=0)
        {
            suma = suma + inmultire % 10;
           inmultire= inmultire / 10;
        }
        System.out.println(suma);
    }
    }
