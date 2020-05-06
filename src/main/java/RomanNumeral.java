import java.util.List;

public class RomanNumeral {

    final static List<Integer> ARABIC_NUMBER = List.of(100,90,50,40,10 ,9, 5 ,4 ,1);
    final static List<String> ROMAN_NUMBER = List.of("C", "XC", "L", "XL", "X", "IX", "V", "IV", "I");

    public static String convert(int arabicNumber) {
        StringBuilder result = new StringBuilder();
        int reamainingArabicNumber = arabicNumber;


//        if(arabicNumber != 0 && arabicNumber % 10 == 0){
//             result.append("XX");
//             return result.toString();
//         }
//         else {
//             for(int i = 0; i < arabicNumber; i++){
//                 result.append(("I"));
//             }
//             return result.toString();
//         }
//        return "";



        for (int i = 0; i < ARABIC_NUMBER.size(); i++) {
            if (arabicNumber >= ARABIC_NUMBER.get(i)) {
                result.append(ROMAN_NUMBER.get(i));
            }
        }
        return result.toString();

    }
//
//
//         if (basedMap.containsKey(arabicNumber)) {
//             return result.append(basedMap.get(arabicNumber)).toString();

//         }else if(arabicNumber != 0 && arabicNumber % 10 == 0){
//             result.append("XX");
//             return result.toString();
//         }
//         else {
//             for(int i = 0; i < arabicNumber; i++){
//                 result.append(("I"));
//             }
//             return result.toString();
//         }
//        return "";


}



//    private static final Map<Integer , String> basedMap = new HashMap<Integer, String>();


//    static {
//         basedMap.put(1,"I");
//         basedMap.put(4,"IV");
//         basedMap.put(5,"V");
//         basedMap.put(9,"IX");
//         basedMap.put(10,"X");
//         basedMap.put(40,"XL");
//         basedMap.put(50,"L");
//         basedMap.put(90,"XC");
//         basedMap.put(100,"C");
//     }

