import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a= sc.nextInt();
        int b= sc.nextInt();

       for(int i=1; i<=20; i++){
        double c = (a%b)*10;
        c*=0.1;
        System.out.print(c/b);
       }
    
    }
}