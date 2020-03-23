package location;
 
import java.io.File;
import java.io.FileNotFoundException;
import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;
 
public class ReadText3 {
  
    public static void main(String[] args){
        try{
            String [] x = {RDL_STLT_PS, POINT };
            String text = "RDL_STLT_PS ";
            
            //파일 객체 생성
            File file = new File("C:\\Users\\USER\\Desktop\\point\\point1.txt");
            //스캐너로 파일 읽기
            Scanner scan = new Scanner(file);
          
                    System.out.println(scan.nextLine());
              
                
           
          //System.out.println(scan.useDelimiter("\\z").next());
        }catch (FileNotFoundException e) {
            // TODO: handle exception
        }
    }
}


