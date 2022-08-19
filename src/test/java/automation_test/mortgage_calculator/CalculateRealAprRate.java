package automation_test.mortgage_calculator;

import automation_test.BaseUIClass;
import data.DataStore;
import org.testng.annotations.Test;
import page_objects.Home;

public class CalculateRealAprRate extends BaseUIClass {

       @Test(dataProvider = "RealAPRRates",dataProviderClass = DataStore.class)
    public void calculateRealApr(String homePrice,String downPayment,String interestRates,String expectedApr){
        new Home(driver)
                .mouseHoverToRates()
                .navigateToRealApr()
                .waitForPageToLoad()
                .typeHomePrice(homePrice)
                .selectDownPaymentInDollar()
                .typeDownPayment(downPayment)
                .typeInterestRate(interestRates)
                .clickOnCalculateButton()
                .validateRealAprRate(expectedApr);
       }
}
