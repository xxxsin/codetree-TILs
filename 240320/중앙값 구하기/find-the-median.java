import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if ((a<b&&b<c)||(c<b&&b<a)){
            System.out.println(b);
        }
        else if ((b<a && a<c)||(c<b&&a<b)){
            System.out.println(a);
        }
        else if ((c<b&& c<a)||(a<c&&c<b)){
            System.out.println(c);
        }
    }
}