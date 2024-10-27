
import java.util.Scanner;

public class J01010 {
    public static String cat(String s){
        StringBuilder res = new StringBuilder("");
        for (char i: s.toCharArray()){
            switch(i){
                case('0'):
                    res.append("0");
                    break;
                case('1'):
                    res.append("1");
                    break;
                case('8'):
                    res.append("0");
                    break; 
                case('9'):
                    res.append("0");
                    break;
                default:
                    return "INVALID";
            }
        }
        while(res.charAt(0) == '0' && res.length() > 1)res.delete(0, 1);
        if(res.charAt(0) == '0')return "INVALID";
        return res.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i= 0 ; i<t ; i++){
            String s = sc.next();
            System.out.println(cat(s));
        }
    }
}
