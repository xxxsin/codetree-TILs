import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i =1; i<=n; i++){ // n 번(횟수) 만큼 반복 
            int a = sc.nextInt(); // 숫자 n 대입
            if(a%3==0 && a%2==1){ // 3배수이면서 홀수인 거만 출력
                System.out.println(a);
            }
        }
    }
}