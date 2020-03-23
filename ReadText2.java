package location;
 
import java.io.File;
import java.io.FileNotFoundException;
import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;
 
public class ReadText2 {
  
    public static void main(String[] args){
        try{
           
           int i = 0; 
            //파일 객체 생성
            File file = new File("C:\\Users\\USER\\Desktop\\point\\point1.txt");
            //스캐너로 파일 읽기
            Scanner scan = new Scanner(file);
          if(scan.nextLine() == "POINT"){
              System.out.println(scan.nextLine());
          }
                   
          //System.out.println(scan.useDelimiter("\\z").next());
        }catch (FileNotFoundException e) {
            // TODO: handle exception
        }
    }
}


