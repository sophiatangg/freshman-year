import java.util.Scanner;

class Person {
    private String name;
    private String address;
    private String phone;
    private int    age;
    Person(String newName, String address, String phone){
        this.name = newName;
        this.address = address;
        this.phone = phone;
    }

    

    void setName(String name){
        this.name = name;
    }

    void readNameFromKeyboard() {
        Scanner keyboardReader = new Scanner(System.in);
        String name = keyboardReader.nextLine();
        this.name = name;
        keyboardReader.close();
    }

    void readAgeFromKeyboard(){
        Scanner keyboardReader = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        this.age = keyboardReader.nextInt();
        keyboardReader.close();
    }

    String getName(){
        return(this.name);
    }
    void setAddress(String address){
        this.address = address;
    }

    void setPhone(String phone){
        this.phone = phone;
    }

    String getPhone(){
        return(this.phone);
    }

    String getAddress(){
        return(this.address);
    }

    int getAge(){
        return this.age;
    }

    public String toString(){
        return (("Name= "+getName()) +("\nAddress = "+ getAddress()) + ("\nPhone = "+getPhone()) +"\n");

    }
    public static void main (String[] args){
        System.out.println("testing Person");
        Person aNewPersonObject = new Person("Jaime", "Amherst", "413-545-8929");
        aNewPersonObject.readNameFromKeyboard();
        System.out.println(aNewPersonObject.toString());
    }
}

