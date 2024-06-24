//package org.example;
//
//import java.util.stream.IntStream;
//
//class Main {
//    public static void main(String[] args) {
//
//        System.out.println("일반");
//        for (int i = 1; i < 11; i++) {
//            System.out.print(i + " ");
//        }
//
//        System.out.println("\n스트림");
//        IntStream.range(1, 11).forEach(e -> System.out.print(e + " "));
//
//        System.out.println("\n스트림2");
//        IntStream.range(1, 11)
//                .forEach(System.out::print);
//    }
//}
