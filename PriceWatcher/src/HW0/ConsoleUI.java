package HW0;

import java.awt.Desktop;
import java.net.*;
import java.text.*;
import java.util.*;

public class ConsoleUI {
	private Item item;
	private Scanner scnr = new Scanner(System.in);
	private String userRequest;
	private NumberFormat df = new DecimalFormat("#0.00");  
	
	public ConsoleUI(Item item) {
		this.item = item;
	}

	public void welcome() {
		System.out.println("Welcome to Price Watcher!");	
	}	   

	public void itemDetails(Item item) {
		System.out.println("------- ITEM DETAILS -------");
		System.out.println("Name:	" + item.getName());
		System.out.println("URL:	" + item.getURL());
		System.out.println("Price:	$" + df.format(item.getPrice()));
		System.out.println("Change:	" + df.format(item.getChange()) + "%");
		System.out.println("Added:	" + item.getDateAdded() + " (" + item.getPrice() + ") ");
	}

	public String promptUser() {
		System.out.println("Enter 1 (to check price), 2 (to view page), or -1 to quit.");
		userRequest = scnr.next();
		

		return userRequest;
	}

	public void launchWebBrowser(Item item) {
		try {
			Desktop desktop = java.awt.Desktop.getDesktop();
			URI itemURL = new URI(item.getURL());
			desktop.browse(itemURL);	
		} 
		
		catch (Exception e) {
			System.out.println("");
			System.out.println("############################################################################");
			System.out.println("ERROR LAUNCHING WEBSITE. Please try again. ");
			System.out.println("############################################################################");
			System.out.println("");
		}	
	}
}
