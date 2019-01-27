package Selenium;

public class BasePage
{
	private static BasePage instance = null; 
    protected static String url;
    
    public static BasePage getInstance() 
    { 
        if (instance == null) 
        	instance = new BasePage(); 
        return instance; 
    } 
    
    private BasePageElementMap Map() {
		// TODO Auto-generated method stub
		return new BasePageElementMap();
	}

	private BasePage()
    {
    }
}
