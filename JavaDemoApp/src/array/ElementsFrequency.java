class ElementsFrequency{
	public static void main(String args[]){
		int elements[] = {7,2,9,1,7,2,2,0,12,9,7,1,9,7};
		               //{7,7,9,1,7,9,7,1,9,7};
		int count;
		for(int i=0;i<elements.length;i++){
			count = 0;
			for(int j = 0;j<elements.length;j++)
				if(elements[i] == elements[j] && elements[i]!=-1){
					count ++;
					// if(count > 1){
					// 	elements[j] = -1;	
					// }
					
				}
				//if( elements[i]!=-1){
					System.out.println("Frequency of " + elements[i] + " is " +count);
				//}
				
		}

	}
}