package com.company.demo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 4. 단어 뒤집기
 * 설명
 *
 * N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
 *
 *
 * 입력
 * 첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
 *
 * 두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.
 *
 *
 * 출력
 * N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.
 * */

/**
 * 예시 입력
 * 3
 * good
 * Time
 * Big
 *
 * 예시 출력
 * doog
 * emiT
 * giB
 * */

public class Main {

    public ArrayList<String> solution(int num, String[] strArr) {

        ArrayList<String> arrayList = new ArrayList<>();

        for (String s : strArr) { // String[] 순환
            char[] c = s.toCharArray(); // String 을 char[] 배열로 생성

            int first = 0, last = s.length() - 1; // 단어의 맨 앞과 맨 끝을 초기값으로 지정

            while (first < last) { // 앞의 인덱스 값이, 마지막 인덱스값보다 작은 경우에만 실행
                char temp = c[first];
                c[first] = c[last];
                c[last] = temp; // first 와 last 위치 바꾼 후
                first++; // first 증가 last 감소 Tile => (1,4)=eimT => (2,3)=emiT
                last--;
            }

            String tmp = String.valueOf(c);
            arrayList.add(tmp);
        }

        return arrayList;
    }

    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(); // 첫 번째 숫자를 읽어드림

        String[] strArr = new String[num]; // 입력한 String 이 담길 배열 미리 생성

        for (int i = 0; i < strArr.length; i++) { // String 배열 길이만큼 입력값 받기
            strArr[i] = sc.next();
        }

        for (String s : T.solution(num, strArr)) { // solution 에서 반환되는 list 를 출력 (배열을 돌면서 문자열을 뒤집음)
            System.out.println(s);
        }
    }
}
