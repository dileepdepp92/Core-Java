/**
 * @author Dileep
 **/
package studentcreator;

public class StudentCreator {

    public static void main(String[] args) {
        
        Student student1 = new Student("bob",17);
        Student student2 = new Student("Jan",13);
        
        System.out.println("name: "+ student1.getName());
        System.out.println("age: "+ student1.getAge());
        System.out.println("type of student: "+ student1.getType());
        System.out.println("\nname: "+ student2.getName());
        System.out.println("age: "+ student2.getAge());
        System.out.println("Type of student: "+ student2.getType());
        
        student1.setAge(18);
        System.out.println("\nname: "+ student1.getName());
        System.out.println("age: "+ student1.getAge());
        System.out.println("type of student: "+ student1.getType());
        

    }
    
}
