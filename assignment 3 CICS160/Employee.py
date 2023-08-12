from Person import Person 
class Employee(Person):
    def __init__(self, newName="none", address="none", phone="999-999-9999", department="not assigned"):
        super().__init__(newName,address,phone)

        self.department = department


    def __str__(self):
         return super().__str__()+ "Department  :"+ self.department+'\n'
    
    def getDepartment(self):
        return(self.department)

    def setDepartment(self,departmentname):
        self.department = departmentname

