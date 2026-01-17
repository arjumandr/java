package assignment3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Address implements Serializable{
	private String street;
    private String city;
    private String state;
    private String zipCode;

    // Constructor
    public Address(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }
    @Override
    public String toString() {
        return street + ", " + city + ", " + state + " - " + zipCode;
    }
}
class Employee implements Serializable{

	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private Address address;
	private transient double salary;
	public Employee(int id, String name, Address address, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}	
	// salary wont be serialized now
	@Override
    public String toString() {
        return "Name: " + name + "\nAddress: " + address + "\nSalary: " + salary;
    }
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Address getAddress() {
		return address;
	}
	public double getSalary() {
		return salary;
	}
}

public class ques3 {
	public static void serialize() throws IOException, ClassNotFoundException{
		Address address = new Address("ab", "delhi", "new delhi", "1023");
		Employee employee = new Employee(1, "AB", address, 20000);
		FileOutputStream fos = new FileOutputStream("output_file.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
	    oos.writeObject(employee);
	    oos.flush();
	    oos.close();
	    
	    FileInputStream fis = new FileInputStream("output_file.txt");
	    ObjectInputStream ois = new ObjectInputStream(fis);
	    Employee employee2 = (Employee)ois.readObject();
	    ois.close();
	    System.out.println("Before serialization: ");
	    System.out.println(employee);
	    System.out.println("After serialization: ");
	    System.out.println(employee2);
	}
	public static void main(String[] args) {
		try{
			serialize();
		}
		catch(IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
	}
}
