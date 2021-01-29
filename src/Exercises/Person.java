
//ex30
public class Person {
    // write your code here
    private int age;
    private String firstName;
    private String lastName;
    
    public String getFirstName(){
        return this.firstName;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    
      public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public void setAge(int age){
        if(age<0 || age>100){
            this.age=0;
        }
        else{
            this.age=age;
        }
        }
    
    public boolean isTeen(){
        if (age>12 && age<20){
            return true;
        
        }
        else 
        return false;
        
    }
    
    
     public String getLastName(){
        return this.lastName;
    }
    
    
     public int getAge(){
         
        return this.age;
    }
    public String getFullName(){
        if (firstName.isEmpty()){
            return lastName;
        }
        else if(lastName.isEmpty()){
            return firstName;
        }
        else
        return firstName+ " "+lastName;
    }
}