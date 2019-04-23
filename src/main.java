public class main {
    public static void main(String[] args) {

        int[] n = new int[]{2,4,6,8,9};
        int max = 0;
        for (int i = 0; i < n.length; i++) {

            if(n[i]%2 !=0)
            {

                if(max<n[i]) max = n[i];

            }
        }
        if(max==0) System.out.println("NO");
         else System.out.println(max);



    }
}
