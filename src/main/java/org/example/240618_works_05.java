//package org.example;
//
//// 문제 - 전사가 들고 있는 무기에 의해서 서로 다른 공격형태를 보이도록 해주세요.(매개변수 사용금지)
//// 문제 : 아래가 실행되도록 해주세요.
//
//class Main {
//    public static void main(String[] args) {
//        전사 a전사 = new 전사();
//
//        String 이름 = "칸";
//        a전사.name = 이름;
//        a전사.age = 20;
//        a전사.자기소개();
//
//        a전사.age++;
//        a전사.자기소개();
//
//        a전사.age = 30;
//        a전사.name = "카니";
//        a전사.자기소개();
//
//        a전사.a무기 = new 활();
//        a전사.공격();
//        // 출력 : 카니가 활로 공격합니다.
//
//        a전사.a무기 = new 칼();
//        a전사.공격();
//        // 출력 : 카니가 칼로 공격합니다.
//    }
//}
//
//class 전사 {
//    // 인스턴스 변수
//    String name;
//    // 인스턴스 변수
//    int age;
//    // 인스턴스 변수
//    무기 a무기;
//
//    void 자기소개() {
//        System.out.println("안녕하세요. 저는 " + this.age + "살 " + this.name + " 입니다.");
//    }
//
//    void 공격() {
//        a무기.owner = this.name;
//        a무기.공격();
//    }
//}
//
//class 무기 {
//    String owner;
//    String type;
//
//    void 공격() {
////        System.out.println(this.owner + "이(가) " + this.type + "로 공격합니다.");
//    }
//}
//
//class 칼 extends 무기 {
//    void 공격() {
//        this.type = "칼";
//        System.out.println(this.owner + "이(가) " + this.type + "로 공격합니다.");
//    }
//}
//
//class 활 extends 무기 {
//    void 공격() {
//        this.type = "활";
//        System.out.println(this.owner + "이(가) " + this.type + "로 공격합니다.");
//    }
//}