package calculator;

import java.util.HashMap;
import java.util.Scanner;

public class RomeCalculate {
    Scanner scanner = new Scanner(System.in);
    RomeNumbersDB romeNumbersDB = new RomeNumbersDB();
    ArabicCalculate arabicCalculate = new ArabicCalculate();



    void startRome(){

    System.out.println("введіть перше число");
    String str1 = scanner.next().toUpperCase();


    System.out.println("введіть дію яку ви збираєтесь виконати наприклад + - / *");
    char operation = scanner.next().charAt(0);
if (operation!='+'||operation!='-'||operation!='*'||operation!='/'){
    System.out.println("неправильно введений символ дії ");

    startRome();

}

    System.out.println("тепер третє число ");
  String str2 = scanner.next().toUpperCase();




    int num1 = decoder_Ar_Rome(str1);
    int num2 = decoder_Ar_Rome(str2);
    int result = arabicCalculate.calculate(num1, num2, operation);



    //   System.out.println(result +"    res");
    String s = decoderAtArabic(result);


}



 int decoder_Ar_Rome(String string)
{    HashMap<String, Integer> db = romeNumbersDB.getRome_ArabibDB();
    int res=0;
    try {


 res  = db.get(string);
    System.out.println(res);
}

    catch ( NullPointerException ex){
        System.out.println("uncorrect try again");
        startRome();

    }
return res;
}





//переводить в римські символи тільки числа з 1 до 10
String decoderAtArabic(int res){
    System.out.println(res);
    HashMap<Integer, String> letters = romeNumbersDB.getArabaic_RomeLetters();
    String result="";

    if (res<11){

        try {


       result = letters.get(res);}
        catch (NullPointerException ex){
            System.out.println("uncorrect result please try again");
            startRome();


        }


       if (result.equals(null)){
           startRome();


       }
    }
    System.out.println(result);


    return result;
    }




}
