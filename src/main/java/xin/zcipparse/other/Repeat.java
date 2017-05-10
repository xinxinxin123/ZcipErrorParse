package xin.zcipparse.other;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Repeat {

    /**
     * Description: <br>
     * 
     * @author zheng.tao5<br>
     * @taskId <br>
     * @param args <br>
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        File file = new File("e:/c.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        List<String> resultList = new ArrayList<String>();

        while (line != null) {
            if (!resultList.contains(line)) {
                resultList.add(line);
                System.out.println(line);
            }
            line = br.readLine();
        }
    }

}
