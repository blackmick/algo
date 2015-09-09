package com.shawn.algo.sort;

import java.util.List;
import java.util.ArrayList;
import java.lang.Math;

interface Sort{
    public List<Object> sort(List<Object> origList);
}
class Quick implements Sort{
    public List<Object> sort(List<Object> origList){
        int length = origList.size();
        List<Object> out = new ArrayList<Object>(length);
        return out;
    };

    public List<Object> qsort(int left, int right, List<Object> list){
        return list;
    }
}

public class QuickSort{
    static class TestClass{
        public static void main(String args[]){
            System.out.println("quick sort demo begin.");
            List<Integer> testList = new ArrayList<Integer>(100);

            for (int i=0; i < 100; i++){
                Integer item = new Integer(Math.rand)
            }
        }
    }
}
