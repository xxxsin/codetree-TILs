import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i=1;  1<= i && i>=a && i<=100 & i<=b; i++ ){
            if(i % 2 == 1) 
            System.out.print(i+ " ");
        }
    }
}