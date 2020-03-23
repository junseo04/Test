package location;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
 

public class readLineTest {
	private static String a="point";
    public static void main(String args[]) {
        BufferedReader bReader = null;
        
        try {
            
            String s;
            File file = new File("C:\\Users\\USER\\Desktop\\point\\point.txt");
            bReader = new BufferedReader(new FileReader(file));
            
            // 더이상 읽어들일게 없을 때까지 읽어들이게 합니다.
            while((s = bReader.readLine()) != a) {
                System.out.println(s);
            }
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(bReader != null) bReader.close();
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
    }
}


