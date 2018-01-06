import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String text = "";
        Stack<String> s = new Stack<String>();
        s.push(text);
        for(int i=0;i<n;i++){
            int t = sc.nextInt();
            if(t==1){
                text= text+sc.next();
                s.push(text);
                //System.out.println(text);
            }
            else if(t==2){
                text= text.substring(0,text.length()-sc.nextInt());
                s.push(text);
                //System.out.println(text);
            }
            else if(t==3){
                System.out.println(text.charAt(sc.nextInt()-1));
            }
            else{
                s.pop();
                text = s.peek();
                //System.out.println(text);
            }
        }
      }
}