import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a<b&& b<c){
            System.out.println(b);
        }
        else if (b<a && a<c){
            System.out.println(a);
        }
        else if (c<b&& c<a){
            System.out.println(c);
        }
    }
}