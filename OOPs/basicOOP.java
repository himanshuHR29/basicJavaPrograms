
public class basicOOP {
    public static void main(String[] args) {
        Student a=new Student(1,"He",00);
        Student b=new Student(2, "Her",100);
        a.display();
        b.display();
        System.out.println(b.name);
        Student him=new Student(10, "zyz", 19);
        for(int i=0;i<100000;i++){
            him= new Student(9,"random", 29);
        }
    }
}
class Student{
    int rollNumber;  //Instance variables
    String name;
    float marks;
    Student(int roll, String naam, float marks){
        this.rollNumber=roll;
        this.name=naam;
        this.marks=marks;
    }
    void display(){
        System.out.println("Roll number: "+rollNumber+" Name- "+name+" Marks- "+marks);
    }

    protected void finalize(){
        System.out.println("Phuck u");
    }
}
