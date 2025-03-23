package test;

import java.util.HashMap;
import java.util.Map;

public class Problem1 {


    public static void main(String[] args) {



        int higher = 0;

        String upper = "";
        String name = "CHEtan1";

        int lower = 0;

        String lowerNames = "";

        int letter = 0;

        String check = "";

        int digit = 0;

        String isDigit = "";

        for(int i=0 ; i<name.length() ; i++){

            char ch = name.charAt(i);


            if(Character.isLowerCase(ch)){

                lower++;
                lowerNames = ch+lowerNames;

            }

            if(Character.isUpperCase(ch)){


                higher++;

                upper = upper+ch;
            }


            if(Character.isLetter(ch)){

                letter++;

                check = check+ch;
            }

            if(Character.isDigit(ch)){

                digit++;

                isDigit = isDigit+ch;
            }


        }

        System.out.println(lowerNames+": and the count is:"+lower);

        System.out.println(upper+": and the count is:"+higher);

        System.out.println(check+": and the count is:"+letter);

        System.out.println(isDigit+": and the count is:"+digit);




    }
}
