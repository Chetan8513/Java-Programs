package test;

import java.util.Arrays;

public class Problem2 {


    public static void main(String[] args) {



        // check anagram

        boolean result = Problem2.isAnagram("tac","cat");

        if(result){
            System.out.println("given string is anagram");
        }else{

            System.out.println("not anagram");
        }


    }

    public static boolean isAnagram(String name , String name2){


        if(name.length()!=name2.length()){


           // System.out.println("they are not anagaram");  unneccary printing the code
            return false;
        }

        char[]a = name.toCharArray();
        char[]b = name2.toCharArray();


        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b);




    }


}
