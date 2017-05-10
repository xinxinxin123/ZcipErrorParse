package xin.zcipparse.other;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Complex {


    /**
     * Description: <br>
     * 
     * @author zheng.tao5<br>
     * @taskId <br>
     * @param args <br>
     * @throws BaseAppException
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        File file = new File("e:/b.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        while (line != null) {
            line = line.substring(line.indexOf("code/bss/") + 9, line.indexOf(".java") + 5).trim();
            System.out.println(line);
            line = br.readLine();
        }

    }

}
