import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int g= sc.nextInt();
        int a= sc.nextInt();

        if ( g==0 && a >=19){
            System.out.println("MAN");
        }
        else if (g == 0 && a<19){
            System.out.println("BOY");
        }

        else if ( g== 1 && a >=19){
            System.out.println("WOMAN");
        }
        else{
            System.out.println("GIRL");
        }
}
}