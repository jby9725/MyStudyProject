//package org.example;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
//
//class Main {
//    public static void main(String[] args) {
//
//        System.out.println("== 일반 ==");
//        int[] arr = {33, 2, 55, 4, 51, 6, 71, 18, 29, 10};
//
//        List<Integer> integerList = new ArrayList<>();
//
//        // filter
//        for (int n : arr) if (n % 2 == 0) integerList.add(n);
//
//        // map
//        for (int i = 0; i < integerList.size(); i++) {
//            int newValue = integerList.get(i) * 2;
//            integerList.set(i, newValue);
//        }
//
//        System.out.println(integerList);
//
//        System.out.println("== 스트림 Collect ==");
//        arr = new int[]{33, 2, 55, 4, 51, 6, 71, 18, 29, 10};
//
//        integerList = Arrays.stream(arr)
//                .filter(e -> e % 2 == 0)
//                .map(e -> e * 2) // e << stream
//                .boxed() // new Integer
//                .collect(Collectors.toList());
//
//        System.out.println(integerList);
//
////        System.out.println("==============================");
////
////        System.out.println("== 일반 ==");
////        // 짝수와 홀수가 섞여있는 배열
////        int[] ints = {33, 2, 55, 4, 51, 6, 71, 18, 29, 10};
////
////        // 홀수가 걸러지고 짝수가 남을 배열의 크기
////        int reArrLen = 0;
////
////        // 배열의 크기 계산
////        for (int n : ints)
////            if (n % 2 == 0)
////                reArrLen++;
////
////        // 짝수만 남을 숫자 배열 생성
////        int[] rsArr = new int[reArrLen];
////        int rsArrLen = -1;
////
////        // 원본 배열에서 홀수면 넘어가고 짝수면 집어넣고 다음 인덱스에 넣기
////        for (int n : ints) {
////            if (n % 2 != 0) {
////                continue;
////            }
////            rsArr[++rsArrLen] = n;
////        }
////        // 짝수만 남은 배열 출력
////        System.out.println(Arrays.toString(rsArr));
////
////        System.out.println("== 스트림 filter ==");
////        // 짝수와 홀수가 섞여있는 배열
////        int[] ints_v2 = {33, 2, 55, 4, 51, 6, 71, 18, 29, 10};
////
////        int[] reArr_v2 = Arrays.stream(ints_v2)
////                .filter(i -> i % 2 == 0)
////                // .map(i -> i * 2) // 위로 한줄 올라갈수도 있다. 결과는 다르겠지만.
////                .toArray();
////
////        // 위 과정 : 스트림 생성 - (맵핑가능) - 필터링 - (맵핑가능) - 배열로 변경.
////        // 여기에 맵핑을 추가한다고 했을 때 필터링 전후로 모두 가능하다.
////
////        System.out.println(Arrays.toString(reArr_v2));
////
//////
//////        // 일반
////////        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
////////        for (int i = 0; i < arr.length; i++)
////////            arr[i] *= 2;
////////        System.out.println(Arrays.toString(arr));
//////
//////        // 스트림
//////        // v1
//////        System.out.println("v1");
//////        IntStream intstream = IntStream.range(1, 11) // int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//////                .map(i -> i * 2); // 맵핑. 의도 : 요소마다 2씩 곱하기
//////        // 맵핑을 아래에 따로 하면 오류가 나던데, 찾아보니 중복으로 컨트롤 하려고 하면 나는 오류.
//////        // 출력은 오류가 안나는 이유??? >> 이 줄은 생성. 그 다음 출력 (작업 한번) (스트림 사라짐) -> 그 다음 또 접근하려고 하니 에러나는 것
//////
//////        // 출력
//////        intstream.forEach(value -> {
//////            System.out.print(value + " ");
//////        });
//////
//////        System.out.println();
//////
//////        // v2
//////        System.out.println("v2");
//////        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//////
//////        int[] rsArray = Arrays.stream(arr)
//////                .map(e -> {
//////                    return e * 2;
//////                }).toArray();
//////
//////        System.out.println(Arrays.toString(rsArray));
//////
//////        // v3
//////        System.out.println("v3");
//////        int[] resultArr = Arrays.stream(arr)
//////                .map(e -> e * 2) // 이런식으로 줄여쓸 수 있다.
//////                .toArray();
//////
//////        System.out.println(Arrays.toString(resultArr));
//////
////////        System.out.println("일반");
////////        for (int i = 1; i < 11; i++) {
////////            System.out.print(i + " ");
////////        }
////////
////////        System.out.println("\n스트림");
////////        IntStream.range(1, 11).forEach(e -> System.out.print(e + " "));
////////
////////        System.out.println("\n스트림2");
////////        IntStream.range(1, 11)
////////                .forEach(System.out::print);
////////    }
//    }
//}
