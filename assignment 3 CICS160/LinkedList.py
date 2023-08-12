from Node import Node
from Person import Person
from Student import Student
from Employee import Employee


class LinkedList:
    def __init__(self):
        self.head = None
        self.tail = None
        self.size = 0

    def length(self):
        return(self.size)

    def add(self, e):
        n = Node()
        n.setData(e)
        if self.size == 0:
            self.head = n
            self.tail = n
        else:
            currentlyTheLastElement      = self.tail
            n.setPrevious(currentlyTheLastElement)
            currentlyTheLastElement.setNext(n)
            self.tail                    = n
    
        self.size = self.size + 1
                

    def __getitem__(self, i):
        if i in range(0,self.size):
            currentElement = self.head
            howManyIHaveSkippedOver = 0
            while (howManyIHaveSkippedOver <= i):

                if howManyIHaveSkippedOver == i:
                    return(currentElement.getData())
                currentElement = currentElement.getNext()
                howManyIHaveSkippedOver = howManyIHaveSkippedOver + 1

            

    def __iter__(self):
        current = self.head
        while current:
            yield current
            current = current.next


    def __str__(self):
        stringToReturn = ""
        for e in self:
            stringToReturn = stringToReturn + str(e) + "\n"
        return(stringToReturn)

    def delete(self,i):
        if i == 0:
            temp = self.head
            self.head = self.head.next
            self.size= self.size-1
            temp = None
            self.size = self.size-1

        elif i == (self.size -1 ):
            currentElement = self.head 
            while (currentElement.next != None):
                currentElement          = currentElement.next
            y= currentElement.getPrevious()
            y.next = None
            self.size = self.size-1

        elif i not in range(0,self.size-1):
            return ('Element not in list range')

        else:   
            currentElement = self.head
            howManyIHaveSkippedOver = 0
            while (howManyIHaveSkippedOver < i):
                currentElement          = currentElement.next
                howManyIHaveSkippedOver = howManyIHaveSkippedOver + 1
            x= (currentElement.getPrevious())
            x.next = (currentElement.next)
            currentElement = None
            self.size = self.size-1


    def insert(self,place,Person):
        p = Node()
        p.setData(Person)
        
        if place == self.size:
            
            currentElement = self.tail
            currentElement.setNext(p)
            self.tail = p 
            p.setNext(None) 
            p.setPrevious(currentElement)
            self.size = self.size +1
            

        elif place == 0:
            currentElement= self.head
            p.setNext(currentElement)
            currentElement.setPrevious(p)
            self.head = p
            self.size = self.size +1

        else:
        #if place in range(1,self.size-1):
            currentElement = self.head
            howManyIHaveSkippedOver = 0
            while (howManyIHaveSkippedOver < place):
                currentElement          = currentElement.getNext()
                howManyIHaveSkippedOver = howManyIHaveSkippedOver + 1


            x= (currentElement.getPrevious())
            x.setNext(p)
            p.setPrevious(x)
            p.setNext(currentElement)
            currentElement.setPrevious(p)
            self.size = self.size +1
            
    def search(self, name):
        currentElement = self.head
        searchpersons = LinkedList()
        while (currentElement.getNext() != None):
            if (currentElement.data.getName() == name): 
                searchpersons.add(currentElement.getData())
            currentElement = currentElement.getNext()

            
        if currentElement.getNext() == None:
            if currentElement.data.getName() == name: 
                searchpersons.add(currentElement.getData())

        return searchpersons

                
                

            


        
    






if __name__=="__main__":
    persons = LinkedList()
    persons.add(Person("second", "amherst","111-111-1111"))
    persons.add(Person("third", "stow","222-222-2222"))
    persons.add(Person("fifth", "nyc","333-333-3333"))
    persons.add(Person("sixth", "malden","444-444-4444"))
    persons.add(Employee("seventh", "Rio Piedras","807-343-9999", 'IT'))
    persons.add(Student("8th", "malden","999-999-9999",2025))


    persons.insert(6,Person("seventh", "2ndreturn","222-222-2222"))
    persons.insert(0,Person("first", "stow","222-222-2222"))
    persons.insert(3,Student("fourth", "stow","222-222-2222",2022))

 
    persons.delete(8)
    persons.delete(0)
    persons.delete(4)
    
    print(persons)


