package main;

class Customer{
	private int custID;
	private String name;
	private String address;
	private int phoneNo;
	
	//default constructor
		public Customer()
		{
			this.custID = 1;
			this.name = "Jeremy";
			this.address = "XYZ";
			this.phoneNo = 9976485;
		}
	    //parameterized constructor
		public Customer(int i, String n, String a, int p)
		{
			this.custID = i;
			this.name = n;
			this.address = a;
			this.phoneNo = p;
		}
		//setter for item_no
		public void setCustID(int a)
		{
			this.custID = a;
		}
		//getter for item_no
		public int getCustID()
		{
			return this.custID;
		}
		//setter for item_name
		public void setName(String b)
		{
			this.name = b;
		}
		//getter for item_name
		public String getName()
		{
			return this.name;
		}
		//setter for price
		public void setAddress(String c)
		{
			this.address = c;
		}
		//getter for price
		public String getAddress()
		{
			return this.address;
		}
		//setter for quantity
		public void setPhoneNo(int d)
		{
			this.phoneNo = d;
		}
		//getter for quantity
		public int getPhoneNo()
		{
			return this.phoneNo;
		}
		;
		//toString method
		public String toString()
		{
			return " Details [CustomerID = " + custID + "," + "Name = "+ name +"," + "Address = " + address + "," + " Phone No = " + phoneNo + "]";
		}
		
		
		
}

public class LabExample2 {

	public static void main(String[] args) {
		Customer[] customers = new Customer[5];
		
	    customers[0] = new Customer(2, "Henry", "ABC", 87568);
	    customers[0].setCustID(1);
	    customers[0].setName("Joe");
	    customers[0].setAddress("xyz");
	    customers[0].setPhoneNo(3886);
	
		
	    customers[1] = new Customer();
	    customers[1].setCustID(2);
	    customers[1].setName("Henry");
	    customers[1].setAddress("XYZ");
	    customers[1].setPhoneNo(39475);
		
		
	    customers[2] = new Customer(3,"Marry", "ABC", 9876);
	
		
	    customers[3] = new Customer(4,"Joe", "XYZ", 32454);
		
		
	    customers[4] = new Customer(5,"Mick", "ABC", 73657);

		
		for(int i = 0; i < customers.length; i++)
		{
			System.out.println(customers[i]);
		}
		

	}

}
