package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("문제 1 - 자동차 설계도를 만들어주세요.");
        // class Car 하단에 생성
        System.out.println("문제 2 - 자동차 객체를 연결될(담을) 변수를 만들어주세요.");
        Car car1 = new Car();

        System.out.println("문제 3 - 자동차 객체를 만들고 변수에 연결해(담아)주세요.");
        Car car2;
        car2 = new Car();

        System.out.println("문제 4 - 자동차 객체마다 서로 다른 최고속력를 가지도록 해주세요.");
        car1.차종 = "첫번째";
        car1.차량번호 = "1가";
        car1.최고속력 = 200;
        car2.차종 = "두번째";
        car2.차량번호 = "2나";
        car2.최고속력 = 250;

        System.out.println("문제 5 - 1개의 자동차가 3번 달리게 해주세요.");
        for (int i = 0; i < 3; i++) {
            car1.Run();
        }

        System.out.println("문제 6 - 객체를 사용하지 않고 두번째 플레이어를 만들어주세요.");
        Car player = car1;

        System.out.println("== player ==");
        System.out.println(player.차종);
        System.out.println(player.차량번호);
        System.out.println(player.최고속력);
        System.out.println("결과 : car1과 참조값이 같고 위에서 변경한 값이 반영된다.");
        System.out.println("====");

        System.out.println("문제7 - 3개의 자동차가 각각 1번씩 달리게 해주세요.");
        Car[] cars = new Car[3];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car();
        }

        cars[0].차종 = "넘버원";
        cars[0].차량번호 = "가가1";
        cars[0].최고속력 = 100;
        cars[1].차종 = "넘버투";
        cars[1].차량번호 = "나나2";
        cars[1].최고속력 = 200;
        cars[2].차종 = "넘버쓰리";
        cars[2].차량번호 = "다다3";
        cars[2].최고속력 = 300;

        for (int i = 0; i < cars.length; i++) {
            cars[i].Run();
        }

        System.out.println("====");
        System.out.println("문제8 - 각각의 자동차가 서로 다른 최고속력으로 달리게 해주세요.");

        cars[0].최고속력 = 120;
        cars[1].최고속력 = 220;
        cars[2].최고속력 = 320;

        for (int i = 0; i < cars.length; i++) {
            cars[i].Run();
        }
        System.out.println("====");
        System.out.println("문제9 - 번호가 다른 각각의 자동차가 서로 다른 최고속력으로 달리게 해주세요.");

        for (int i = 0; i < cars.length; i++) {
            cars[i].최고속력 = 100 + (10 * i);
            cars[i].Run();
        }


    }
}

class Car {
    String 차종;
    String 차량번호;
    int 최고속력;

    void Run() {
        System.out.println(this.차량번호 + " , " + this.차종 + " is " + this.최고속력 + "km/h Run!");
    }

}