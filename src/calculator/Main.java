package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
ArabicCalculate arabicCalculate =new ArabicCalculate();
RomeCalculate romeCalculate = new RomeCalculate();



        System.out.println("Привіт вітаю тебе  цьому прекрасному калькуляторi  " );
        System.out.println("Для початку роботи тобі потрібно вказати");
        System.out.println(" з якими числами ти плануєш працювати ");
        System.out.println("Введи 1 якщо це арабська нумерація і 2 якщо римська ");

        int choiseOfTypeNumbers = scanner.nextInt();



        switch (choiseOfTypeNumbers){
            case 1:
arabicCalculate.myArabicScanner();

                break;
            case 2:romeCalculate.startRome();
                break;
        }



    }
}
