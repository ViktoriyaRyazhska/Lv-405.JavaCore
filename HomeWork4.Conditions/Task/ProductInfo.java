package Task;

public class ProductInfo {

	public static void main(String[] args) {
		Product product1 = new Product ("Bread", 10, 125);
		Product product2 = new Product ("Cheese", 45, 57);
		Product product3 = new Product ("Meat", 120, 80);
		Product product4 = new Product ("Water", 8, 250);
		
		
		
		if (product1.getPrice() > product2.getPrice() &&  product1.getPrice() > product3.getPrice() && product1.getPrice() > product4.getPrice()) {
			System.out.println(product1.getName() + " " + product1.getQuantity());
		}
		if (product2.getPrice() > product1.getPrice() &&  product2.getPrice() > product3.getPrice() && product2.getPrice() > product4.getPrice()) {
			System.out.println(product2.getName() + " " + product2.getQuantity());
		}
		if (product3.getPrice() > product1.getPrice() &&  product3.getPrice() > product2.getPrice() && product3.getPrice() > product4.getPrice()) {
			System.out.println(product3.getName() + " " + product3.getQuantity());
		}
		if (product4.getPrice() > product1.getPrice() &&  product4.getPrice() > product2.getPrice() && product4.getPrice() > product3.getPrice()) {
			System.out.println(product4.getName() + " " + product4.getQuantity()); 
		}	
		
		
		if (product1.getQuantity() > product2.getQuantity() &&  product1.getQuantity() > product3.getQuantity() && product1.getQuantity() > product4.getQuantity()) {
			System.out.println(product1.getName());
		}
		if (product2.getQuantity() > product1.getQuantity() &&  product2.getQuantity() > product3.getQuantity() && product2.getQuantity() > product4.getQuantity()) {
			System.out.println(product2.getName());
		}
		if (product3.getQuantity() > product1.getQuantity() &&  product3.getQuantity() > product2.getQuantity() && product3.getQuantity() > product4.getQuantity()) {
			System.out.println(product3.getName());
		}
		if (product4.getQuantity() > product1.getQuantity() &&  product4.getQuantity() > product2.getQuantity() && product4.getQuantity() > product3.getQuantity()) {
			System.out.println(product4.getName()); 
		}		
		}
		
	
	

	

}