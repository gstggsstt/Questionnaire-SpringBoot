package com.example.demo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component("storage")
public class OneTimeStorage {
    @Getter @Setter
    private static Map<Integer,Form> forms = new HashMap<>();
    @Getter @Setter
    private static Map<Integer,List<String>> results = new HashMap<>();
    private static int cnt=(int)(100000+Math.random()*(1000000-100000));
    public static int newCnt(){
        return ++cnt;
    }
    public static void put(int x, String s){
        results.computeIfAbsent(x, k -> new ArrayList<>());
        results.get(x).add(s);
    }
}
