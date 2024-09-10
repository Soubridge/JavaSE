package org.ioplus.standard_io_stream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * 标准输入、输出流
 * 标注输入流System.in，默认从控制台读取内容，配合Scanner类使用，可通过System.setIn(fis)重定向读取源，底层是缓冲字节读入流(BufferedInputStream)
 * 标注输出流System.out，默认将内容输出到控制台，可通过System.setOut(printStream)来更改输出位置
 * PrintStream是OutputStream的子类，也是属于字节输出流 new PrintStream("a.txt").var
 * */
public class PrintSteamTest {
    public static void main(String[] args) throws FileNotFoundException {
        /*PrintStream ps = new PrintStream("C:\\Users\\v_luoshenglu_dxm\\Desktop\\e.txt");
        ps.println("云南"); //感觉这个跟字节写入流FileOutputStream差不多，都是把String写到.txt
        ps.close();*/

        //标准输入流是一个字节缓冲流(BufferedInputStream) System.in默认是获取控制台键入的内容,System.setIn()可以改变键入读的源
        //从而改变Scanner读入的内容
//        System.setIn(new FileInputStream("C:\\Users\\v_luoshenglu_dxm\\Desktop\\a.txt"));
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//        String str1 = scanner.nextLine();
//        System.out.println(str + ":" + str1);
        //更改读取源是需要给一个fis对象的，所以System的读入肯定也是字节读入方式
        //下面是指定System.in获取源，然后逐行读取内容
//        System.setIn(new FileInputStream("C:\\Users\\v_luoshenglu_dxm\\Desktop\\a.txt"));
//        Scanner scanner = new Scanner(System.in);
//        String str="";
//        while(scanner.hasNextLine()){
//            String s = scanner.nextLine();
//            str = str + s + "//";
//        }
//        System.out.println(str);

        //标注输出流是一个打印流，常用的System.out返回的也是打印流PrintStream,返回的对象默认指向控制台，故sout会把内容输出到控制台
        //可以通过System.setOut(printStream)重定向输出的位置，这个底层还是字节写出流[PrintStream->OutputStream]
        System.setOut(new PrintStream("C:\\Users\\v_luoshenglu_dxm\\Desktop\\e.txt"));
        System.out.println("我爱吃紫薯球");
    }
}
