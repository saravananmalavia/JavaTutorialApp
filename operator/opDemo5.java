//Short-Circuit logical operators. &&  ||
class opDemo5
{
public static void main(String arg[])
    {

// Short Circuiting in Java

        int c = 1, d = 100, e = 50; // LINE A

        // && it checks the second condition 
        // only if the first condition is true
        /*if( c == 0 && e++ < 100 )
        {
            d = 150;
        }
*/
         // || it checks the second condition 
        // only if the first condition is false
        // if( c == 1 && e++ < 100 )
        // {
        //     d = 150;
        // }
        // at any cost is checks the both the condition 
      
        if( c == 0 || e++ < 100 )
         {
             d = 150;
         }

        System.out.println("e = " + e );
        System.out.println("d = " + d );
    
    }
}