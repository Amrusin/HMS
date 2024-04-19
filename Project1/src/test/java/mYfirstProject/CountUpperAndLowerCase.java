package mYfirstProject;

public class CountUpperAndLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String s="WelCoMe";
 int Upper=0;
 int Lower=0;
 
for(int i=0;i<s.length();i++)
{
	char c=s.charAt(i);
 if(c >='A' && c <='Z')
 
	 Upper++;
 
 else
 
	 Lower++;
}
 System.out.println("Upper Case="+Upper);
 System.out.println("Lower Case="+Lower);
 
	}

}
