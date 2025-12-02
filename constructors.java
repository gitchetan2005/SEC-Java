class Student{
    String name;
    int age;
    String course;
    
    Student(){
        this("unknown",0,"unknown");
        System.out.println("no arg constructor");
    }
    Student(String n,int a){
        this(n,a," engineering ");
        System.out.println("2 arg constructor called");
    }
    Student(String n1,int a1,String c1){
        this.name=n1;
        this.age=a1;
        this.course=c1;
        System.out.println("all arg constructor");
    }
    void display(){
        System.out.println("hello "+name+" your age: "+age+" course "+course);
        System.out.println("");
    }
}
public class constructors{
    public static void main(String[]args){
        Student s1=new Student();
        s1.display();
        
        Student s2=new Student("raj",20);
        s2.display();
        
        Student s3=new Student("Chetan",19,"AIML");
        s3.display();
    }
}