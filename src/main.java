        public class main {
            public static void main(String[] args) {

          int n=8901010;
            int sex=0;  int luna=0; int an=0; int ziua=0;
            int i=-1;
            String luna1= " "; String sex1 = " "; String an1 = " ";
           int x; int y; int z; int w;


                x= n%100;
                ziua = x;
                n=n/100;

                y = n%100;
                luna = y;
                n=n/100;
             switch(luna) {
                    case 1: luna = 01;
                    luna1 = "ianuarie";

                        break;
                    case 2: luna = 02;
                        luna1 = "februarie";

                        break;
                    case 3: luna = 03;
                    luna1 = "martie";
                        break;
                    case 4: luna = 04;
                    luna1 = "aprilie";
                        break;
                       case 5: luna=05 ;
                       luna1 = "mai";
                        break;
                    case 6: luna = 06;
                    luna1 = "iunie";
                        break;
                    case 7: luna = 07;
                    luna1 = "iulie";
                    break;
                    case 8: luna = 8;
                     luna1 = "august";
                        break;
                    case 9: luna = 9;
                       luna1 = "septembrie";
                        break;
                    case 10: luna = 10;
                       luna1 = "octombrie";
                        break;
                    case 11: luna = 11;
                     luna1 = "noiembrie";
                        break;
                    case 12: luna = 12;
                      luna1 = "decembrie";
                        break;
                    default:
                       luna1 = "CNP incorect";

                }
                z= n%100;
                an = z;
                n=n/100;

                w= n%100;
                sex = w;
                n=n/100;

            if(sex>=1 && sex<=2) an1 = "19"+an;
            else if(sex>=3 && sex<=4) an1 = "18"+an;
            else if(sex>=5&& sex<=6) an1 = "20"+an;
            else if(sex>=7 && sex<=8) an1 = "strain";

                switch(sex)
                {
                    case 1: sex = 1; sex1="baiat";
                    case 3: sex = 3; sex1="baiat";
                    case 5: sex = 5; sex1="baiat";
                    case 7: sex = 7; sex1="baiat";
                    break;
                    case 2: sex = 4;
                    case 4: sex = 4;
                    case 6: sex = 6;
                    case 8: sex = 8;
                    sex1="fata";
                        break;
                    default: sex1 = "not person";
                }



                System.out.println(sex1+ " nascut pe "+ ziua +" "+ luna1 + " "+ an1);

                }
            }