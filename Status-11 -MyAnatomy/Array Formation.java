 
    import java.util.*;
     
    class Test
    {
     
        public static void main(String[] args)
        {
            int n,i,j;
            Scanner sc=new Scanner(System.in);
            n=sc.nextInt();
            int[]arr=new int[n];
            Stack<Integer> st=new Stack<Integer>();
            for(i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
                boolean res=false;
                for(j=2;j<=arr[i]/2;j++)
                {
                    if(arr[i]%j==0)
                        break;
                }
                if(j>arr[i]/2)
                    System.out.print(arr[i]+" ");
                    //ls.add(arr[i]);
                else
                    st.push(arr[i]);
            }
           
            System.out.println();
            while(!st.empty())
                System.out.print(st.pop()+" ");
        }
    }
 
Language: Java 8