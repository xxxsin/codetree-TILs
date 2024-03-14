import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int aeng = sc.nextInt();
        int amath = sc.nextInt();

        int beng = sc.nextInt();
        int bmath = sc.nextInt();

        if (amath > bmath || (amath == bmath && aeng > beng)){
            System.out.println("A");
        }
        else if {
            System.out.println("B");
        }

    }
}