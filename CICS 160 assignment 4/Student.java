public class Student extends Person {
    private int year;
    public Student(String newName, String address, String phone, int year){
        super(newName,address,phone);
        this.year = year;

    }

    void setGraduationYear(int year){
        this.year = year;

    }

    int getGraduationYear(){
        return this.year;
    }

    public String toString(){
        return (super.toString()+("Grad Year=" + Integer.toString(getGraduationYear()))+"\n");


    }

public static void main (String[] args){
    System.out.println("testing Student");
    Student aNewStudentObject = new Student("Jaime", "Amherst", "413-545-8929",2026);
    

    System.out.println(aNewStudentObject.toString());
    }
}


