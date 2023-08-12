public class Employee extends Person {
    private String department;
    public Employee(String newName, String address, String phone, String department){
        super(newName,address,phone);
        this.department = department;

    }

    void setDepartment(String department){
        this.department = department;

    }

    String getDepartment(){
        return this.department;
    }

    public String toString(){
        return (super.toString()+"Department ="+getDepartment()) +("\n");


    }

public static void main (String[] args){
    System.out.println("testing Employee");
    Employee aEmployeeObject = new Employee("Jaime", "Amherst", "413-545-8929","IT");
    System.out.println(aEmployeeObject.toString());
    }
}

