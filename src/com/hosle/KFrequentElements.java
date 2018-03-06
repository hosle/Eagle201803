package com.hosle;

import java.util.*;


/**
 * Created by tanjiahao on 2018/3/5.
 * Eagle201803
 */
public class KFrequentElements {

    public List<Integer> topKFrequent(int[] nums, int k) {
        LinkedList<Map.Entry<Integer,Integer>> result = new LinkedList<>();
        LinkedList<Integer> resultFinal = new LinkedList<>();

        HashMap<Integer,Integer> frequentMap = new HashMap<>();

        for(int item : nums){
            Integer frequency = frequentMap.get(item);

            if (frequency == null) frequency = 1;
            else ++frequency;

            frequentMap.put(item,frequency);
        }

        for(Map.Entry<Integer,Integer> entry : frequentMap.entrySet()){
            result.add(entry);
        }

        result.sort((o1, o2) -> o2.getValue() - o1.getValue());

        for(int i =0; i <k; i++){
            resultFinal.add(result.get(i).getKey());
        }

        return resultFinal;

    }

    public List<Integer> topKFrequentWithTreeMap(int[] nums,int k){
        TreeMap<Integer,LinkedList<Integer>> frequentData = new TreeMap<>();

        HashMap<Integer,Integer> frequentMap = new HashMap<>();

        for(int item : nums){
            frequentMap.put(item,frequentMap.getOrDefault(item,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry: frequentMap.entrySet()){
            int frequent = entry.getValue();
            if(!frequentData.containsKey(entry.getValue())){
                frequentData.put(frequent,new LinkedList<>());
            }

            frequentData.get(frequent).add(entry.getKey());

        }

        LinkedList<Integer> result =  new LinkedList<>();

        while(result.size()<k){
            Map.Entry<Integer,LinkedList<Integer>> entry = frequentData.pollLastEntry();
            result.addAll(entry.getValue());
        }

        return result;

    }
}
