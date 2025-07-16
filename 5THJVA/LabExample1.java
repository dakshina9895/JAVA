package main;

class Product{
	private int item_no;
	private String item_name;
	private int price;
	private int quantity;
	
	//default constructor
	public Product()
	{
		this.item_no = 1;
		this.item_name = "Milk";
		this.price = 20;
		this.quantity = 2;
	}
    //parameterized constructor
	public Product(int n, String s, int p, int q)
	{
		this.item_no = n;
		this.item_name = s;
		this.price = p;
		this.quantity = q;
	}
	//setter for item_no
	public void setItem_no(int a)
	{
		this.item_no = a;
	}
	//getter for item_no
	public int getItem_no()
	{
		return this.item_no;
	}
	//setter for item_name
	public void setItem_name(String b)
	{
		this.item_name = b;
	}
	//getter for item_name
	public String getItem_name()
	{
		return this.item_name;
	}
	//setter for price
	public void setPrice(int c)
	{
		this.price = c;
	}
	//getter for price
	public int getPrice()
	{
		return this.price;
	}
	//setter for quantity
	public void setQuantity(int d)
	{
		this.quantity = d;
	}
	//getter for quantity
	public int getQuantity()
	{
		return this.quantity;
	}
	;
	//toString method
	public String toString()
	{
		return " Details [Item_no = " + item_no + "," + "Item_name = "+ item_name +"," + "Price = " + price + "," + " Quantity = " + quantity + "]";
	}
	
	
	
}
public class LabExample1 {

	public static void main(String[] args) {
		/*Product p1 = new Product();
		Product p2 = new Product(2, "Coffee", 40, 1);
		System.out.println(p1);
		System.out.println(p2);*/
		
		Product[] products = new Product[5];
		
		products[0] = new Product(2, "Coffee", 40, 1);
		products[0].setItem_no(1);
		products[0].setItem_name("Milk");
		products[0].setPrice(16);
		products[0].setQuantity(2);
		//System.out.println(products[0]);
		
		products[1] = new Product();
		products[1].setItem_no(2);
		products[1].setItem_name("Coffee");
		products[1].setPrice(40);
		products[1].setQuantity(3);
		//System.out.println(products[1]);
		
		products[2] = new Product(3,"Cup", 50, 3);
		//System.out.println(products[2]);
		
		products[3] = new Product(4,"Pen", 10, 2);
		products[3].setQuantity(1);
		//System.out.println(products[3]);
		
		products[4] = new Product(5,"Notebook", 55, 5);
		//System.out.println(products[4]);
		
		for(int i = 0; i < products.length; i++)
		{
			System.out.println(products[i]);
		}
		
		
		
		
		
		

	}

}
