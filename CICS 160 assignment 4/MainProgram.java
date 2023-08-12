//import java.util.ArrayList;
import java.util.Scanner;
public class MainProgram {


    
    public static void enterNewPerson(Persons P, Scanner keyboardReader){
        String newname;
        String address;
        String phone;

        
        System.out.println("Please enter your name: ");
        newname = (keyboardReader.nextLine());
        System.out.println("Please enter your address: ");
        address = (keyboardReader.nextLine());
        System.out.println("Please enter your phone: ");
        phone = keyboardReader.nextLine();
        System.out.println("Is new person a student ");
        String keyboardinput = keyboardReader.nextLine().toLowerCase();
        if (keyboardinput.equals("yes")){
            int year;
            Student aNewStudentObject = new Student(newname, address, phone,0000);
            System.out.println("What is the graduation year ");
            year = Integer.parseInt((keyboardReader.nextLine()));
            aNewStudentObject.setGraduationYear(year);
            P.add(aNewStudentObject);
        }else if (keyboardinput.equals("no")) {
        
            System.out.println("Is new person an employee ");
            if ((keyboardReader.nextLine().toLowerCase().equals("yes"))){
                Employee aNewEmployeeObject = new Employee(newname, address, phone,"None");
                System.out.println("What is the department");
                aNewEmployeeObject.setDepartment(keyboardReader.nextLine());
                P.add(aNewEmployeeObject);
            }else{
                Person newPersonObject = new Person(newname,address,phone);
            P.add(newPersonObject);
            }

        }
    }

    public static  void modifyPerson(Persons P, Scanner keyboardReader ){
        String newname;
        String address;
        String phone;

        
        System.out.println("What is the name of the person object you want to modify ? ");
        String personsearch = keyboardReader.nextLine();
        Persons searchresult = P.search(personsearch);
        //String keyinput = keyboardReader.nextLine();
        for (Person Person : searchresult.getInternalList()){
            System.out.println(Person);

            System.out.println("Is this the person you want to modify \n enter Y or y or no");
            String key = keyboardReader.nextLine().toLowerCase();
            if ((key.equals("y" )) || (key.equals("Y" ))) {
                System.out.println("Would you like to modify name, phone number, or address \n enter name, phone, or address");
                String keyinput = keyboardReader.nextLine().toLowerCase();


                if (keyinput.equals("name")){
                    System.out.println("enter the new name");
                    newname = keyboardReader.nextLine();
                    Person.setName(newname);

                }else if (keyinput.equals("phone")){
                    System.out.println("enter the new phone");
                    phone = keyboardReader.nextLine();
                    Person.setPhone(phone);

                }else if (keyinput.equals("address")){
                    System.out.println("enter the new address");
                    address = keyboardReader.nextLine();
                    Person.setAddress(address);
                }
            }else{
                continue;
            }


}
    }
    
    public static void main (String[] args){
        Persons P = new Persons();
        
        P.add(new Person("Sally", "Amherst", "413-545-8929"));
        P.add(new Student("Maria", "Braintree", "413-545-8929",2026));
        P.add(new Employee("Jaime", "Amherst", "413-545-8929","IT"));
        P.add(new Student("Maria", "Boston", "413-545-8929",2026));

        Scanner keyboardReader = new Scanner(System.in);
        
        int x = 2;
        //String input;
        while (x==2){
            System.out.println("Enter option from list below: \n   1)Display complete directory \n   2)Enter new Person \n   3)Search for Person \n   4)Modify Person information \n   5)Delete a record \n   Q) Quit \nEnter your option: ");
            String inputstring = keyboardReader.nextLine().toLowerCase();
            
            
            if (inputstring.equals("display complete directory")){
                
                P.getInternalList();
                System.out.println(P.toString());



            }else if (inputstring.equals("search for person")){
                System.out.println("What is the name you want to search for");
                String searchP=  keyboardReader.nextLine();
                Persons searchPersons = P.search(searchP);
                System.out.println(searchPersons.toString());
                

            }else if (inputstring.equals("enter new person")){
                
                MainProgram.enterNewPerson( P, keyboardReader);
                // FIX
            
            }else if (inputstring.equals("modify person information")){
                MainProgram.modifyPerson(P, keyboardReader);


            }else if (inputstring.equals("delete a record")){
                System.out.println("What record would you like to delete?");
                int deleteindex=  Integer.parseInt(keyboardReader.nextLine());
                if ((deleteindex >=0) && (deleteindex < P.getSize())){
                    //P.get(deleteindex); 
                    System.out.println("Do you want to delete record " + deleteindex+"\n enter  yes or no");
                    //tring keyinputS = keyboardReader.nextLine().toLowerCase();
                    String key = keyboardReader.nextLine().toLowerCase();
                        if (key.equals("yes" )) {
                            P.delete(deleteindex);
                    }

                }else{
                    System.out.println("Error invalid index");

                }

                //P.delete(deleteindex);


            }else if (inputstring.equals("q")){
                x=3;
                keyboardReader.close();
                System.out.println("you have quit");



        //     }else if (inputstring.equals("q")){
        //         x=3;
        //         keyboardReader.close();
        //         System.out.println("you have quit");

            
        // }}
            }}
        
    }
    }
