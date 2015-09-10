package com.shawn.algo.sort;

import java.util.List;
import java.util.ArrayList;
import java.lang.Math;
import java.lang.Number;
import java.util.Random;

interface Sort<T>{
    public List<T> sort(List<T> input);
}

class Quick<T> implements Sort<T>{
    public List<T> sort(List<T> input){
        List<T> out;
        int size = input.size();
        //List<T> out = new ArrayList<T>(size);
        out = qsort(0, size, input);
        return out;
    };

    public List<T> qsort(int left, int right, List<T> list){
        if (left > right){
            return list;
        }
        int curPos = left;
        T curValue = list.get(curPos);
        for(int i = left; i < right; i++){
            if ((Number)curValue.compareTo(list.get(i)) > 0){
                T tmp = curValue;
                curValue = list.get(i);
                list.set(i, tmp);
                curPos = i;
            }
        } 

        list = qsort(left, curPos, list);
        list = qsort(curPos + 1, right, list);
        return list;
    }
}

public class QuickSort{
    static class TestClass{
        public static void main(String args[]){
            System.out.println("quick sort demo begin.");
            List<Integer> testList = new ArrayList<Integer>(100);
            Random rand = new Random();

            for (int i=0; i < 100; i++){
                Integer item = new Integer(rand.nextInt(100));
                testList.add(item);
            }

            Quick<Integer> qs = new Quick<Integer>();

            ArrayList<Integer> out = (ArrayList<Integer>)qs.sort(testList);
            for (Integer inte : out){
                System.out.print(inte + ",");
            }
            System.out.println("end");
        }
    }
}
