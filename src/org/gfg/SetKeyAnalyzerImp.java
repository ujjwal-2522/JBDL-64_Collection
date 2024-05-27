package org.gfg;

import java.util.*;

public class SetKeyAnalyzerImp implements KeyAnalyzer{

    Set<String> set;

    public SetKeyAnalyzerImp(){
        //set=new HashSet<>();/we will not get sequence
       // set=new LinkedHashSet<>();//we will get the data in sequence
       // set =new TreeSet<>();//to get data in sorted order(alphabetic order)
        set =new TreeSet<>(Comparator.reverseOrder());//to get data in reverse sorted order

    }
    @Override
    public void storeKeyword(String keyword) {
        set.add(keyword);
    }

    @Override
    public List<String> getAllkeywords() {
        List<String> list =new ArrayList<>(set);
        return list;
    }
}
