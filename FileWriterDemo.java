import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo{
    public static void main(String []args) throws IOException{
        //�������������
        FileWriter fw = new FileWriter("d:\\test.txt");
        //��������������д���ݷ���
        fw.write("IO�����");
        //��������������ˢ�·���
        fw.flush();
        fw.close();
	//while(true){}    ��ͣ������
    }
}