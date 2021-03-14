package cakirmarket.product.fruit;


public class Apple{
	private float price;
	private String color;
	private int quantity;

	public float getPrice(){
		return this.price;
	}
	
	public String getColor(){
		return this.color;
	}

	public int getQuantity(){
		return quantity;
	}

	public void setPrice(float price){
		this.price = price;
	}

	public void setColor(String color){
		this.color = color;
	}
	
	public void setQuantity(int quantity){
		this.quantity = quantity;
	}
}