import java.util.*;
public class J03005 {
    public static String solve(String name){
        String[] words = name.trim().toLowerCase().split("\\s+");
        StringBuilder normal = new StringBuilder();
        words[0]= words[0].toUpperCase(); 
        for (int i = 1 ; i < words.length ; i ++){
            if (!words[i].isEmpty()){
                if (i != words.length -1)
                    normal.append(Character.toUpperCase(words[i].charAt(0))).append(words[i].substring(1)).append(" ");
                else{
                    normal.append(Character.toUpperCase(words[i].charAt(0))).append(words[i].substring(1)).append(",").append(" ");

                }
            }
        }
        normal.append(words[0]);
        return normal.toString().trim();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  t= Integer.parseInt(sc.nextLine().trim());
        for (int i = 0 ; i < t ; i++){
            String name = sc.nextLine();
            System.out.println(solve(name));
        }
    }

}
