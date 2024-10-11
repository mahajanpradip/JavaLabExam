
package service;
import entity.*;
import operation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import entity.MenuItem;
public class Application {
static int idd=100;
static int idddd=11;
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		Resturant rest=new Resturant();
		boolean App=true;
		while(App) {
			System.out.println("..Welcome to Restorent..");
			System.out.println("Enter your choice");
			System.out.println("1.for add item..");
			System.out.println("2.remove item");
			System.out.println("3.see menucard");
			System.out.println("4.order ");
			System.out.println("5. see order details..");
			System.out.println("0.Exit");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter item name...");
				   String name=sc.next();
					System.out.println("Enter Price  ..");
					int price=sc.nextInt();
					String id=""+ ++idd;
					MenuItem menu=new MenuItem(id, name, price);
					rest.OrderItem(menu);
				break;
			case 2:
				System.out.println("Enter name of item...");
				String name1=sc.next();
				rest.removeItem(name1);
				System.out.println("Item removed sucessfull...");
				rest.displaymenu();
				break;
			case 3:
				System.out.println("All menues.....");
				rest.displaymenu();
				break;
			case 4:
			      System.out.println("Enter item ID to order:");
                  String orderItemId = sc.next();
                  System.out.println("Enter quantity:");
                  String quantityy = sc.next();
                  System.out.println("Enter total price:");
                  int totalPrice = sc.nextInt();
                  CustomerOrders order = new CustomerOrders(orderItemId, quantityy, totalPrice);
                  rest.getOrder(order, orderItemId);
                  break;
			case 5:
				 rest.displayOrderdetails();
				 break;
			case 0:
				App=false;
				break;
			default :
				System.out.println("Invalid choice");
			}
		}
	}

}
