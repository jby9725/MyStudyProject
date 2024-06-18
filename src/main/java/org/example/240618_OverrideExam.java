//package org.example;
//
///* 요구사항
//- D1 요구 : 오리를 생성하고 날게하시오.
//- D1 완료 : 클래스와 메서드를 만들어서 처리
//- D2 요구 : 게임의 디테일을 살리기 위해서 `청둥오리`와 `흰오리`를 생성하고 날게하시오.
//- D2 완료 : 클래스와 메서드를 만들어서 처리
//- D3 요구 : 오리 계열의 클래스에 날다 메서드가 중복되었습니다. 중복을 제거해주세요.
//- D3 완료 : 상속을 사용해서 처리
//- D4 요구 : 게임의 재미를 위하여 고무오리를 추가하고 날게 하시오.
//- D4 완료 : 클래스와 메서드를 만들어서 처리
//- D5 요구 : 주말 주주회의에서 고무오리가 하늘을 날아다니는 것에 대해서 태클이 들어왔습니다. 고무오리 계열은 하늘을 날 수 없게 해주세요.
//- D5 완료 : 메서드 오버라이드를 사용해서 처리
//- D6 요구 : 고무오리가 반응이 좋습니다. 고무2오리를 추가하고 날게 해주세요.
//- D6 완료 : 고무오리가 반응이 좋습니다. 고무2오리를 추가하고 날게 해주세요.
//- D7 요구 : 고무오리계열에서 날다 메서드의 중복을 제거해주세요.
//- D7 완료 : 상속으로 해결
//- D8 요구 : 자바에서 다중상속은 불가능 합니다. 상속에는 한계가 있습니다. 복잡한 상속을 사용하지 않고 고무오리계열의 중복을 제거해주세요.
//  - 복잡한 상속을 사용하지 않는다는 것의 의미 : 모든 오리 계열 클래스들은 부모클래스가 오리 클래스여야 한다.
//*/
//
//class Main {
//    public static void main(String[] args) {
//        청둥오리 a청둥오리 = new 청둥오리();
//        a청둥오리.날다();
//        // 출력 : 오리가 날개로 날아갑니다.
//
//        흰오리 a흰오리 = new 흰오리();
//        a흰오리.날다();
//        // 출력 : 오리가 날개로 날아갑니다.
//
//        고무오리 a고무오리 = new 고무오리();
//        a고무오리.날다();
//        // 출력 : 저는 날 수 없어요. ㅜㅠ
//
//        고무2오리 a고무2오리 = new 고무2오리();
//        a고무2오리.날다();
//        // 출력 : 저는 날 수 없어요. ㅜㅠ
//    }
//}
//
//class 오리 {
//    void 날다() {
//        System.out.println("오리가 날개로 날아갑니다.");
//    }
//}
//
//class 고무2오리 extends 오리 {
//    // 메소드 오버라이드
//    @Override
//    void 날다() {
//        System.out.println("저는 날 수 없어요. ㅠㅠ");
//    }
//}
//
//class 고무오리 extends 오리 {
//    // 메소드 오버라이드
//    @Override
//    void 날다() {
//        System.out.println("저는 날 수 없어요. ㅠㅠ");
//    }
//}
//
//class 청둥오리 extends 오리 {
//
//}
//
//class 흰오리 extends 오리 {
//
//}
//
//
////// 문제 : 아래와 같이 출력되도록 해주세요.
////// 조건 : `숨쉬다` 기능을 중복하지 말아주세요.
////class 동물 {
////    void 숨쉬다() {
////        System.out.println("숨쉬다.");
////    }
////}
////
////class 사람 extends 동물 {
////    void 뛰다() {
////        System.out.println("뛰다.");
////    }
////}