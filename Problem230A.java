import java.util.*;
public class Problem230A
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int s = input.nextInt(), n = input.nextInt();
        Dragon[] data = new Dragon[n];
        for(int i = 0; i<n; i++)
            data[i] = new Dragon(input.nextInt(), input.nextInt());
        Arrays.sort(data);
        boolean res = true;
        for(int i = 0; i<n; i++)
        {
            if(s <= data[i].s)
            {
                res = false;
                break;
            }
            s += data[i].b;
        }
        System.out.println(res ? "YES" : "NO");
    }
    public static class Dragon implements Comparable<Dragon>
    {
        int s, b;
        public Dragon(int s, int b)
        {
            this.s = s;
            this.b = b;
        }
        public int compareTo(Dragon that) {
            return this.s - that.s;
        }
    }
}
