public class main {
    public static void main(String[] args) {

       int[] n=new int[]{2, 6, 7,5,6,34,2,4,7,7,3,1,2,5,6,8,4,2};
       int nrpare  = 0;
        int nrimpare = 0;
        for(int i=0; i<n.length; i++)
        {
            if(n[i]%2 == 0) {nrpare++;}
            else if(n[i]%2 != 0) {nrimpare++;}

        }
        System.out.println(nrpare);
        System.out.println(nrimpare);

    }

}
