package week2.day2;

public class Browser {

	public String launchBrowser (String Chrome) {
		System.out.println("Browser launched Successfully");
		return Chrome;
	}
	public void  loadUrl() {
		System.out.println("Application url loaded successfully");	}
	
	public static void main(String[] args) {
		Browser bw = new Browser();
		System.out.println(bw.launchBrowser("Edge"));
		bw.loadUrl();
		

	}

}
