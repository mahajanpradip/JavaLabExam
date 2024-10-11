
package operation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

import entity.CustomerOrders;
import entity.MenuItem;

public class Resturant {
HashMap<String ,MenuItem> menucard; 
HashMap<String ,CustomerOrders> orders;
int tprice;
 public Resturant() {
	 this.menucard=new HashMap<>();
	 this.orders=new HashMap<>();
 }
 public void OrderItem(MenuItem item) {
	  menucard.put(item.getItemId(), item);
	  System.out.println("item added");
 }
 public void removeItem(String itemid) {
	 if(menucard.containsKey(itemid)) {
	 menucard.remove(itemid);
	 System.out.println("item removed..");
	 }else {
		 System.out.println("item not found");
	 }
 }
 public void  displaymenu() {
	 for(MenuItem menu:menucard.values()) {
		 System.out.println("item id is =>>  "+ menu.getItemId()+
				 "    item name =>> "+menu.getItemName()+"    price of item =>> "+menu.getPrice());
		 
	 }
 }
 String file="D:\\Pradip\\Pradip.txt";
 public void writeFile(String msg) throws IOException {
	 BufferedWriter w=new BufferedWriter(new FileWriter(file,true));
		 w.write(msg);
		 w.newLine();
		 w.close();  
 }
 public void getOrder(CustomerOrders ord,String  itemid) throws IOException {
	 if(menucard.containsKey(itemid)) {
		 orders.put(itemid, ord);
		 String m="id ==>> "+itemid+" order id ==>> "+ord.getOrderId()
		 +"order quantity ==>> "+ord.getQuantity()+"order pricee bill ==>> "+ord.getTotalPrice();
		 writeFile(m);
		 System.out.println("Order is confurmed..");
	 }else {
		 System.out.println("item not avaliable now..");
	 }
 }
 
 public void displayOrderdetails() {
	 for(CustomerOrders o:orders.values()) {
		 System.out.println("order id "+o.getOrderId());
		 System.out.println("order quantity"+o.getQuantity());
	 }
 }
 
}

