import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int aa = sc.nextInt();
        char as = sc.next().charAt(0);

        int ba = sc.nextInt();
        char bs = sc.next().charAt(0);


        if ((aa>= 19 && as == 'M' ) || (ba>=19 && bs == 'M')){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}