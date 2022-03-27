Comparator Interface in Java with Examples
Difficulty Level : Medium
Last Updated : 17 Dec, 2021
A comparator interface is used to order the objects of user-defined classes. A comparator object is capable of comparing two objects of the same class. Following function compare obj1 with obj2.

Syntax: 

Attention reader! Don’t stop learning now. Get hold of all the important Java Foundation and Collections concepts with the Fundamentals of Java and Java Collections Course at a student-friendly price and become industry ready. To complete your preparation from learning a language to DS Algo and many more,  please refer Complete Interview Preparation Course.

public int compare(Object obj1, Object obj2):
Suppose we have an Array/ArrayList of our own class type, containing fields like roll no, name, address, DOB, etc, and we need to sort the array based on Roll no or name?

 
Method 1: One obvious approach is to write our own sort() function using one of the standard algorithms. This solution requires rewriting the whole sorting code for different criteria like Roll No. and Name.




Method 2: Using comparator interface- Comparator interface is used to order the objects of a user-defined class. This interface is present in java.util package and contains 2 methods compare(Object obj1, Object obj2) and equals(Object element). Using a comparator, we can sort the elements based on data members. For instance, it may be on roll no, name, age, or anything else.

Method of Collections class for sorting List elements is used to sort the elements of List by the given comparator.  

public void sort(List list, ComparatorClass c)
To sort a given List, ComparatorClass must implement a Comparator interface.

How do the sort() method of Collections class work? 
Internally the Sort method does call Compare method of the classes it is sorting. To compare two elements, it asks “Which is greater?” Compare method returns -1, 0, or 1 to say if it is less than, equal, or greater to the other. It uses this result to then determine if they should be swapped for their sort.

Example


// Java Program to Demonstrate Working of
// Comparator Interface
 
// Importing required classes
import java.io.*;
import java.lang.*;
import java.util.*;
 
// Class 1
// A class to represent a Student
class Student {
 
    // Attributes of a student
    int rollno;
    String name, address;
 
    // Constructor
    public Student(int rollno, String name, String address)
    {
 
        // This keyword regers to current instance itself
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }
 
    // Method of Student class
    // To print student details in main()
    public String toString()
    {
 
        // Returning attributes of Student
        return this.rollno + " " + this.name + " "
            + this.address;
    }
}
 
// Class 2
// Helper class implementing Comparator interface
class Sortbyroll implements Comparator<Student> {
 
    // Method
    // Sorting in ascending order of roll number
    public int compare(Student a, Student b)
    {
 
        return a.rollno - b.rollno;
    }
}
 
// Class 3
// Helper class implementing Comparator interface
class Sortbyname implements Comparator<Student> {
 
    // Method
    // Sorting in ascending order of name
    public int compare(Student a, Student b)
    {
 
        return a.name.compareTo(b.name);
    }
}
 
// Class 4
// Main class
class GFG {
 
    // Main driver method
    public static void main(String[] args)
    {
 
        // Creating an empty ArrayList of Student type
        ArrayList<Student> ar = new ArrayList<Student>();
 
        // Adding entries in above List
        // using add() method
        ar.add(new Student(111, "Mayank", "london"));
        ar.add(new Student(131, "Anshul", "nyc"));
        ar.add(new Student(121, "Solanki", "jaipur"));
        ar.add(new Student(101, "Aggarwal", "Hongkong"));
 
        // Display message on console for better readibility
        System.out.println("Unsorted");
 
        // Iterating over entries to print them
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
 
        // Sorting student entries by roll number
        Collections.sort(ar, new Sortbyroll());
 
        // Display message on console for better readibility
        System.out.println("\nSorted by rollno");
 
        // Again iterating over entries to print them
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
 
        // Sorting student entries by name
        Collections.sort(ar, new Sortbyname());
 
        // Display message on console for better readibility
        System.out.println("\nSorted by name");
 
        // // Again iterating over entries to print them
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
    }
}