package test;

import java.io.File;
import java.util.Scanner;


public class FileNames {

    //用来记录缩进的次数
    private static int count = 0;

    public static void main(String[] args) {

        File file = getFile();

        getFileNames(file);
    }

    //每次调用该方法时，说明进入到一个新的文件夹的内部，需要增加一个缩进
    private static void getFileNames(File file) {
        //获取路径File对象中的File数组
        File[] fileArray = file.listFiles();

        //遍历数组，取得File对象
        for(int i=0; i<fileArray.length; i++){

            //通过遍历count来控制打印几个缩进
            for(int j=0; j<count; j++){
                System.out.print("\t");
            }

            //打印文件或文件夹的名字
            System.out.println(fileArray[i]);

            //如果是一个文件夹的话，使用递归重复上面的操作
            if(fileArray[i].isDirectory()){
                count++;
                getFileNames(fileArray[i]);
                //方法执行结束后要减少缩进
                count--;
            }

        }

    }

    //获取用户输入路径的File对象
    private static File getFile() {

        System.out.println("请输入一个文件夹路径：");

        Scanner sc = new Scanner(System.in);
        //获取用户输入的路径，用户输入的路径有可能是错误的，需要进行判断
        while(true){
            String input = sc.nextLine();
            File file = new File(input);
            if(!file.exists()){
                System.out.println("您输入的文件路径有误，请重新输入文件路径：");
            }else if(file.isFile()){
                //如果用户输入的路径是一个文件
                System.out.println("您输入的路径是一个文件，请输入一个文件夹的路径");
            }else{
                return file;
            }
        }
    }


}
