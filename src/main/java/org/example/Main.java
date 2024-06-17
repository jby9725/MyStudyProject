package org.example;

// 문제 : 1부터 n까지 소수의 갯수를 출력하는 함수

class Main {
    public static void main(String[] args) {
//
//        boolean rs1 = Math.isPrimeNumber(1);
//        System.out.println("1은(는) 소수인가? : " + rs1); // N
//
//        rs1 = Math.isPrimeNumber(2);
//        System.out.println("2은(는) 소수인가? : " + rs1); // Y
//
//        rs1 = Math.isPrimeNumber(4);
//        System.out.println("4은(는) 소수인가? : " + rs1); // N
//
//        rs1 = Math.isPrimeNumber(7);
//        System.out.println("7은(는) 소수인가? : " + rs1); // Y
//
//
//        int rs2 = Math.one_to_n_prime_numbers_count(10);
//        System.out.println("rs : " + rs2);
//
//        rs2 = Math.one_to_n_prime_numbers_count(13);
//        System.out.println("rs : " + rs2);

        int rs = Solution.solution(10);
        System.out.println("4가 나오나요? : " + rs);

        rs = Solution.solution(5);
        System.out.println("3이 나오나요? : " + rs);

    }
}

class Solution {
    public static int solution(int n) {
        int answer = 0;
        int count = 0;

        for (int i = 1; i <= n; i++) {
            count = 0;

            if (n == 1) {
                continue;
            }
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                answer++;
            }
        }

        return answer;
    }

}

class Math {

    // 방법 1. 2 ~ n-1 약수 찾으면 return false, 아니면 return true
    // 방법 2. 약수의 개수 총 2개
    // 방법 3. 약수의 합 본인 + 1
    static boolean isPrimeNumber(int n) {

        if (n == 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    static int one_to_n_prime_numbers_count(int n) {
        int rs = 0;

        for (int i = 1; i <= n; i++) {
            if (isPrimeNumber(i))
                rs++;
        }

        return rs;
    }
}