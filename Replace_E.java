import java.io.*;
class Replace_E
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a String");
        String s=br.readLine();
        int len=s.length();
        String s1="";
        for(int i=0;i<len;i++)
        {
            char ch=s.charAt(i);
        if(ch=='e'||ch=='E')
        s1=s1+"*";
        else 
        s1=s1+ch;
    }
        System.out.println(s1);
    }
}
    