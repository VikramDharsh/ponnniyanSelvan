class MovieDataOperator
{
	static String[] movieName={null,"kgf",null};
	 static int position=0;
	 static int[] collections={0,0,0};
	 
	 static void saveName(String name,int value)
	 {
	 movieName[position]=name;
	 collections[position]=value;
	 position++;
	 }
	 static String displayDetails()
	 {
		 for(int index=0;index<movieName.length;index++)
		 {
			 String ref=movieName[index];
			 int ref1=collections[index];
			 System.out.println("name  :"+ref+"   collections   :"+ref1+ "crores");
			 
			 return "blockbuster movies";   // after return statment only 1st element will displayDetails
			 // program stops execution
		 }
		 return null;	
	 }
	 
}