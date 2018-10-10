import java.util.Scanner;
public class Sentence {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String strNew=new String();
        String strFinal=new String();
        int i;
        for(i=0;i<str.length();i++)
        {
            if(!(str.charAt(i)==' ' && str.charAt(i+1)==' '))
                strNew+=str.charAt(i);
        }
        
        System.out.println("WORD TO BE DELETED: ");
        String word=sc.nextLine();
        System.out.println("WORD POSITION IN THE SENTENCE: ");
        int pos=sc.nextInt();
        System.out.println("OUTPUT: ");
        int len=word.length();
        int blankCount=0;
        for(i=0;i<strNew.length() && blankCount<pos-1;i++)
        {
            strFinal+=strNew.charAt(i);
            if(strNew.charAt(i)==' ')
                blankCount++;
        }
        i=i+len+1;
        String substr= strNew.substring(i, strNew.length());
        strFinal+=substr;
        System.out.println(strFinal);
    }
}