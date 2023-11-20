package sojung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1789 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long S = Long.parseLong(br.readLine());
        long N = 1;
        long sum = 0;
        while (true) {

            sum = sum + N;
            if (sum > S) {
                System.out.println(N-1);
                return;
            }
            N = N + 1;
        }

    }

}
