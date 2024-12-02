
class opDemo6
{
public static void main(String arg[])
    {

        Student s1 = new Student();

        if(s1 instanceof Student){
            System.out.println("TRUE");
        }
    
    }
}


class Student{
    int rollNo;
}