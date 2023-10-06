import java.util.*;
class arrays1{
    public static void main(String args[])
    {
        ArrayList<Integer> l=new ArrayList<>();
        l.add(1);
        l.add(1);
        l.add(2);
        l.add(2);
        l.add(3);
        int index=0;
        for(int i=1;i<l.size();i++)
        {
            if(l.get(index)!=l.get(i))
            {
                index++;
                l.set(index,l.get(i));
            }
        }
        System.out.println(l);
    }
}