package org.cydeo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSums {

    public static void main(String[] args) {

        int [] myArray = {2,7,9,11};
        System.out.println(Arrays.toString(twoSum(myArray,9)));
        System.out.println(Arrays.toString(twoSum2(myArray,9)));



    }

    public static int[] twoSum(int[] array,int target){
        for(int i=0;i<array.length-1;i++){
            for(int j = i+1;j<array.length;j++)
                if((array[i]+array[j])==target) return new int[]{i,j};
        }
        return  new int[]{};
    }

    public static int[] twoSum2(int[] array,int target){
        Map<Integer,Integer> mapArray = new HashMap<>();
        for(int i=0;i<array.length;i++){
            int potentialMatch = target-array[i];
            if(mapArray.containsKey(potentialMatch)) return new int[]{i,mapArray.get(potentialMatch)};
            else mapArray.put(array[i],i);
        }
        return new int[]{};
    }


}
