import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ms = sc.nextInt();
        int fs = sc.nextInt();

        if ( ms >=90 && fs >=95 ){
            System.out.println("100000");
        }
        else if (ms>=90 && fs >=90){
            System.out.println("500000");
        }
        else{
            System.out.println("0");
        }
    }
}