import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int a = sc.nextInt();

        int i;
        i = b;
        while(i>=a){
            System.out.print(i+" ");
            i-=2;
        }
    }
}