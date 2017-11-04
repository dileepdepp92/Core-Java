/**
 * @author Dileep
 **/
package studentcreator;

public class Student {
    private String name = null;
    private int age = 0;
    private String type =null;
    
    
    public Student(String newName, int newAge ){
        setName(newName);
        setAge(newAge);
    }
    public final void setName(String newName){
        this.name=newName;
    }
    public String getName(){
        return this.name;
    }
    public final void setAge(int newAge){   
        if (newAge > 0){
        this.age=newAge;
        this.setType();
        }else {
            System.out.println("age cannot be less than zero");
        }
    }
    public int getAge(){
        return this.age;
    }
    public final void setType(){
        String newType = null;
        if (age <= 4 ){
            newType = "Preschool";
        }else if (age == 5){
            newType = "Kindergarden";            
        }else if (age >=6 && age <=10){
            newType = "Elementary School";            
        }else if (age >= 11 && age <=13){
            newType = "Middle School";            
        }else if (age >= 14 && age <=17){
            newType = "High School";            
        }else if (age >= 18 ){
            newType = "College";            
        }
        this.type=newType;
    }
    public String getType(){
        return this.type;
    }
    
}
