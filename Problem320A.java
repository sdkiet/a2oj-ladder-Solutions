    import java.util.*;
    public class Problem318A {
 
        static String isMagical(String S){

            if(S.indexOf('4',0)){
                return false;
            }
            if(S.contains("444")){
                   return false;
                }
            for(int i=0;i<S.length();i++){
               
               if(S.indexOf('1',i)!='1'||S.indexOf('1',i)!='4'){
                   return false;
                }
                else{
                  return true;}     
            }
}
     
        public static void main(String[] args) {
     
            Scanner sc = new Scanner(System.in);
            String S = sc.next();
            if(isMagical(S))
              System.out.println("YES");
            else
              System.out.println("NO");
        }
    }
