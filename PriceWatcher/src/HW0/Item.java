package HW0;

public class Item {
	private String name = "";
	private String link = "";
	private Double price = 0.0;
	private Double change = 0.0;
	private String dateAdded = "";
	
	public Item(String link) {
		//Gather information from the URL link
		this.name = "LED Monitor";
		this.link = link;
		this.price = 61.13;
		this.dateAdded = "08/25/2018";
	}

	public String getURL() {
		return this.link;
	}
	public String getName() {
		return this.name;
	}
	public Double getPrice() {
		return this.price;
	}
	public Double getChange() {
		return calculateChange();
	}
	public String getDateAdded() {
		return this.dateAdded;
	}

	public Double findPrice() {
		//get the item's price information using this.link
		//this.price = informationFromURL
		return this.price;
	}
	
	public Double calculateChange() {
		Double originalPrice = this.price;
		Double updatedPrice = findPrice();
		
		this.change = ((updatedPrice * 100)/originalPrice)-	100;
		
		return this.change;	
	}
}
