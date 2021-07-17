class OccurrenceOfCharInStr {  

   static void countEachChar(String str) 
   { 
	
	int counter[] = new int[256]; 

	
	int len = str.length(); 

	
	for (int i = 0; i < len; i++) 
		counter[str.charAt(i)]++; 

	
	char array[] = new char[str.length()]; 
        for (int i = 0; i < len; i++) { 
	   array[i] = str.charAt(i); 
	   int flag = 0; 
	   for (int j = 0; j <= i; j++) { 

		
		if (str.charAt(i) == array[j])  
			flag++;                 
	   } 

	   if (flag == 1)  
	      System.out.println("Occurrence of " + str.charAt(i)
		 + " is: " + counter[str.charAt(i)]);             
	} 
   } 
   public static void main(String[] args) 
   {  
	String str = "Myself Hima"; 
	countEachChar(str); 
   } 
}