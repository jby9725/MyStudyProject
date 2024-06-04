package org.example;

// 문제 : 객체화 없이 설계도에 있는 능력을 바로 사용해주세요.
// 문제 : 아래 코드가 실행되도록 자동차 클래스를 만들어주세요.

class Main {
    public static void main(String[] args) {
        // 자동차.달리다();
        Car.run();
    }
}

class Car {
    static void run() {
        System.out.println("자동차가 달린다.");
    }
}