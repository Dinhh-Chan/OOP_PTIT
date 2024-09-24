import java.io.File; 
import java.io.FileNotFoundException;
import java.util.Scanner;
public class hellofile {
    public static void main(String[] args) {
        try{
            File hello= new File("Hello.txt");
            Scanner myReader = new Scanner(hello);
            while (myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            } 

        }catch (FileNotFoundException e) {
            System.out.println("loi");
        }
    }
    
    
    
}
