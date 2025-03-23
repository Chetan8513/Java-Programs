package test;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Problem4 {


    public static void main(String[] args) {


        String name = "chetannnnn";


        Map<Character,Long> resultt=  name.chars().mapToObj(n->(char)n).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(resultt);

        // thro noemal way how can i do that lets see

        Map<Character, Integer> result = new HashMap<>();

        for (int i = 0; i < name.length(); i++) {

            char c = name.charAt(i);

            result.put(c,result.getOrDefault(c,0)+1);

        }

        for(Map.Entry<Character,Integer>names:result.entrySet()){
         System.out.println(names.getKey()+"->"+names.getValue());
        }

    }
}

