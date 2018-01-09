    import java.io.BufferedReader;
    import java.io.InputStreamReader;
    import java.util.*;
     
    class TestClass {
        public static void main(String args[] ) throws Exception {
          
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int T=Integer.parseInt(br.readLine());
            while(T-->0){
                StringTokenizer str=new StringTokenizer(br.readLine());
                int N=Integer.parseInt(str.nextToken());
                int a=Integer.parseInt(str.nextToken());
                int b=0;
                while(N-->0){
                    StringTokenizer str1=new StringTokenizer(br.readLine());
                    String cc=str1.nextToken();
                    if(cc.equals("P")){
                        b=a;
                        a=Integer.parseInt(str1.nextToken());
                    }else if(cc.equals("B")){
                        int temp=a;
                        a=b;
                        b=temp;
                    }
                }
                System.out.println("Player "+a);
            }
        }
    }
 
 
Language: Java 8