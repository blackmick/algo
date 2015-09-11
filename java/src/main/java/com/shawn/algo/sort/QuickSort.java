package com.shawn.algo.sort;

import java.util.List;
import java.util.ArrayList;
import java.lang.Math;
import java.lang.Number;
import java.util.Random;

interface Sort{
    public List<Integer> sort(List<Integer> input);
}

class Quick implements Sort{
    public List<Integer> sort(List<Integer> input){
        List<Integer> out;
        int size = input.size();
        System.out.println("size:"+size);
        //List<T> out = new ArrayList<T>(size);
        out = qsort(input);
        return out;
    };

    public List<Integer> qsort(List<Integer> list){
        if (list.size() <= 1){
            return list;
        }

        List<Integer> leftList = new ArrayList<Integer>();
        List<Integer> rightList = new ArrayList<Integer>();
        int curPos = 0;
        Integer curValue = list.get(curPos);
        for(int i = 1; i < list.size(); i++){
            Integer val = list.get(i);
            if (curValue.compareTo(val) >= 0){
                leftList.add(val);
            }else{
                rightList.add(val);
            }
        }

        System.out.println("left size:"+leftList.size()+",right size:"+rightList.size());
        leftList= qsort(leftList);
        rightList = qsort(rightList);
        leftList.add(curValue);
        leftList.addAll(rightList);
        return leftList;
    }
}

public class QuickSort{
    static class TestClass{
        public static void main(String args[]){
            System.out.println("quick sort demo begin.");
            List<Integer> testList = new ArrayList<Integer>(100);
            Random rand = new Random();

            for (int i=0; i < 10; i++){
                Integer item = new Integer(rand.nextInt(100));
                testList.add(item);
            }

            Quick qs = new Quick();
            for (Integer it : testList){
                System.out.print(it + ",");
            }

            ArrayList<Integer> out = (ArrayList<Integer>)qs.sort(testList);
            for (Integer inte : out){
                System.out.print(inte + ",");
            }
            System.out.println("");
            System.out.println("end");
        }
    }
}
