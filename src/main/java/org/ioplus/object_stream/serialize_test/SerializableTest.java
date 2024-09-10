package org.ioplus.object_stream.serialize_test;

import java.io.*;
import java.util.ArrayList;
/**
 * 序列化和反序列化也可以直接用 **对象列表** 作为参数进行内容写出和内容读入，不必一个个的写入写出
 * */
public class SerializableTest{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\v_luoshenglu_dxm\\Desktop\\book.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        FileInputStream fis = new FileInputStream("C:\\Users\\v_luoshenglu_dxm\\Desktop\\book.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        /*Book book = new Book("水浒传","施耐庵");
        Book book1 = new Book("三国演义","罗贯中");
        Book book2 = new Book("红楼梦", "曹雪芹");
        Book book3 = new Book("西游记", "吴承恩");*/

        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("水浒传","施耐庵"));
        books.add(new Book("三国演义","罗贯中"));
        books.add(new Book("红楼梦", "曹雪芹"));
        books.add(new Book("西游记", "吴承恩"));

        /*for(Book book : books){
            oos.writeObject(book);
        }*/
        oos.writeObject(books);
        ArrayList<Book> books1 = (ArrayList<Book>)ois.readObject();

        for (Book book : books1){
            System.out.println(book);
        }
        oos.close();
        ois.close();
    }
}
