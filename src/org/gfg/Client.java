package org.gfg;

public class Client {
    public static void main(String[] args) {
//        KeyAnalyzer keyAnalyzer =new ListKeyAnalyzerimp();
//        keyAnalyzer.storeKeyword("pen");
//        keyAnalyzer.storeKeyword("pencil");
//        keyAnalyzer.storeKeyword("pen");
//        keyAnalyzer.storeKeyword("pencil");
//        keyAnalyzer.storeKeyword("mobile");
//        keyAnalyzer.storeKeyword("laptop");
//        keyAnalyzer.storeKeyword("hoodie");
//        keyAnalyzer.storeKeyword("laptop");
//        keyAnalyzer.storeKeyword("table");
//        System.out.println(keyAnalyzer.getAllkeywords());

//        KeyAnalyzer keyAnalyzer =new SetKeyAnalyzerImp();
//        keyAnalyzer.storeKeyword("pen");
//        keyAnalyzer.storeKeyword("pencil");
//        keyAnalyzer.storeKeyword("pen");
//        keyAnalyzer.storeKeyword("pencil");
//        keyAnalyzer.storeKeyword("mobile");
//        keyAnalyzer.storeKeyword("laptop");
//        keyAnalyzer.storeKeyword("hoodie");
//        keyAnalyzer.storeKeyword("laptop");
//        keyAnalyzer.storeKeyword("table");
//        System.out.println(keyAnalyzer.getAllkeywords());


        KeyAnalyzer keyAnalyzer =new MapKeyAnalyzerImp();
        keyAnalyzer.storeKeyword("pen");
        keyAnalyzer.storeKeyword("pencil");
        keyAnalyzer.storeKeyword("pen");
        keyAnalyzer.storeKeyword("pencil");
        keyAnalyzer.storeKeyword("mobile");
        keyAnalyzer.storeKeyword("laptop");
        keyAnalyzer.storeKeyword("hoodie");
        keyAnalyzer.storeKeyword("laptop");
        keyAnalyzer.storeKeyword("table");
        System.out.println(keyAnalyzer.getKeysFrequency ());

    }
}
