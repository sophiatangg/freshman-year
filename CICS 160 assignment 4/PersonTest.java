
import static org.junit.Assert.assertEquals;
import org.junit.Test;

    public class PersonTest {
        public static void main(String[] args) {

        }
    
        @Test
        public void PersonsTestAdd() {
            Persons brandNewList = new Persons();
            Employee aEmployeeObject = new Employee("Jaime", "Amherst", "413-545-8929","IT");
            Student aStudentObject = new Student("Maria", "Amherst", "413-545-8929",2026);
            Student a2StudentObject = new Student("Maria", "Braintree", "413-545-8929",2026);
            Person aNewPersonObject = new Person("Sally", "Amherst", "413-545-8929");
            brandNewList.add(aEmployeeObject);
            brandNewList.add(aStudentObject);
            brandNewList.add(a2StudentObject);
            brandNewList.add(aNewPersonObject);
            assertEquals(brandNewList.getInternalList().get(0).toString(), aEmployeeObject.toString());
        }

        @Test
        public void PersonsTestDelete() {
            Persons brandNewList = new Persons();
            Persons SecondNewList = new Persons();
            Employee aEmployeeObject = new Employee("Jaime", "Amherst", "413-545-8929","IT");
            Student aStudentObject = new Student("Maria", "Amherst", "413-545-8929",2026);
            Student a2StudentObject = new Student("Maria", "Braintree", "413-545-8929",2026);
            Person aNewPersonObject = new Person("Sally", "Amherst", "413-545-8929");
            brandNewList.add(aEmployeeObject);
            brandNewList.add(aStudentObject);
            brandNewList.add(a2StudentObject);
            brandNewList.add(aNewPersonObject);
            SecondNewList.add(aEmployeeObject);
            SecondNewList.add(aStudentObject);
            SecondNewList.add(a2StudentObject);
            SecondNewList.add(aNewPersonObject);
            brandNewList.delete(0);
            SecondNewList.delete(0);
            // This is because if my delete function works, then if I delete the same object from both
            // arrayLists then hypothetically I would still have the two lists having the same output if
            // I called on the twoString() method for both because it would both spit back the exact same thing
            assertEquals(brandNewList.toString(), SecondNewList.toString());

        }
    
    }



