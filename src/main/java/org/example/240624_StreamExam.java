//package org.example;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//// 백준 	11382번 문제풀이. 꼬마 정민, 스트림 적용
//class Main {
//    public static void main(String[] args) {
//
//        // Scanner. 입력받는 곳
//        Scanner scanner = new Scanner(System.in);
//
//        // 입력받아 저장
//        String[] numbers = scanner.nextLine().split(" ");
//
////        long sum = 0;
////
////        for(String number : numbers) {
////            sum += Long.parseLong(number);
////        }
//
//        // >>>>>>> 스트림 쓰는 곳에 브레이크 포인트를 사용하여 상세 디버깅이 가능하다.
//        // 점 세개 다음 트레이스 커런트 스트림 체인 옵션을 보면 된다. 근데 될때도 있고 안될때도 있는게 문제가 무엇인지 모르겠다..
//
//        long sum = Arrays.stream(numbers) // 1
//                .peek(e -> System.out.println(e))
//                .mapToLong(e -> Long.parseLong(e)) // 2 ~ 4
//                .sum(); // 5
//
//        // 1. 스트림화 s[ "1" , "2" , "3" ] 순서있고 뭉쳐있다. 하지만 배열에 비해 연산하기에 편한 형태
//        // 2. 맵핑(쉽게 말해 매칭)
//        // 3. 한 string을 long으로 맵핑 > 변환이 된다.. e는 여기서 요소 하나하나를 뜻한다. 이름은 사용자지정
//        // 4. 맵핑하고 롱타입으로 바꾸기
//        // 5. 롱타입으로 바꾼 결과들을 모두 더하기 sum()
//
//        System.out.println(sum);
//
//        scanner.close();
//    }
//}
//
////package org.example;
////
////import java.util.Arrays;
////import java.util.Scanner;
////import java.util.stream.Stream;
////
////// 백준 	11382번 문제풀이. 꼬마 정민, 스트림 적용
////class Main {
////    public static void main(String[] args) {
////
////        // Scanner. 입력받는 곳
////        Scanner scanner = new Scanner(System.in);
////
////        // 입력받아 저장
////        String str = scanner.nextLine();
////        String[] numbers = str.split(" ");
////        // 스트림 사용
////        Stream<String> stream = Arrays.stream(numbers);
////
//////        for(String str : stream)
//////            System.out.println(str);
////        // 위와 같은 코드
////        stream.forEach(num -> System.out.println(num));
////
////        long[] nums = new long[numbers.length];
////        stream.forEach(num -> nums = Long.parseLong(num));
////
////        // 파싱해서 변수에 넣기 << 반복으로 처리가능
//////        long num1 = Long.parseLong(numbers[0]);
//////        long num2 = Long.parseLong(numbers[1]);
//////        long num3 = Long.parseLong(numbers[2]);
////        // 반복문
//////        for (int i = 0; i < numbers.length; i++) {
//////            nums[i] = Long.parseLong(numbers[i]);
//////        }
////        // 스트림
////        // LongStream longStream = LongStream.of(num1, num2, num3);
//////        LongStream longStream = LongStream.of(num1, num2, num3);
////
//////        long sum = num1 + num2 + num3;
////
//////        System.out.println(sum);
////
////
////        scanner.close();
////    }
////}