import java.util.Scanner;
public class PalindromeChar
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String arr[]=new String[10];
        String arr2[]=new String[10];
        String str="",rev="";
        int i,k,b=0;
        int c[]=new int[10];
        System.out.println("Enter 10 words");
        for(i=0;i<10;i++)
        {
            arr[i]=sc.nextLine();
        }
        for(i=0;i<10;i++)
        {
            //str="";
            str=arr[i];
            rev="";
            for(k=str.length()-1;k>=0;k--)
            {
                rev=rev+str.charAt(k);
            }
            if(rev.equals(str)==true)
            {
                arr2[b]=rev;
                c[b++]=rev.length();
            }
        }
        String temp=new String();
        for(i=0;i<b;i++)
        {
            if(c[i]<c[i+1])
            {
                temp=arr2[i];
                arr2[i]=arr2[i+1];
                arr2[i+1]=temp;
                c[i]=c[i]+c[i+1];
                c[i+1]=c[i]-c[i+1];
                c[i]=c[i]-c[i+1];
            }
        }
        for(i=0;i<b;i++)
            System.out.println(arr2[i]+" "+c[i]);
    }
}