import java.util.ArrayList;
//import java.util.List;

public class Persons {
    public ArrayList<Person> persons = new ArrayList<Person>();
    

    public String toString(){
        String returnstring = "";
        for (int i = 0; i < persons.size(); i++){
            //Persons newPersons = new Persons();
            Person itemlookingat;
            itemlookingat = persons.get(i);
            if (itemlookingat instanceof Person){
                returnstring = returnstring+ itemlookingat.toString() + "\n";
                
            }else if (itemlookingat instanceof Employee){
                returnstring = returnstring+ itemlookingat.toString()+ "\n";
                
            }else if (itemlookingat instanceof Student){
                returnstring = returnstring+ itemlookingat.toString() +"\n";
                
            }
        }
        return returnstring;
        }
    
    int size = 0;
    int index = 0;


    int getSize(){   

        size = persons.size();
        return size;
       }

    void add(Person p){
        persons.add(p);
    }

    void delete(int i){
        persons.remove(i);
    }



    Persons search(String name){
        Persons newPersons = new Persons();
        for (int i = 0; i < persons.size(); i++){
            //Persons newPersons = new Persons();
            Person itemlookingat;
            itemlookingat = persons.get(i);
            if (itemlookingat.getName().equals(name)){
                //Persons newPersons = new Persons();
                newPersons.add(itemlookingat);
            }
        }
        //System.out.println(newPersons.toString());
        return newPersons;
    }
        



   ArrayList<Person> getInternalList(){ // fix/
    return persons;
   }

    public static void main (String[] args){
        
        Employee aEmployeeObject = new Employee("Jaime", "Amherst", "413-545-8929","IT");
        Student aStudentObject = new Student("Maria", "Amherst", "413-545-8929",2026);
        Student a2StudentObject = new Student("Maria", "Braintree", "413-545-8929",2026);
        Person aNewPersonObject = new Person("Sally", "Amherst", "413-545-8929");
        Person testadd = new Person("May", "Sharon", "413-545-8929");
        //ArrayList<Person> returnList = new ArrayList<Person>();
        Persons Persons = new Persons();
        
        Persons.add(aEmployeeObject);
        Persons.add(aStudentObject);
        Persons.add(a2StudentObject);
        Persons.add(aNewPersonObject);
        
        System.out.println(Persons.toString());
        Persons.delete(0);
        System.out.println(Persons.toString());
        Persons.delete(2);
        System.out.println(Persons.toString());
        Persons.add(testadd);
        System.out.println(Persons.toString());
        


}
}
