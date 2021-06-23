

public class MultiplyStrings {
	public static void main(String[] args) {
		String num1 = "123";
		String num2 = "456";
		int m=num1.length();
	       int n=num2.length();
	       
	       int[] res=new int[m+n];
	       
	       for(int i=m-1;i>=0;i--){
	           int a=num1.charAt(i)-'0';
	           for(int j=n-1;j>=0;j--){
	               
	               int b=num2.charAt(j)-'0';
	               
	               int r=a*b;
	               int firstDigit=r/10;
	               int secondDigit=r%10;
	               
	               res[i+j+1] += secondDigit;
	               if(res[i+j+1]>9){
	                   res[i+j+1]%=10;
	                   res[i+j]++;
	               }                         
	               
	               res[i+j] += firstDigit;                                                
	               if(res[i+j]>9){
	                   res[i+j]%=10;
	                   if(i+j-1>=0)
	                       res[i+j-1]++;
	               }
	           }
	       }
	       
	       
	       StringBuilder sb = new StringBuilder();
	       for(int i=0;i<res.length;i++)
	           sb.append(String.valueOf(res[i]));
	       
	       int i=0;
	       while(i<sb.length() && sb.charAt(i)=='0')
	           i++;
	       
	       if(i==sb.length())
	    	   System.out.println(0);
	          
	       
	       else System.out.println(sb.toString().substring(i));
	}

}
