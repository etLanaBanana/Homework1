import java.util.Scanner;

//Подсчитать индекс массы тела
public class Main {
    public static void main(String[] args) {

        int bmi;
        Scanner scanner = new Scanner(System.in);
        int weight = scanner.nextInt();
        int height = scanner.nextInt();
        bmi = weight/height^2;
        if (bmi <= 18.5)
            System.out.println("недовес");
        else if (bmi <= 25)
            System.out.println("вес в норме");
        else if (bmi <= 30)
            System.out.println("лишний вес");
        else  if (bmi > 30)
            System.out.println("ожирение");
    }
}