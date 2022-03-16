package shop.pojo;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="order")
public class User {
@Id
private int id;
private String name;
private List<Products>products;

public User() {}

public User(int id, String name, List<Products> products) {
	super();
	this.id = id;
	this.name = name;
	this.products = products;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<Products> getProducts() {
	return products;
}
public void setProducts(List<Products> products) {
	this.products = products;
} 

}
