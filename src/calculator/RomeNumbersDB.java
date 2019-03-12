package calculator;

import java.util.HashMap;
import java.util.Map;

public class RomeNumbersDB {

  public   HashMap<String,Integer>  getRome_ArabibDB(){

       HashMap<String, Integer> numbersMap = new HashMap<>();

       numbersMap.put("I",1);
       numbersMap.put("II",2);
       numbersMap.put("III",3);
       numbersMap.put("IV",4);
       numbersMap.put("V",5);
       numbersMap.put("VI",6);
       numbersMap.put("VII",7);
       numbersMap.put("VIII",8);
       numbersMap.put("IX",9);
       numbersMap.put("X",10);

       return numbersMap;
   }






 public HashMap<Integer,String >  getArabaic_RomeLetters (){

    Map<Integer,String> numberMap = new HashMap<>();

    numberMap.put(1, "I");
    numberMap.put(2,"II");
    numberMap.put(3,"III");
    numberMap.put(4,"IV");
    numberMap.put(5,"V");
    numberMap.put(6,"VI");
    numberMap.put(7,"VII");
    numberMap.put(8,"VIII");
    numberMap.put(9,"IX");
    numberMap.put(10,"X");

    return (HashMap< Integer,String>) numberMap;
  }
}


