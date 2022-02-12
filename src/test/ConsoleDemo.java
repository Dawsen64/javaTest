package test;

import java.io.Console;
public class ConsoleDemo {
    public static void main(String[] args) {
        Console cons = System.console();
        String username = cons.readLine("User name: ");
        char[] passwd = cons.readPassword("PassWord: ");
        System.out.println("User name: " + username);
        System.out.println("PassWord: " + String.valueOf(passwd));
    }
}
