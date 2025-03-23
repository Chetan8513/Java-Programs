package test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Problem3 {





    // i need to find outeven odd from the alist

    public static void main(String[] args) {

        List<Integer>list = Arrays.asList(2,4,812,3,4,3,6,7,23,43,54,23,342);

  Map<Boolean ,List<Integer>>result =  Problem3.checkEvenOdd(list);

     System.out.println("even number is:"+result.get(true) );

     System.out.println("odd number is"+result.get(false));

    }







    public static Map<Boolean,List<Integer>> checkEvenOdd(List<Integer>list){


        return list.stream().collect(Collectors.partitioningBy(n->n%2==0));


    }
}
