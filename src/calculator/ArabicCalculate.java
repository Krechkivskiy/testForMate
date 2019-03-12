package calculator;


import java.util.Scanner;

public class ArabicCalculate {
   Scanner scanner = new Scanner(System.in);
int res =0;
int myArabicScanner(){

    System.out.println("введіть перше число");

    while (!scanner.hasNextInt()) {
        System.out.println("Некоректне введення спробуйте ще раз");
        scanner.nextLine();
    } int num1= scanner.nextInt();


    System.out.println("тепер введіть дію яку ви збираєтесь виконати наприклад + - / *");
    char operation = scanner.next().charAt(0);


    System.out.println("тепер третє число ");

    while (!scanner.hasNextInt()) {
        System.out.println("Некоректне введення спробуйте ще раз");
        scanner.nextLine();
    }    int num2 = scanner.nextInt();

    int result = calculate(num1, num2, operation);
    System.out.println("операцію виконано результат    "+ result);

    return 0;

}

    int calculate(int num1, int num2, char operation)
    {



            int result = 0;
            switch (operation) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Операция не распознана. ");
                    calculate(num1,num2,operation);
            }


        return result;}

}

       // System.out.println(result);
