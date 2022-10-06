package _1006.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class PrintMap {
    private Set<String> mapKeySet;
    private HashMap<String,String> hMap;
    private Iterator<String> it;

    public PrintMap (HashMap<String,String> hMap){
        this.hMap=hMap;
        this.mapKeySet=hMap.keySet();
        this.it = mapKeySet.iterator();
    }
    public void Print(){
        while(it.hasNext()){
            String key = it.next();
            String value = hMap.get(key);
            System.out.println("이름: "+key+" 깃 주소: "+value);
        }
    }
}
