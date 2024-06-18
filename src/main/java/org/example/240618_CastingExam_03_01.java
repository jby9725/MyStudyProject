//package org.example;
//
//// 문제 - 서로 다른 3종 TV를 서로 다른 종류의 리모콘 3개로 컨트롤
//// 문제 : 아래 코드가 실행되도록 해주세요.
//
//class Main {
//    public static void main(String[] args) {
//
//        System.out.println("문제 - 서로 다른 3종 TV를 서로 다른 종류의 리모콘 3개로 컨트롤\n" +
//                "문제 : 아래 코드가 실행되도록 해주세요.\n");
//
//        샤오미Tv a샤오미Tv = new 샤오미Tv();
//        삼성Tv a삼성Tv = new 삼성Tv();
//        LGTv aLGTv = new LGTv();
//
//        a샤오미Tv.켜기();
//        // 출력 => 샤오미Tv 켜집니다.
//        a샤오미Tv.끄기();
//        // 출력 => 샤오미Tv 꺼집니다.
//        a샤오미Tv.vr켜기();
//        // 출력 => 샤오미Tv vr켜기!
//
//        a삼성Tv.켜기();
//        // 출력 => 삼성Tv 켜집니다.
//        a삼성Tv.끄기();
//        // 출력 => 삼성Tv 꺼집니다.
//        a삼성Tv.ar켜기();
//        // 출력 => 삼성Tv ar켜기!
//
//        aLGTv.켜기();
//        // 출력 => LGTv 켜집니다.
//        aLGTv.끄기();
//        // 출력 => LGTv 꺼집니다.
//        aLGTv.게임모드전환();
//        // 출력 => LGTv 게임모드전환!
//    }
//}
//
//
//class 샤오미Tv {
//    String name = "샤오미Tv";
//
//    void 켜기(){
//        System.out.println(this.name + " 켜집니다.");
//    }
//    void 끄기(){
//        System.out.println(this.name + " 꺼집니다.");
//    }
//
//    void vr켜기() {
//        System.out.println("샤오미Tv vr켜기!");
//    }
//}
//
//class 삼성Tv {
//    String name = "삼성Tv";
//
//    void 켜기(){
//        System.out.println(this.name + " 켜집니다.");
//    }
//    void 끄기(){
//        System.out.println(this.name + " 꺼집니다.");
//    }
//
//    void ar켜기(){
//        System.out.println("삼성Tv ar켜기!");
//    }
//
//}
//
//class LGTv {
//    String name = "LGTv";
//
//    void 켜기(){
//        System.out.println(this.name + " 켜집니다.");
//    }
//    void 끄기(){
//        System.out.println(this.name + " 꺼집니다.");
//    }
//
//    void 게임모드전환(){
//        System.out.println("LGTv 게임모드전환!");
//    }
//}