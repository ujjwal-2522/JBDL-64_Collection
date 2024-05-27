package org.gfg;

import java.util.List;
import java.util.Map;

public interface KeyAnalyzer  {

    //Contract
    //what i am gonna get
    void storeKeyword(String keyword);

    //what i am gonna return
    List<String> getAllkeywords();

    default Map<String,Integer> getKeysFrequency(){
        return null;
    }
    default Map<String,Integer> getTop5records(){
        return null;
    }
}
