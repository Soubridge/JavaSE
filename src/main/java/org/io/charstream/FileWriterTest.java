package org.io.charstream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
/**
 * FileWriter是Writer的实现类，用于向文件中写入字符的数据
 * 写入方法  ①fileWriter.writer(int/char) 写入单个字符，int类型会按ASCII码自行转换成char，也可以直接写汉字对应的码
 *         ②fileWriter.writer(chars[]) 将字符组内容直接写入缓冲区中，字符串可由str.toCharArray()获取对应的字符组
 *         ③fileWriter.writer(chars,offset,len) 指定字符组的哪部分写入缓冲区中
 * PS：与字节流FileOutputStream写出不同，FileWriter字符流要先经过缓冲区， .close()之后才可以讲缓冲区的内容写入文件
 *     写出过程中想把重要的内容保存到文件中只能.close()，再想继续写只能再new实例，为了解决这个问题，有方法.flush()，将缓冲区的内容写入文件，清除缓冲区
 *     同FileOutputStream，若想换行可以写出 “\n”||"\r" ，在new实例的时候再文件地址后面加参数true可以实现文件续写
 */
public class FileWriterTest {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\v_luoshenglu_dxm\\Desktop\\d.txt");
        Writer writer = new FileWriter(file);

//        writer.write(97); //可以直接写ASCII码对应的值
//        writer.write('b'); //可以直接接入单个的字符上去
//        writer.write(22909); //可以写汉字对应的码(int)上去，不过要对应好编码格式

//        char[] chars = "我是中国人".toCharArray(); //直接写出字符数组
//        writer.write(chars,2,2); //这里是可以指定字符组的哪部分写出

        Writer fw = new FileWriter("C:\\Users\\v_luoshenglu_dxm\\Desktop\\f.txt",true);
        char[] chars = "我是中国人".toCharArray();
        fw.write(chars,0,2);
        fw.write(chars,2,3);// 这样连续写是在往缓冲区加内容
        fw.flush(); //作用是把缓冲区的内容即时写入文件，并将缓冲区文件清除，解决了字节流缓冲区必须.close()才能写入的问题
        fw.write(chars);

        fw.close();

        writer.close(); //不调用close方法，数据只是保存在缓冲区，不会写到文件里，FileOutputStream则不需要，感觉它是在缓冲区做的 字符<-->字节

    }
}
