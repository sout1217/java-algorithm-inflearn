package com.company.demo;

import java.util.Scanner;

/**
 * https://cote.inflearn.com/contest/10/problem/01-01
 * 1. 문자 찾기
 * 설명
 *
 * 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
 *
 * 대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.
 *
 *
 * 입력
 * 첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다.
 *
 * 문자열은 영어 알파벳으로만 구성되어 있습니다.
 *
 *
 * 출력
 * 첫 줄에 해당 문자의 개수를 출력한다.
* */

/**
 * 예시 입력
 * Computercooler
 * c
 *
 * 예시 출력
 * 2
 * */

public class Main {

    public int solution(String str, char t) {
        int answer = 0;

        str = str.toUpperCase(); // 첫 번째 문장 모두 대문자로 변환
        t = Character.toUpperCase(t); // 두 번째 문자 첫 글자 대문자로 변환

        System.out.println(str + " " + t);

        for ( char s : str.toCharArray()) { // 첫 번째 문장 String 을 char[] 로 변환
            if (s == t) { // 순환하고 있는 char 문자가 입력했던 t 와 같은게 몇 개 인지 체크 후 answer 값 증가
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);

        String str = sc.next(); // 첫 번째 줄 문장을 읽어드림

        char c = sc.next().charAt(0); // 두 번째 줄 문장을 읽고, 첫 번째 글자를 반환

        System.out.println(T.solution(str, c));
    }
}

