package org.example;

class Main {
    public static void main(String[] args) {
        System.out.println("문제 1 - 매개변수를 사용해서 문제를 풀어주세요.");

        계산기 계산기 = new 계산기();

        계산기.더한결과를_화면에_출력(10, 20);
        // 출력 => 결과 : 30
        계산기.더한결과를_화면에_출력(50, 20);
        // 출력 => 결과 : 70
        계산기.뺀결과를_화면에_출력(50, 20);
        // 출력 => 결과 : 30
        계산기.뺀결과를_화면에_출력(5, 2);
        // 출력 => 결과 : 3
        계산기.곱한결과를_화면에_출력(5, 2);
        // 출력 => 결과 : 10

        System.out.println("문제 2 - 함수를 실행하면 값을 돌려주도록 만들어주세요.");
        int 결과;

        결과 = 계산기.합(10, 20);
        System.out.println("결과 : " + 결과);
        // 출력 => 결과 : 30

        결과 = 계산기.합(30, 20);
        System.out.println("결과 : " + 결과);
        // 출력 => 결과 : 50

        결과 = 계산기.합(30, 70);
        System.out.println("결과 : " + 결과);
        // 출력 => 결과 : 100

        결과 = 계산기.차(30, 70);
        System.out.println("결과 : " + 결과);
        // 출력 => 결과 : -40

        결과 = 계산기.곱(3, 7);
        System.out.println("결과 : " + 결과);
        // 출력 => 결과 : 21

        System.out.println("문제 3 - 1부터 n까지의 합을 반환하는 함수");
        // 예시 시작
        int c = 20 + Math.더하기(10, 20);
        System.out.println(c);
        // 예시 끝

        int 결과1 = Math.oneToSum(3);
        System.out.println("결과1 : " + 결과1);
        // 출력 : 결과1 : 6

        int 결과2 = Math.oneToSum(10);
        System.out.println("결과2 : " + 결과2);
        // 출력 : 결과2 : 55

        System.out.println("문제 3 - n부터 m까지의 합을 반환하는 함수");
        결과1 = Math.nToMSum(2, 3);
        System.out.println("결과1 : " + 결과1);
        // 출력 : 결과1 : 5

        결과2 = Math.nToMSum(5, 10);
        System.out.println("결과2 : " + 결과2);
        // 출력 : 결과2 : 45

    }
}

class 계산기 {
    // 반환형이 void 이기 때문에 return 할 값이 없고, print문만 작성
    void 더한결과를_화면에_출력(int a, int b) {
        System.out.println("더한결과를_화면에_출력 : " + (a + b));
    }

    void 뺀결과를_화면에_출력(int a, int b) {
        System.out.println("뺀결과를_화면에_출력 : " + (a - b));
    }

    void 곱한결과를_화면에_출력(int a, int b) {
        System.out.println("곱한결과를_화면에_출력 : " + (a * b));
    }

    // 반환형이 int로 각 메서드가 반환해야하는 값을 return
    int 합(int a, int b) {
        return a + b;
    }

    int 차(int a, int b) {
        return a - b;
    }

    int 곱(int a, int b) {
        return a * b;
    }
}

//        문제 - 1부터 n까지의 합을 반환하는 함수
class Math {
    // static => 본사직원
    // static은 현재 클래스에 지금당장 존재한다.
    static int 더하기(int a, int b) {
        // 메인 메서드의 int c와 아래 int c는 전혀 관계가 없다.
        int c = a + b;

        // return 값의 타입과 함수명의 앞부분이 같아야 한다.
        // return => 변신
        return c;
    }

    //        문제 - 1부터 n까지의 합을 반환하는 함수
    public static int oneToSum(int n) {

        int sum = 0;

        // for 1부터 n 까지 반복
        for (int i = 1; i <= n; i++) {
            // sum 변수에 1부터 n까지 증가하며 차례대로 값 더해짐
            sum += i;
        }
        return sum;
    }

    //        문제 - n부터 m까지의 합을 반환하는 함수
    public static int nToMSum(int n, int m) {
        int sum = 0;

        int min = n;
        int max = m;

        // 만약 n이 m보다 클 경우
        if (n > m)
        {
            min = m;
            max = n;
        }

        // 작은 수부터 큰 수까지 반복
        for (int i = min; i <= max; i++) {
            sum += i;
        }

        return sum;
    }
}