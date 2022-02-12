package test;

import java.io.File;

public class DirList
{
    int count = 0;
    void printSpace()
    {
        for(int i = 0; i < count; ++i)
        {
            System.out.print("****");
        }
    }
    void printDir(String dirname) {
        File f1 = new File(dirname);
        if (f1.isDirectory()) {
            printSpace();
            System.out.println(dirname);

            String s[] = f1.list();
            for (int i = 0; i < s.length; i++) {
                File f = new File(dirname + '\\' + s[i]);
//                System.out.println("comment" + s[i] + " " +  f.isDirectory());
                if (f.isDirectory()) {
                    ++count;
                    printDir(dirname + '\\' + s[i]);
                    --count;
                }else{
                    ++count;
                    printSpace();
                    System.out.println(s[i]);
                    --count;
                }
            }
        }
    }
    public static void main(String args[]) {
        String dirname = "D:\\桌面_副本\\大三上\\python程序设计";
        DirList dirlist = new DirList();
        dirlist.printDir(dirname);
    }
}
