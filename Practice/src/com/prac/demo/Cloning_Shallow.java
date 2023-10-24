package com.prac.demo;
/**
 * DESC:: Original and clone object refer to same contained reference object
 * 		1.Cloned Object and original object are not 100% disjoint.
 * 		2.Any changes made to cloned object will be reflected in original object or vice versa.
 * 		3.Default version of clone method creates the shallow copy of an object.
 * 		4.Shallow copy is preferred if an object has only primitive fields.
 * 		5.Shallow copy is fast and also less expensive.
 * @author SHIVRAJ S. UMBARKAR
 *
 */
public class Cloning_Shallow
{
    public static void main(String[] args)
    {
        Coursee science = new Coursee("Physics", "Chemistry", "Biology");
 
        Studentt student1 = new Studentt(111, "John", science);
 
        Studentt student2 = null;
 
        try
        {
            //Creating a clone of student1 and assigning it to student2
 
            student2 = (Studentt) student1.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
 
        //Printing the subject3 of 'student1'
 
        System.out.println(student1.course.subject3);         //Output : Biology
 
        //Changing the subject3 of 'student2'
 
        student2.course.subject3 = "Maths";
 
        //This change will be reflected in original student 'student1'
 
        System.out.println(student1.course.subject3);       //Output : Maths
    }
}
class Coursee
{
    String subject1;
 
    String subject2;
 
    String subject3;
 
    public Coursee(String sub1, String sub2, String sub3)
    {
        this.subject1 = sub1;
 
        this.subject2 = sub2;
 
        this.subject3 = sub3;
    }
}
 
class Studentt implements Cloneable
{
    int id;
 
    String name;
 
    Coursee course;
 
    public Studentt(int id, String name, Coursee course)
    {
        this.id = id;
 
        this.name = name;
 
        this.course = course;
    }
 
    //Default version of clone() method. It creates shallow copy of an object.
 
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
 