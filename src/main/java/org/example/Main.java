package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // 선언
        // (제네릭된) 리스트
        List<Integer> ages = new ArrayList<>();
        // (제네릭된) 맵
        Map<String, Integer> ages2 = new HashMap<>();

        // 요소 추가
        // 리스트
        ages.add(20);
        ages.add(30);
        ages.add(40);
        // 맵
        ages2.put("John", 20);
        ages2.put("Jane", 30);
        ages2.put("Jack", 40);

        // 요소 조회
        // 리스트
        System.out.println("철수 나이 : " + ages.get(0));
        System.out.println("영희 나이 : " + ages.get(1));
        System.out.println("영수 나이 : " + ages.get(2));
        // 맵
        System.out.println("Jone's age : " + ages2.get("John"));
        System.out.println("Jane's age : " + ages2.get("Jane"));
        System.out.println("Jack's age : " + ages2.get("Jack"));


    }
}
