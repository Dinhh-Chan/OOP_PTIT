import java.util.*;
public class J03004 {
    public static String solve(String name){
     
        String[] words = name.trim().toLowerCase().split("\\s+");
        StringBuilder nomal = new StringBuilder();
        for (String word : words){
            if(!word.isEmpty()){
                nomal.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
            }
        }
        return nomal.toString().trim();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  t= sc.nextInt();
        for (int i = 0 ; i < t ; i++){
            String name = sc.nextLine();
            System.out.println(solve(name));
        }
    }

}
