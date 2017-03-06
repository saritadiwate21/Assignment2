package saritaTask2;
import java.io.*;
public class test {
	
	int Test (String s){
		
		String[] splitString = s.split("[?.!]"); 
		int [] count = new int[splitString.length];
		int k=0,max;
/*		for(int i = 0; i < splitString.length; i++){
			 System.out.println(splitString[i]);
		 }
	*/			
		for(int i = 0; i < splitString.length; i++){		
		
				String[] words=splitString[i].split("[,\\s]");
				count[k++]=words.length;
				words = null;	
			
		}
		max = count[0];
		for(int m = 0;m<count.length;m++){
		
			if (count[m] > max) 
	            max = count[m];
	        
		}
		return max;
	}

	public static void main(String[] args) throws java.lang.Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter your string");
		String s = br.readLine();
		test t = new test();;
        int result=t.Test(s);
        System.out.println(result);
	}

}
