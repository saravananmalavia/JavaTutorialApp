class NcrExample{
	public static void main(String args[]){

		NCR ncr1 = new NCR();
			ncr1.assignValues(6,2);
			ncr1.findNcr();
			ncr1.display();

	}

	
}

class NCR{
	int n;
	int r;
	int ncr;

	public void assignValues(int n1,int r1){
		n = n1;
		r = r1;
	}

	public void display(){
		System.out.println("n :" + n);
		System.out.println("r :" + r);
		System.out.println("ncr :" +ncr);
	}

	public void findNcr(){
		ncr = findFact(n)/(findFact(r) * findFact(n-r));
	}

	public static int findFact(int f){

		int fact = 1; 
		for(int i=1;i<=f;i++){
			fact = fact * i;
		}

		return fact;
	}

}
