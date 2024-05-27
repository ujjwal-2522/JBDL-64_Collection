package org.gfg;

import java.util.*;

public class MapKeyAnalyzerImp implements KeyAnalyzer{

    public Map<String,keyword> hmap;

    public Queue<Keyword> queue;

    public MapKeyAnalyzerImp(){
        //hmap=new HashMap<>();
       // hmap=new LinkedHashMap<>();//to get in decreasing order
        hmap=new TreeMap<>();//to get in alphabetical order
        queue=new PriorityQueue<>(comparator );

    }
    Comparator<Keyword> comparator=new Comparator<Keyword>() {
        @Override
        public int compare(Keyword o1, Keyword o2) {
           return Integer.compare(o1.getCount(),o2.getCount());
        }
    };


    @Override
    public void storeKeyword(String keyword) {
        int count=1;
        Keyword k=new Keyword(keyword,count);
        if(hmap.containsKey(keyword)){
            Keyword keyword1 = hmap.get(keyword);
            count=count+1;
            hmap.put(keyword,count);
        }else {
            hmap.put(keyword,1);
        }

    }

    @Override
    public List<String> getAllkeywords() {
        return null;
    }
    @Override
    public Map<String,Integer> getKeysFrequency(){
        return hmap;
    }
    @Override
    public Map<String,Integer> getTop5records(){
        return hmap;
    }
}
