package com.session;

import java.util.HashMap;
import java.util.Map;

public class Practice {
    public static void main(String[] args) {
        Map<String, HashMap<String, String>> map = new HashMap<>();
        HashMap<String, String> innerMap = new HashMap<>();
        innerMap.put("DEFERMENT_PERIOD", "NUMBER");
        map.put("PROPOSAL_ADD_DTL", innerMap);

        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        String s = map.get("PROPOSAL_ADD_DTL".toUpperCase()).get("DEFERMENT_PERIOD".toUpperCase());
        System.out.println(s);
    }
}
