package com.LeetCode;

import java.util.*;

public class Demo02 {

    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        int sum = 0;
        int num = 0;
        int count = 0;
        HashMap<Integer,Integer> hashMap= new HashMap<>();
        for (int i = 0; i <arr.length ; i++) {
            if(hashMap.containsKey(arr[i])){
                int val = hashMap.get(arr[i]);
                hashMap.put(arr[i],val+1);
            }
            else{
                hashMap.put(arr[i],1);
            }
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(hashMap.entrySet());
        list.sort(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i).getKey()+":"+list.get(i).getValue());
            if(list.get(i).getValue()==1){
                num++;
            }
        }
        System.out.println("----num:"+num);
        System.out.println("----删除操作-----");
        if(num<k){
            for (int i = 0; i <num ; i++) {
                System.out.println(list.get(i).getKey()+":"+list.get(i).getValue());
                //list.remove(i);
                System.out.println("删除1");
            }
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i).getKey()+":"+list.get(i).getValue());
            }
            System.out.println(list.size());
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i).getKey()+":"+list.get(i).getValue());
                for (int j = list.get(i).getValue(); j >0 ; j--) {
                    count++;
                    if(count>=list.get(i).getValue()){
                        list.remove(i);
                        System.out.println("执行了remove");
                    }
                    while (count>=(k-num)){
                        break;
                    }
                }
            }
            System.out.println("count:"+count);
            System.out.println("sum:"+sum);
            System.out.println(list.size());

        } else {
            for (int i = 0; i <k ; i++) {
                list.remove(i);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getKey()+":"+list.get(i).getValue());
        }
        System.out.println(list.size());
        return list.size() ;

    }

    public static void main(String[] args) {
        Demo02 demo02 = new Demo02();
        int[] arr = {4,3,1,1,3,3,2};
        //int[] arr = {2,1,1,3,3,3};
        //int[] arr = {5,5,4};
        demo02.findLeastNumOfUniqueInts(arr,3);
    }

}
