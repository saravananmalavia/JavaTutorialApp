import java.util.*;
class Sorting {
    public static void main(String[] args) 
    {
    	int count, temp;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of elements you want in the array: ");
        count = scan.nextInt();

        int num[] = new int[count];
        int sort[] = new int[count];

        System.out.println("Enter array elements:");
        for (int i = 0; i < count; i++) {
            num[i] = scan.nextInt();
            sort[i] = num[i];
        }
        //sort = num;

       
        for (int i = 0; i < count-1; i++) 
        {
            for (int j = i + 1; j < count; j++) {

                if (sort[i] > sort[j]) {
                    temp = sort[i];
                    sort[i] = sort[j];
                    sort[j] = temp;
                }
            }
        }


        System.out.print("The given elements are :");

        for (int i = 0; i < count ; i++) 
        {
           if(i != count-1){
                System.out.print(num[i] + ", ");
            }
            else
            {
                System.out.print(num[i]); 
            }
        }
        System.out.println();

        System.out.print("Elements in Ascending Order: ");

        for (int i = 0; i < count ; i++) 
        {
            if(i != count-1){
                System.out.print(sort[i] + ", ");
            }
            else
            {
                System.out.print(sort[i]); 
            }
           
        }
        System.out.println();

       
    }
}

/*


pos    0  1   2   3   4  5  6    = 7 i=0 to 5 (n-2)

val    8  3  21   15  9  2  0
 i,j
 0,1   3  8  21   15  9  2  0
 0,2   3  8  21   15  9  2  0
 0,3   3  8  21   15  9  2  0
 0,4   3  8  21   15  9  2  0
 0,5   2  8  21   15  9  3  0
 0,6   0  8  21   15  9  3  2
 1,2   0  8  21   15  9  3  2
 1,3   0  8  21   15  9  3  2
 1,4   0  8  21   15  9  3  2
 1,5   0  3  21   15  9  8  2
 1,6   0  2  21   15  9  8  3
 2,3   0  2  15   21  9  8  3
 2,4   0  2  9    21 15  8  3
 2,5   0  2  8    21 15  9  3
 2,6   0  2  3    21 15  9  8
 3,4   0  2  3    15 21  9  8
 3,5   0  2  3    9  21  15 8
 3,5   0  2  3    8  21  15 9
 4,5   0  2  3    8  15  21 9
 4,6   0  2  3    8  9   21 15
 5,6   0  2  3    8  9   15 21


*/


