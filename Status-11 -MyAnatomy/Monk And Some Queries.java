 
    import java.util.*;
     
     
    class TestClass {
        public static void main(String args[] ) throws Exception {
          Scanner in = new Scanner(System.in);
          int q = in.nextInt();
          TreeMap<Integer, Integer> map = new TreeMap<>();
          
          while(q-->0){
              int c = in.nextInt();
              
              switch(c){
                    case 1:{
                        int n = in.nextInt();
                        add(map,n);
                        break;}
                    case 2:{
                        int n = in.nextInt();
                        rem(map,n);
                        break;}
                    case 3:
                        if(map.size()==0) System.out.println(-1);
                        else System.out.println(map.lastKey());
                        break;
                    case 4:
                        if(map.size()==0) System.out.println(-1);
                        else System.out.println(map.firstKey());
                        break;
                  
              }
              
          }
        }
        
        public static void add(TreeMap<Integer,Integer> map, int x){
            if(map.size()==0||!map.containsKey(x))
                map.put(x,1);
            else map.put(x,map.get(x)+1);
        }
        
        public static void rem(TreeMap<Integer, Integer> map, int x){
            if(map.size()==0||!map.containsKey(x))
                System.out.println(-1);
            else if(map.get(x)==1){
                map.remove(x);
            }
            else map.put(x,map.get(x)-1);
        }
    }
 
Language: Java 8