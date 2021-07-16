package occurencecharacters;
public class NoOfOccurenceOfCharacters 
{
    static final int MAX_CHAR=256;
    static void Occurences(String str)
    {
    	int count[]=new int[MAX_CHAR];
    	int len=str.length();    
    	for(int i=0;i<len;i++)
    		count[str.charAt(i)]++;
    	char ch[]=new char[str.length()];
    	for(int i=0; i<len;i++)
    	{
    		ch[i]=str.charAt(i);
    		int f=0;
    		for(int j=0;j<=i;j++)
    		{
    			if(str.charAt(i)==ch[j])
    				f++ ;
    		}
    			if(f==1)
    			System.out.println("Number of Occurence of "+str.charAt(i)+" is:"+ count[str.charAt(i)]);
    	}
    }
    public static void main(String[] args)
    {
    	String str="Tgestting";
    	String st=str.toUpperCase();
    	Occurences(st);
    }
}
