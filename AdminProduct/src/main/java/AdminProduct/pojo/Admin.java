package AdminProduct.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.ToString;

@Document(collection="products")
@ToString
public class Admin {
@Id
private long id;
private String productName;
private String productDetails;

public Admin() {}

public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getProductDetails() {
	return productDetails;
}
public void setProductDetails(String productDetails) {
	this.productDetails = productDetails;
}
public Admin(long id, String productName, String productDetails) {
	super();
	this.id = id;
	this.productName = productName;
	this.productDetails = productDetails;
}

}
