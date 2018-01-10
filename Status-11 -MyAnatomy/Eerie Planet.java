import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
     
     
class TestClass {
        public static void main(String args[] ) throws Exception {
            Scanner sc = new Scanner(System.in);
            int hour =sc.nextInt();
            int crew = sc.nextInt();
            int queries = sc.nextInt();
            int[] height = new int[crew];
            int[] start = new int[crew];
            int[] end = new int[crew];
            int max=0;
            for(int j=0;j<crew;j++){
                height[j] = sc.nextInt();
                start[j] = sc.nextInt();
                end[j] = sc.nextInt();
                max=Math.max(height[j],max);
            }
            for(int i=0;i<queries;i++){
                int personH=sc.nextInt();
                int time = sc.nextInt();
                boolean flag=true;
                if(personH>max){
                    System.out.println("YES");
                    continue;
                }
                for(int j=0;j<crew;j++){
                    if(time<=end[j] && time>=start[j] && personH<=height[j]){
                        System.out.println("NO");
                        flag=false;
                        break;
                    }
                }
                if(flag){System.out.println("YES");}
                
            }
     
        }
    }
