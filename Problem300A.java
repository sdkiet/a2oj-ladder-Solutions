import java.util.*;
 
 
public  class Problem300A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer>  list1=new ArrayList<>();
        ArrayList<Integer>  list2=new ArrayList<>();
        ArrayList<Integer>  list3=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int x=sc.nextInt();
            if(x<0)
                list1.add(x);
            else if(x>0)
                list2.add(x);
            else
                list3.add(x);
        }
 
        if(list2.size()==0){
                list2.add(list1.remove(0));
                list2.add(list1.remove(0));
        }
        if(list1.size()%2==0){
            list3.add(list1.remove(0));
        }
 
        System.out.print(list1.size()+" ");
        for(Integer i:list1)
            System.out.print(i+" ");
        System.out.println();
 
        System.out.print(list2.size()+" ");
        for(Integer i:list2)
            System.out.print(i+" ");
        System.out.println();
 
        System.out.print(list3.size()+" ");
        for(Integer i:list3)
            System.out.print(i+" ");
 
 
 
 
 
    }
}
