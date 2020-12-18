package assignmentday2;

public class Product {
	int productid;
	String name;
	int price;
	int availablestock;

}
void stocknotify() {
	if(availablestock<10) 
	{
		System.out.println("no stock");
	}
	else {
		System.out.println("Stock is " + availablestock);
	}
	void calcprodcomm()
	{
		double com1=0;
		com1=(0.1*price);
		return com1;
	}
	void checkProductavailability() {
		if(name == "laptop" ||name == "pendrive" ||name == "mouse")
{​​​​​​
            System.out.println("Products Available");}

	}
	
}