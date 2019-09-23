    //============================================================================
    //problem link: https://codeforces.com/problemset/problem/265/A
    // Name        : Problem265A.java
    // Author      : Shivam Dwivedi
    // Version     :
    //============================================================================
    import java.util.*;

    public class Problem265A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s= sc.next();
            String t= sc .next();
            char[] s1 = s.toCharArray();
            char[] t1 = t.toCharArray();
            int pos=0;
            for(int i=0;i<s.length();i++){
                for(int j=0;j<t.length();j++){
                    if(s.charAt(i)==t.charAt(j)){
                        i++;
                    }
                    pos=i+1;
                }
                break;
            }
            System.out.println(pos);
        }
    }
