import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
import java.util.Collections;
public class J05033 {
    static class Time implements Comparable<Time> {
        int hour;
        int minute; 
        int second ; 
        public Time(int hour, int minute, int second){
            this.hour = hour; 
            this.minute = minute;
            this.second =second;
        }
        @Override 
        public int compareTo(Time other){
            if (this.hour != other.hour){
                return this.hour - other.hour ; 
            }
            if (this.minute != other.minute){
                return this.minute - other.minute;
            }
            return this.second - other.second; 
        }
        @Override 
        public String toString(){
            return this.hour + " "+ this.minute+ " "+ this.second;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Time> times = new ArrayList<>();
        for (int i = 0 ; i <n ; i++){
            int h = sc.nextInt();
            int m = sc.nextInt();
            int s = sc.nextInt();
            times.add(new Time(h,m,s));
        }
        Collections.sort(times);
        StringBuilder sb = new StringBuilder();
        for (Time time : times ){
            sb.append(time.toString()).append("\n");
        }
        System.out.println(sb.toString());
        sc.close();
    }
}
