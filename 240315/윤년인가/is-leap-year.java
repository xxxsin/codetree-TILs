import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y =sc.nextInt();

        if (y%400==0){
                System.out.println("true");
            }
        else if (y%100==0){
            System.out.println("false");
            }

        else if(y%4==0){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}