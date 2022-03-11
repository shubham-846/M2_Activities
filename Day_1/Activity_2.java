import java.util.*;
import java.io.*;
 class Act2
 {
    public static void main(String[] args)throws IOException
    {
        Scanner sc=new Scanner(System.in);
        String name1=sc.nextLine();
        String name2=sc.nextLine();
        sc.close();
        String lastName1 = name1.substring(name1.indexOf(' ') + 1);
        String lastName2 = name2.substring(name2.indexOf(' ') + 1);
    if(lastName1.equalsIgnoreCase(lastName2))
            {
            System.out.println("Yes");
            }
        else
            {
            System.out.println("No");
            }
        }
}
