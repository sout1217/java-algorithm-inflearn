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

        int minValue = Integer.MIN_VALUE;
        int pos;

        while((pos = str.indexOf(" ")) != -1) {
            // pos = str.indexOf(" ") = 2 번째 인덱스를 반환한다
            // 그리고 while 로 -1 반환 (존재하지 않을 때 까지) 반복한다

            String tmp = str.substring(0, pos);
            // 처음 가져온 단어를 넣는다 (subString(0, 2) 을 통해 0~1 까지 단어를 자른다

            int len = tmp.length();
            // 해당 단어의 문자길이를 반환

            if (len > minValue) {
                minValue = len;
                answer = tmp;
            }
            // 가장 작은 값보다 큰 경우 값 변경

            str = str.substring(pos + 1);
            // it is time to study.substring(3) 부터 잘라내어
            // is time to study 문장이 된다다
        }
        if (str.length() > minValue) answer = str;

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));

    }
}
