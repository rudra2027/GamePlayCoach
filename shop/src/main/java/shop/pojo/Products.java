package shop.pojo;

public class Products {
private String Name;
private int cost;
private int quantity;

public Products() {}

public Products(String name, int cost, int quantity) {
	super();
	this.Name = name;
	this.cost = cost;
	this.quantity = quantity;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public int getCost() {
	return cost;
}
public void setCost(int cost) {
	this.cost = cost;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}


}
