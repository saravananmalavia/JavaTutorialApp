class LabelDemo{
	public static void main(String args[]){

label1 :   for(int j = 1; j<=10;j++)
	 {
	 	System.out.println(" outer j : " + j);
	 	for(int i=1;i<=5;i++){
			if(i == 4){
				//continue label1;
				break label1;
			}
			System.out.println(" i : " + i);
		}
	 }

	}
}

