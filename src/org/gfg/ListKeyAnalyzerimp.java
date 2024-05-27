package org.gfg;

import java.util.ArrayList;
import java.util.List;

public class ListKeyAnalyzerimp implements KeyAnalyzer{

    List<String> list;

    public ListKeyAnalyzerimp(){
        list=new ArrayList<>();
    }
    @Override
    public void storeKeyword(String keyword) {
        list.add(keyword);
    }

    @Override
    public List<String> getAllkeywords() {
        return list;
    }
}
