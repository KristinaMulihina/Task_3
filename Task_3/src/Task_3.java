import java.util.Arrays;
import java.lang.Math;
import java.util.Scanner;

public class Task_3 {
    public static String  millionsRounding(Object[][] city){
        for (int i = 0; i < city.length; i++){
            city[i][1] = Math.round((int)city[i][1]/1000000)*1000000;
        }
        return Arrays.deepToString(city);
    }







    public static String otherSides(double a){
        double b = a*2;
        double c = a * Math.sqrt(2);
         b = Math.round(b * 100)/100.0;
         c = Math.round(c * 100)/100.0;
        return b + "   " + c;
    }

    public static String rps(String a, String b) {
        Scanner user_input = new Scanner(System.in);
        System.out.println("Ход первого игрока:");
        a = user_input.next();
        System.out.println("Хoд второго игрока:");
        b = user_input.next();
        if (a.toString().equals(b.toString()))
            return ("НИЧЬЯ!!");
        else if ((a.toString().equals("камень") && b.toString().equals("бумага"))) {
            return "Игрок 2 победил";
        }
        else{
            return "Игрок 1 победил";
    }
    }



    public static int warOfNumbers(int mas_1 []){
        int even = 0;
        int odd = 0;

        for(int i = 0; i<mas_1.length; i++){
            if (mas_1[i] % 2 == 0){
                even = even +mas_1[i];
            }
                    else {
                        odd = odd + mas_1[i];
            }

}
        if (odd>even){
            return (odd - even);
        }
        else{
            return (even - odd);
        }
    }

    public static String reverseCase(String str){
        String res = "";
        for (int i  = 0; i<str.length(); i++){
           String letter = str.charAt(i)+"";
            if (letter.equals(letter.toUpperCase())){
                letter = letter.toLowerCase();
            }
            else{
                letter = letter.toUpperCase();
            }
            res += letter;
        }
        return (res);

    }

    public static String inatorInator(String str){
        String res = "";
        String glasn = "aeiouyAEIOUY";
        int ind = str.length() - 1;
        String letter = str.charAt(ind)+"";
        if (glasn.contains(letter)){
            res = str + "-inator " + str.length() + "000";
        }
        else {
            res = str + "inator " + str.length() + "000";
        }
        return res;
    }


    public static boolean doesBr11ickFit(int a, int b, int c, int w, int h){
        return ((a<=w && b<=h) || (a<=h && b<=w )|| (a<=w && c<=h) || (a<=h && c<=w )|| (b<=w && c<=h) || (b<=h && c<=w ));
}

public static double totalDistance(double litr, double raschod, double pass, boolean cond){
    raschod += raschod * pass * 5 / 100;
        if (cond)
            raschod += raschod / 10;
        double res = litr / raschod * 100;
        res = Math.round(res * 100) / 100.0;
        return res;
}

public static double mean(int mas []){
        double summ = 0;
        double number = 0;
            for (int i = 0; i<mas.length; i++){
           summ = summ + mas[i];
           number = number + 1;
        }
            double average = summ / number;
            average = Math.round(average * 100) / 100.0;
       return average;
    }


    public static boolean parityAnalysis(int number){
        int ostatok = number % 2;
        int summ = 0;
        while (number > 0){
            summ += number % 10;
            number = number/10;
        }
        return (summ%2 == ostatok);
    }








public static void main (String args []){
    System.out.println(millionsRounding(new Object[][]{
        new Object[] {"Nice", 942208},
            new Object[] {"Abu Dhabi", 1482816},
            new Object[] {"Naples", 2186853},
          new Object[] {"Vatican City", 572}}));
    System.out.println(rps("бумага", "камень"));
    System.out.println(warOfNumbers(new int [] {12, 90, 75}));
    System.out.println(reverseCase("Ivan"));
    System.out.println(inatorInator("Shrink"));
    System.out.println(doesBr11ickFit(1, 1, 1, 1, 1));
    System.out.println(totalDistance(36.1, 8.6, 3, true));
    System.out.println(mean(new int [] {1, 0, 4, 5, 2, 4, 1, 2, 3, 3, 3}));
    System.out.println(parityAnalysis(243));


}
}





//    public static String millionsRounding(Object[][] city){
//        new Object[] {"Nice", 942208},
//            new Object[] {"Abu Dhabi", 1482816},
//            new Object[] {"Naples", 2186853},
//            new Object[] {"Vatican City", 572},
//        };
//
//        for (int i = 0; i < city.length; i++){
//            city[i][1] = Math.round((int)city[i][1]/1000000)*1000000;
//        }
//        return Arrays.deepToString(city);
//    }
//    public static void main (String args []){
//        System.out.println(millionsRounding(new Object[] {"Nice", 942208},
//                new Object[] {"Abu Dhabi", 1482816},
//                new Object[] {"Naples", 2186853},
//                new Object[] {"Vatican City", 572}));
//
//    }
//}
////        Object[][] city = {
////            new Object[] {"Nice", 942208},
////            new Object[] {"Abu Dhabi", 1482816},
////            new Object[] {"Naples", 2186853},
////            new Object[] {"Vatican City", 572},
////        };
////
////        for (int i = 0; i < city.length; i++){
////            city[i][1] = Math.round((int)city[i][1]/1000000)*1000000;
////        }
////
////        System.out.println(Arrays.deepToString(city));
////    }
//
//
//
//}

//import java.math.RoundingMode;
//import java.lang.Math;
//
////2
//public class millionsRounding{
//    public static void main (String args []){
//        double a = 1;
//        double b = a*2;
//        double c =a * Math.sqrt(2);
//
//
//        b = Math.round(b * 100)/100.0;
//        c = Math.round(c * 100)/100.0;
//do
//        System.out.println(b + " " + c);
//
//
//
//    }
//}


//3
//import java.util.Scanner;
//public class millionsRounding{
//    public static void main (String args []){
//        Scanner user_input = new Scanner(System.in);
//        System.out.println("Ход первого игрока:");
//        String a = user_input.next();
//        System.out.println("Хoд второго игрока:");
//        String b = user_input.next();
//        if (a.toString().equals(b.toString()))
//            System.out.println("НИЧЬЯ!!");
//        else if ((a.toString().equals("камень") && b.toString().equals("бумага")) ){
//            System.out.println("Игрок 2 победил");
//        }
//else {
//            System.out.println("Игрок 1 победил");
//    }
//}
//}

//4
//
//public class millionsRounding {
//    public static void main (String args []){
//        int even = 0;
//        int odd = 0;
//        int mas_1 [] = {12, 90, 75};
//        for(int i = 0; i<mas_1.length; i++){
//            if (mas_1[i] % 2 == 0){
//                even = even +mas_1[i];
//            }
//                    else {
//                        odd = odd + mas_1[i];
//            }
//
//}
//        if (odd>even){
//            System.out.println(odd - even);
//        }
//        else{
//            System.out.println(even - odd);
//        }
//
//
//    }
//}

//import java.util.Locale;

//5
//public class millionsRounding{
//    public static void main (String args []){
//        String str = "Ivan";
//        String res = "";
//        for (int i  = 0; i<str.length(); i++){
//           String letter = str.charAt(i)+"";
//            if (letter.equals(letter.toUpperCase())){
//                letter = letter.toLowerCase();
//            }
//            else{
//                letter = letter.toUpperCase();
//            }
//            res += letter;
//        }
//        System.out.println(res);
//
//    }
//}

//6
//public class millionsRounding{
//    public static void main (String args []){
//        String str = "Doom";
//        String res = "";
//        String glasn = "aeiouyAEIOUY";
//        int ind = str.length() - 1;
//        String letter = str.charAt(ind)+"";
//        if (glasn.contains(letter)){
//            res = str + "-inator " + str.length() + "000";
//        }
//        else {
//            res = str + "inator " + str.length() + "000";
//        }
//        System.out.println(res);
//}
//}








////7
//public class millionsRounding {
//    public static void main (String args []){
//        int a = 1;
//        int b = 2;
//        int c = 2;
//        int w = 1;
//        int h = 1;
//        if ((a<=w && b<=h) || (a<=h && b<=w )|| (a<=w && c<=h) || (a<=h && c<=w )|| (b<=w && c<=h) || (b<=h && c<=w )){
//            System.out.println("true");
//        }
//            else{
//            System.out.println("false");
//        }
//
//    }
//}


//8
//public class millionsRounding{
//    public static void main (String args []){
//        double litr = 36.1;
//        double raschod = 8.6;
//        int pass = 3;
//        boolean cond = true;
//
//        raschod += raschod * pass * 5 / 100;
//        if (cond)
//            raschod += raschod / 10;
//        double res = litr / raschod * 100;
//        res = Math.round(res * 100) / 100.0;
//        System.out.println(res);
//    }
//}



////9
//public class millionsRounding {
//    public static void main (String args []){
//        float summ = 0;
//        float number = 0;
//        int mas [] = {3, 2, 3, 2};
//        for (int i = 0; i<mas.length; i++){
//           summ = summ + mas[i];
//           number = number + 1;
//        }
//        float average = summ / number;
//        System.out.println(summ);
//        System.out.println(number);
//        System.out.println(average);
//    }
//}

//10
//public class millionsRounding{
//    public static void main (String args []){
//        int number = 12;
//        int ostatok = number % 2;
//        int summ = 0;
//        while (number > 0){
//            summ += number % 10;
//            number = number/10;
//        }
//        System.out.println(summ%2 == ostatok);
//    }
//}

