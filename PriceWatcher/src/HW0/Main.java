package HW0;

public class Main {
	
	public void run() {
		Item item = new Item("https://www.bestbuy.com/site/hp-20-7-led-fhd-monitor-black/5759501.p?skuId=5759501");
		ConsoleUI UI = new ConsoleUI(item);
		String userRequest = "0";
		
		UI.welcome();
		
		while(!userRequest.equals("-1")) {
			
			UI.itemDetails(item);
			userRequest = UI.promptUser();
			switch(userRequest) {
			case "1":
				System.out.println("Checking Price...");
				break;
			case "2":
				System.out.println("Redirecting to website...");
				UI.launchWebBrowser(item);
				break;
			case "-1":
				System.out.println("------- EXITING PRICE WATCHER. GOODBYE! -------");
				break;
			default:
				System.out.println("OPTION NOT AVAILABLE; Please try again.");
				break;
			}
		}
		
		System.exit(0);	
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}
