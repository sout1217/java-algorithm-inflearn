package com.company.demo;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.ASCIIUtility;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 설명
 * 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
 * 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요
 * <p>
 * 입력
 * 첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다
 * <p>
 * 출력
 * 첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다
 * <p>
 * 예시 입력1
 * a#b1GE*T@S
 * <p>
 * 예시 출력1
 * S#T!EG*b@a
 */

public class Main {

    public String solution(String str) {

        String answer;

        char[] chars = str.toCharArray();

        int lt = 0; // 앞의 문자
        int rt = chars.length - 1; // 뒷 문자

        while (lt < rt) {

            // rt 가 특수문자 일 때
            if (!Character.isAlphabetic(chars[lt])) {
                lt++;
            // rt 가 특수문자 일 때
            } else if (!Character.isAlphabetic(chars[rt])) {
                rt--;
            } else {
                char tmp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = tmp;
                lt++;
                lt++;
            }
        }

        answer = String.valueOf(chars);

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);

        String str = sc.next();


        System.out.println(T.solution(str));

    }
}
