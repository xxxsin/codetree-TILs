import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(); //키 cm
        int b=sc.nextInt(); //몸무게 kg
        double c = a*0.01; //m 변환
    
        int bmi = (int)(b/(c*c));

        System.out.println(bmi);

        if (bmi>= 25){
            System.out.println("Obesity");
        }
    }
}