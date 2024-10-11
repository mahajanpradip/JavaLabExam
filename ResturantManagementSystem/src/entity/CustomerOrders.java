package entity;

import java.util.ArrayList;

public class CustomerOrders {
String orderId;
String quantity;
int totalPrice;
//public CustomerOrders(String orderId, String quantity) {
//	this.orderId ="oid "+ ++oid;
//	this.quantity = quantity;
//}
public CustomerOrders(String orderId, String quantity, int totalPrice) {

	this.orderId =orderId;
	this.quantity = quantity;
	this.totalPrice =totalPrice;
}
public String getOrderId() {
	return orderId;
}
public void setOrderId(String orderId) {
	this.orderId = orderId;
}
public String getQuantity() {
	return quantity;
}
public void setQuantity(String quantity) {
	this.quantity = quantity;
}
public int getTotalPrice() {
	return totalPrice;
}
public void setTotalPrice(int totalPrice) {
	this.totalPrice = totalPrice;
}


}