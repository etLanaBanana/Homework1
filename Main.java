import java.util.Scanner;

//Подсчитать индекс массы тела
public class Main {
    public static void main(String[] args) {

        double bmi;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите вес");
        double weight = scanner.nextDouble();
        System.out.println("Введите рост в формате \"1,7\"");
        double height = scanner.nextDouble();
        bmi = weight/(height*height);
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