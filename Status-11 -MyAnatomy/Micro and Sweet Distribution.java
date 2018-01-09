    import java.util.*;
     
    class TestClass
    {
        public static void main(String args[] ) throws Exception
        {
            Scanner sc = new Scanner(System.in);
            
            int t = sc.nextInt();
            
            while(t!=0)
            {
                int n = sc.nextInt();
                int m = sc.nextInt();
                
                int sx = sc.nextInt() - 1;
                int sy = sc.nextInt() - 1;
                
                int x = sc.nextInt() - 1;
                int y = sc.nextInt() - 1;
                
                if(sx==0 && sy==0)
                {
                    if((n%2==1 && x==n-1 && y==m-1) || (n%2==0 && x==n-1 && y==0))
                        System.out.println("Over");
                    else if(x%2==0 && y<m-1)
                        System.out.println("Right");
                    else if(x%2==1 && y>0)
                        System.out.println("Left");
                    else if(y==0 || y==m-1)
                        System.out.println("Back");
                }
                else if(sx==0 && sy==m-1)
                {
                    if((n%2==1 && x==n-1 && y==0) || (n%2==0 && x==n-1 && y==m-1))
                        System.out.println("Over");
                    else if(x%2==1 && y<m-1)
                        System.out.println("Right");
                    else if(x%2==0 && y>0)
                        System.out.println("Left");
                    else if(y==0 || y==m-1)
                        System.out.println("Back");
                        
                }
                else if(sx==n-1 && sy==0)
                {
                    if((n%2==1 && x==0 && y==m-1) || (n%2==0 && x==0 && y==0))
                        System.out.println("Over");
                    else if((n-1-x)%2==0 && y<m-1)
                        System.out.println("Right");
                    else if((n-1-x)%2==1 && y>0)
                        System.out.println("Left");
                    else if(y==0 || y==m-1)
                        System.out.println("Front");
                }
                else
                {
                    if((n%2==1 && x==0 && y==0) || (n%2==0 && x==0 && y==m-1))
                        System.out.println("Over");
                    else if((n-1-x)%2==1 && y<m-1)
                        System.out.println("Right");
                    else if((n-1-x)%2==0 && y>0)
                        System.out.println("Left");
                    else if(y==0 || y==m-1)
                        System.out.println("Front");
                }
                
                t--;
            }
        }
    }
Language: Java 8