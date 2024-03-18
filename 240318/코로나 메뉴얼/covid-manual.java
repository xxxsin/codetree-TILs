import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char acorona = sc.next().charAt(0);
        int atemp = sc.nextInt();

        char bcorona = sc.next().charAt(0);
        int btemp = sc.nextInt();

        char ccorona = sc.next().charAt(0);
        int ctemp = sc.nextInt();

        if (acorona == 'Y' && bcorona == 'Y' ){
            if((atemp >= 37)&&(btemp >= 37)){
                System.out.println("E");
            }
            else{
                System.out.println("N");
            }
        }
        else if (bcorona == 'Y'&&ccorona == 'Y'){
            if((btemp >= 37)&&(ctemp >= 37)){
                System.out.println("E");
            }
            else{
                System.out.println("N");
            }
        }
        else if(ccorona == 'Y'&& acorona == 'Y'){
            if((ctemp >=37)&& (atemp >= 37)){
                System.out.println("E");
            }
            else{
                System.out.println("N");
            }
        }
        else if (acorona == 'Y' && bcorona == 'Y' && ccorona == 'Y'){
            if (((atemp >= 37)&&(btemp >= 37))||((btemp >= 37)&&(ctemp >= 37))||((ctemp >=37)&& (atemp >= 37))||(((atemp>=37)&&(ctemp >=37)&& (atemp >= 37)))){
                System.out.println("E");
            }
            else{
                System.out.println("N");
            }
        }
        else{
            System.out.println("N");
        }
    }
}