import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int am = sc.nextInt(); // a-math
        int ae = sc.nextInt(); //a-eng
        int bm = sc.nextInt();
        int be = sc.nextInt();
        
        if(am > bm && ae > be){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}