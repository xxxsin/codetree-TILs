import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i=1;  a<=i && b>=i; i++ ){
            if(i % 2 == 1) 
            System.out.print(i+ " ");
        }
    }
}