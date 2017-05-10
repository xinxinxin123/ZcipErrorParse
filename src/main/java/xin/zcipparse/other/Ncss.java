package xin.zcipparse.other;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Ncss {


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
        File file = new File("e:/a.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine(); 
        List<String> resultList = new ArrayList<String>();

        while (line != null) {
            line = line.substring(line.indexOf("com.")).trim();
            line = line.substring(0, line.lastIndexOf("."));
            line = line.replace(".", "/");
            line = ".*/" + line + ".java";
            if (!resultList.contains(line)) {
                resultList.add(line);
                System.out.println(line);
            }
            line = br.readLine();
        }
    }
}
