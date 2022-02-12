package test;

import java.util.*;
import java.io.*;
import java.io.Console;
public class DemoScan {
    // 测试输入Scanner
    void Scan()
    {
        Scanner in = new Scanner(System.in);
        int inString = in.nextInt();
        System.out.println(inString);
    }
    void console()
    {
        Console cons =  System.console();
        String username = cons.readLine();
        char[] pw = cons.readPassword();
        System.out.println(username + pw);

    }
    void javaTime()
    {
        System.out.printf("%2S %2$tb %2$te  %2$tY", "Due date:", new Date());
    }
    void printPath()
    {
        String dir = System.getProperty("user.dir");
        System.out.println(dir);
    }
    void arrayToString()
    {
        int[] a = new int[10];
        int j = 0;
        for(int i = 0; i < 10; i++)
        {
            a[i] = i+1;

        }
        System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args){
        DemoScan Dem = new DemoScan();
        Dem.arrayToString();
    }

}
