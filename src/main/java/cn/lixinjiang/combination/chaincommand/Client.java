package cn.lixinjiang.combination.chaincommand;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author lxj
 */
public class Client {
    public static void main(String[] args) throws IOException {

        Invoker invoker = new Invoker();
        while (true) {
            System.out.println("#");
            String input = (new BufferedReader(new InputStreamReader(System.in))).readLine();
            if (input.endsWith("quit") || "exit".equals(input)) {
                return;
            }
            System.out.println(invoker.exec(input));
        }
    }
}
