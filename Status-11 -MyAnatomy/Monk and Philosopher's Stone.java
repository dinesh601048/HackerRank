import java.util.*;

class TestClass {
        static int top = -1;
        public static void main(String args[] ) throws Exception {
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();     
            int[]  N = new int[n];
            for(int i=0 ; i<n ;i++)
            {
                N[i] = s.nextInt();
            }
            int q = s.nextInt();
            int x = s.nextInt();
            int[] Q = new int[q];
           /* String[] S = new String[q];
            for(int i=0 ; i<q ; i++)
            {
                S[i] = s.next();
            }*/
            int j=0;
            int res = 0;
            while(q > 0)
            {
                int coin=0;
                int a=0;
                String str = s.next();
                if(str.equals("Harry"))
                {
                    coin = N[j];
                    push(Q , coin);
                    res = res + coin;
                    j++;
                }
                else if(str.equals("Remove"))
                {
                    a = pop(Q);
                    res = res - a;
                }
                
                if(res == x)
                {
                    System.out.println(top+1);
                    break;
                }
                q--;
            }
            if(res != x)
            System.out.println("-1");
            
        }
        
        public static void push(int[] Q , int coin)
        {
            if(top < Q.length)
            {
                top++;
                Q[top] = coin;
            }
        }
        
       public static int pop(int[] Q)
       {
           int a =0 ;
           if(top >= 0 && top < Q.length)
           {
               a = Q[top];
               top--;
           }
           return a;
       }
    }

