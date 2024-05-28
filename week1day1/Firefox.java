package week1day1;

public class Firefox {
	
	public static void main(String[] args) {
		float browserVersion = 100.2f;
		String browserName = "firefox";
		boolean isVisible = true;
		int releaseYear = 1997;
		char browserLogo = 'f';
		System.out.println(browserVersion + "\n" + isVisible + "\n" + releaseYear+ "\n" + browserLogo);
		if (releaseYear==1998)
		{
			System.out.println("I am working fine");
		}
		else
		{
			System.out.println("Print else statement as " +browserName);
		}
	}

}
