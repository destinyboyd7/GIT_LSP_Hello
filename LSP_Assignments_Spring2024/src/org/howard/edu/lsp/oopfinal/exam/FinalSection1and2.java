package org.howard.edu.lsp.oopfinal.exam;

public class FinalSection1and2 {

}
/*
Section 1: True/False. (15 pts., 1 pt. each)

1.	T  F When designing a class, each class should be designed to have multiple goals so that your overall design can have fewer classes
	a.	False 

2.	T  F Inheritance provides a mechanism by which changes to lower-level classes can be propagated to all super classes quickly
	a.	False
	
3.	T  F Design patterns are reusable libraries that can immediately be used in your code
	a.	False
	
4.	T  F Frameworks and design patterns are the same thing as far as designers are concerned
	a.	False

5.	T  F Because of potential problems, developers must be aware of the effects of modifications in a superclass and in each of the subclasses that will inherit the modifications.
	a.	True
	
6.	T  F Factory pattern can be combined with other patterns
	a.	True 

7.	T  F Creational design patterns are all about Class and Object composition.
	a.	True 

8.	T  F Structural design patterns are all about class instantiation
	a.	False

9.	T  F Design patterns are a mechanism that enable developer to reuse code in their implementations.
	a.	True 

10.	T  F Behavioral design patterns are all about Class's objects communication
	a.	True

11.	T  F Information hiding makes program maintenance software development more difficult because other developer are not privy to an object’s implementation details.
	a.	False

12.	T  F In Java, the signature of a method is completely specified by the name of the method and the parameters that must be passed to the method.
	a.	False

13.	T  F The relationship between two objects related by composition cannot be changed at runtime. 
	a.	False

14.	T  F When iterating a Java HashSet, you are guaranteed to retrieve objects stored in the same order they were inserted
	a.	False 

15.	T  F Software designs are refactored to allow the creation of software that is easier to maintain and reuse.
	a.	True

















Section 2: Multiple Choice, answer each question. (20 pts., 1 pt. each)

1.	Which of the following option leads to the portability and security of Java? (a)
a)	Bytecode is executed by JVM
b)	Use of exception handling
c)	Dynamic binding between objects
d)	Proper encapsulation of classes and objects.

2.	What is the role of mocking frameworks like Mockito in unit testing?(b)
a)	They provide assertions for test cases.
b)	They are used to create mock objects for unit tests.
c)	They execute test cases in parallel.
d)	They automate the testing process.

3.	What is the primary purpose of unit testing?(c)
a)	To verify the correctness of the entire system.
b)	To test the integration between different components.
c)	To validate that individual units of code work as expected.
d)	To assess the performance of the application.

4.	What is regression testing?(b)
a)	Testing the system in various environments.
b)	Repeating previous tests to ensure existing functionality is not affected by changes.
c)	Testing the performance of the system under load.
d)	Verifying the correctness of a single unit of code.

5.	The root interface of the Java Collection framework hierarchy is. (a)
a)	Collection
b)	Root
c)	Collections
d)	List/Set

6.	What interface in the Java Collections framework extends Map and represents a collection of key/value pairs where keys are ordered? (c)
a)	HashMap
b)	LinkedHashMap
c)	TreeMap
d)	HashTable

7.	What interface in the Java Collections framework represents a last-in, first-out (Last In First Out) collection of objects?(d)
a)	Queue
b)	List
c)	HashMap
d)	Stack

8.	Which of the following is true about design patterns? (Choose the best answer). (d)
a)	Design patterns represent the best practices used by experienced object-oriented software developers.
b)	Design patterns are solutions to general problems that software developers faced during software development.
c)	Design patterns are obtained by trial and error by numerous software developers over quite a substantial period.
d)	All of the above.

9.	You want all the clients using class A to use the same instance of class A when the class is instantiated, what should you do to achieve this goal?  (c )
a)	Mark class A final 
b)	Mark class A abstract 
c)	Apply the Singleton pattern to class A 
d)	Apply the Proxy pattern to class A

10.	You have a class that accepts and returns values in British Imperial units (feet, miles, etc.), but you need to use metric units. The design pattern that would best solve your problem is:  (a )
a)	Adapter
b)	Decorator
c)	Delegation
d)	Proxy

11.	Which of the following describes the Facade pattern correctly?(c )
a)	This pattern allows a user to add new functionality to an existing object without altering its structure.
b)	This pattern is used when we need to treat a group of objects in a similar way as a single object.
c)	This pattern hides the complexities of the system and providers an interface to the client using which the client can access the system.
d)	This pattern is primarily used to reduce the number of objects created and to decrease memory footprint and increase performance.

12.	Which of the following are concerned with communication between objects? (b )
a)	J2EE Design Patterns
b)	Behavioral Design Patterns
c)	Structural Design Patterns
d)	Creational Design Patterns

13.	Which of the following is correct about Creational design patterns?(b)
a)	These design patterns are specifically concerned with communication between objects.
b)	These design patterns provide a way to create objects while hiding the creation logic, rather than instantiating objects directly using new operator.
c)	These design patterns concern class and object composition. Concept of inheritance is used to compose interfaces and define ways to compose objects to obtain new functionalities.
d)	None of the above.

14.	What is the role of the Template Method in the Template Method design pattern?(d)
a)	To ensure a class has only one instance and provides a global point of access to it.
b)	To define a family of algorithms, encapsulate each one, and make them interchangeable.
c)	To provide an interface for creating families of related or dependent objects without specifying their concreate classes.
d)	To define the skeleton of an algorithm in the superclass but let subclasses override specific steps of the algorithm without changing its structure.
15.	Which of the following describes the Factory pattern correctly? (a)
a)	This pattern creates an object without exposing the creation logic to the client and refers to newly created objects using a common interface.
b)	In this pattern, an interface is responsible for creating a factory of related objects without explicitly specifying their classes.
c)	This pattern involves a single class that is responsible to create an object while making sure that only a single object is created.
d)	This pattern is used when we want to pass data with multiple attributes in one shot from client to server.

16.	In the Command design pattern, what is the purpose of the Command interface? (b)
a)	To provide an interface for creating families of related or dependent objects without specifying their concrete classes.
b)	To encapsulate a request as an object, thereby allowing for parameterization of clients with different requests.
c)	To define a family of algorithms, encapsulate each one, and make them interchangeable.
d)	To ensure a class has only one instance.

17.	What is the main advantage of the Strategy design pattern?(d)
a)	It allows a class to have only one instance.
b)	It defines a family of algorithms, encapsulates each one, and makes them interchangeable.
c)	It allows the definition of a family of algorithms, encapsulates each one, and makes them interchangeable.
d)	It enables the selection of an algorithm’s implementation at runtime.

18.	This design pattern should be used to access the contents of a collection without exposing its internal representation, to support multiple traversals of a collection, and to provide a uniform interface for traversing different collections.  (c )
a)	Template method
b)	Strategy
c)	Iterator 
d)	Factory method

19.	Which design pattern should you use when you want to provide a simple interface to a complex subsystem?  (b) 
a)	Adapter
b)	Facade
c)	Abstract Factory
d)	Singleton

20.	What is the intent of the Adapter design pattern?(b)
a)	To provide an interface for creating families of related or dependent objects without specifying their concrete classes.
b)	To convert the interface of a class into another interface clients expect.
c)	To ensure a class has only one instance.
d)	To define a family of algorithms, encapsulate each one, and make them interchangeable.
*/
