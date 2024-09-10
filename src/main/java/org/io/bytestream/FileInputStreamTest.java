package org.io.bytestream;

import java.io.*;
import java.util.Arrays;

/**
 * FileInputStream类是InputStream的子类，从文件中读取字节流到内存
 *
 * PS：从文件中读取不能指定从哪个字节开始读，它更像链表的结构，必须从开始读到结尾，类比到OutputStream就是你不可能中间会有"空"字节必须一个个往后写
 * 虽然read③的方法从感官上是指定文件哪个字节开始读，但实际上并不是，叫偏移读指定长度、存在字节组指定位置更好
 * 从创建fis这个实例开始，“光标”就已经存在了，不会因为你换用不同的read就回退到开头
 *
 * fis.read()有三种使用方法：①.read() 读取一个字节，返回这个字节的ASCII码序号，若读完再读会返回-1，Int形式
 *          ②.read(byte[]) 按照尽量给bytes字节组塞满的原则(字节组满||读完)，从文件中往外读，返回实际读到的有效数据,如果"光标"已经到最后了再读len返回-1而不是0
 *          ③.read(byte[], off, len) len:规定的读取长度(读完为止) off:指定读到的字节流从字节组的off位置开始覆盖，返回实际的读取长度
 *          需要注意的是②③方式存入字节组是采取覆盖方法的，也就是未覆盖到的地方如果原本有字节的话，是不会改变的
 *
 * 虽然没有可以从文件字节流指定哪个字节开始读的能力，但是给了fis.skip(int)的方法,可以将"光标"调过几个字符，这样实现了定位到(后面)哪个字节但底层还是顺序存取
 * FileInputStream没有搞父类的mark、reset方法  mark(readlimit):标记当前“光标”位置，参数没有意义 reset():定位到mark“光标”的位置
 * fis.isMarkSupport():判断InputStream是否支持Mark & Reset
 * */
public class FileInputStreamTest {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\v_luoshenglu_dxm\\Desktop\\a.txt");
        InputStream fis = new FileInputStream(file);

        //无参的.read()每次返回文件中的第一个字节的ASCII码的序号，每读一个"定位光标"就往后移一次，依次往后读，读到末尾返回-1
        //注意：返回的int类型是由读取到的字节自动提升为int的
//        int read = fis.read();
//        while(read != -1){
//            System.out.print((char)read);
//            read = fis.read();
//        }
//        fis.close();

        //读取byte[]大小长度的字节,如果大小超过了文件字节的总长度，会返回实际长度，所以这个返回值还是很有用的
        //如果byte[]数组原本就有值，且读到的字节长度没有超过bytes.length(),实际上byte[]后面的不会被更改覆盖，还是原来有的值，所以实际读到多少数据这个返回值还是很有用的
        /*byte[] bytes = new byte[20];
        int len = fis.read(bytes);
        //System.out.println(new String(bytes)); //只有12个，会把多余的8个0也转到字符串中
//        String str = "";
//        for(int i=0; i<len; i++){
//            str += (char)bytes[i];
//        }
//        System.out.println(str);
        System.out.println(new String(bytes,0,len)); //效力等同上面被注释部分
        System.out.println("本次共读取到：" + len +"个字符");
        fis.close();*/

        //偏移方法读指定长度，指定字节组位置存
//        byte[] bytes = new byte[20];
//        //注意：这个2是指将读到的len长度从字节数组的2下标位置开始存,这个的作用应该是想分几段读，全存在一个byte[]里
//        //但是没必要啊，可以转成String格式再拼接啊
//        int len = fis.read(bytes,2,15);
//        System.out.println(new String(bytes,2,len));
//        System.out.println("本次共读取到：" + len +"个字符");
//        fis.close();

        //fis.available()
        byte[] bytes = new byte[20];
        int len = fis.read(bytes,0,5);
        System.out.println(new String(bytes,0,5));
        System.out.println("本次共读取到：" + len +"个字符");
        System.out.println("文件中剩余" + fis.available() + "个字节未读取");
        System.out.println("跳过输入流的" + fis.skip(1) + "个字节"); //跳到末尾之后还是可以正常输出的，也就是skip不管到没到末尾，返回值给你给的值一样
        int len1 = fis.read(bytes,len,fis.available());
        System.out.println(new String(bytes,0,len+len1));
        fis.close();
    }
}

