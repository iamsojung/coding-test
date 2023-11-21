package sojung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj10773 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for (int i = 0; i < K; i++) {
            int tmp = Integer.parseInt(br.readLine());

            if (tmp == 0) {
                sum = sum - stack.pop();
            } else {
                sum = sum + tmp;
                stack.push(tmp);
            }

        }
        System.out.println(sum);
    }

}
