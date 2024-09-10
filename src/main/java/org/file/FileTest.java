package org.file;
/**
 * 可以用文件的绝对路径(字符串)创建新的File实例
 * 可以通过某级路径+后面路径创建File实例 File(parentPath,childDir)
 * 可以通过已经建好的File实例 + childDir创建，这个File实例肯定不是具体到文件...File(File,childDir)
 *
 * file.getAbsolutePath file.getName file.length PS: 这仨即使问价不存在也是给返回值的，所以要先确认文件是否存在再进行
 * file.exists()  file.isDirectory()  file.isFile()
 *
 * 创建文件： file.creatNewFile() 若文件已存在则返回false，若因其他原因导致创建失败则抛出IOException异常
 * 删除文件或目录 file.delete() 注意删除文件夹时false ：①文件夹有东西 ②文件夹不存在
 * 创建目录(向下一级) file.mkdir()
 * 创建多级目录(向下多级) file.mkdirs()
 *
 * 获取目录下的文件：① file.list() 直接以字符串数组的格式返回目录下所有文件或目录名称 String[] strs
 *               ② file.listFile() 直接以File[]格式返回目录下的所有文件或目录
 * */
import java.io.File;
import java.io.IOException;
import java.util.List;

public class FileTest {
    public static void main(String[] args) throws IOException {
        /* //创建File实例
        String pathname = "C:\\Users\\v_luoshenglu_dxm\\Desktop\\aaa.jpg";
        File file1 = new File(pathname);

        String pathname2 = "C:\\Users\\v_luoshenglu_dxm\\Desktop\\aaa.txt";
        File file2 = new File(pathname2);

        String parentDir = "C:\\Users\\v_luoshenglu_dxm\\Desktop";
        String childDir = "aaa.jpg";
        File file3 = new File(parentDir, childDir);

        File parentFile = new File(parentDir);
        File file4 = new File(parentFile, childDir);
        */
        /* //确定file是否存在，获取file信息
        String pathname = "C:\\Users\\v_luoshenglu_dxm\\Desktop\\aaa.txt";
        File file = new File(pathname);

        //获取绝对路径
        System.out.println(file.getAbsolutePath());

        //返回File表示的文件或目录的名称
        System.out.println(file.getName());

        //返回文件的长度(字节),若为文件夹则返回0
        System.out.println(file.length());

        //若文件不存在，则俩is必为false，注意没有后缀的文件也是文件
        System.out.println("file是否存在：" + file.exists());
        System.out.println("file是否为目录：" + file.isDirectory());
        System.out.println("file是否为文件：" + file.isFile());
        */
        //文件的创建与删除
//        String pathName = "C:\\Users\\v_luoshenglu_dxm\\Desktop\\bbb.txt";
//        File f = new File(pathName);
//        System.out.println("文件是否存在：" + f.exists());
//        System.out.println("文件是否创建：" + f.createNewFile());
//        System.out.println("文件是否删除：" + f.delete());


//        //目录的创建或删除
//        String pathDir = "C:\\Users\\v_luoshenglu_dxm\\Desktop\\新建文件夹1";
//        File fileDir = new File(pathDir);
//        System.out.println("目录是否创建成功：" + fileDir.mkdir());
//        //如果目录下有内容，是不能被删除的
//        System.out.println("目录是否被删除：" + fileDir.delete());
//
//        File fileDir1 = new File("C:\\Users\\v_luoshenglu_dxm\\Desktop\\新建文件夹\\lsl");
//        System.out.println("多级目录是否存在：" + fileDir1.exists());
//        System.out.println("多级目录是否创建：" + fileDir1.mkdirs());

        String pathname = "C:\\Users\\v_luoshenglu_dxm\\Desktop\\新建文件夹";
        File file = new File(pathname);

        String[] strs = file.list();
        for(String str : strs){
            System.out.println(str);
        }

        File[] files = file.listFiles();
        for(File f : files){
            System.out.println(f.getName());
        }
    }
}
