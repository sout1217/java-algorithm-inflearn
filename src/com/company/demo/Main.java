package com.company.demo;

import java.util.Scanner;

/**
* 설명
 *
 * 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
 *
 * 문장속의 각 단어는 공백으로 구분됩니다.
 *
 *
 * 입력
 * 첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.
 *
 *
 * 출력
 * 첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한
 *
 * 단어를 답으로 합니다.
* */

/**
 * 예시답안
 * it is time to study
 *
 * 예시출력
 * study
 * */

public class Main {

    public String solution(String str) {

        String answer = "";

        int minValue = Integer.MIN_VALUE; // 가장 작은 int 형 정수 (처음 비교대상을 제일 작은 수로 함)

        String[] strArr = str.split(" "); // 배열로 나눔

        for (String s : strArr) {

            if (s.length() > minValue) { // 글자의 길이가 최소값보다 큰 경우에만 변환
                answer = s;
                minValue = s.length(); // minValue (비교 길이)를 가장 긴 길이로 설정함
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
}

