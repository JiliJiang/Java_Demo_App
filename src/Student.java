public class Student {
    public String Name;
    public Student(String name){
        this.Name = name;
    }

    public String GetName (){
        return this.Name;
    }

    public static void main (String[] args){

        Student newStudent = new Student("Alice");
        System.out.println("The new student name is: "+ newStudent.GetName());

    }
}
