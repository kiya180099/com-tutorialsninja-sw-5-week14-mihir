package resources.testdata;

import org.testng.annotations.DataProvider;

/**
 * Created by Mihir 
 */
public class TestData {

    @DataProvider(name = "desktopData")
    public Object[][] getBuildComData(){
        Object[][] data = new Object[][]{
                {"HTC Touch HD","1","Success: You have added HTC Touch HD to your shopping cart","HTC Touch HD","Product 1","£74.73"},
                {"iPhone","2","Success: You have added iPhone to your shopping cart!","product 11","£150.92"},
                {"Palm Treo Pro","3","Success: You have added Palm Treo Pro to your shopping cart!","Palm Treo Pro","£1,242.11"}

        };
        return data;
    }

}
