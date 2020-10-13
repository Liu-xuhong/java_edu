import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo{
    public static void main(String []args) throws IOException{
        //创建输出流对象
        FileWriter fw = new FileWriter("d:\\test.txt");
        //调用输出流对象的写数据方法
        fw.write("IO流你好");
        //调用输出流对象的刷新方法
        fw.flush();
        fw.close();
	//while(true){}    暂停程序用
    }
}