package pageobjects;

import org.openqa.selenium.By;

public class ProductDataObj {
    public By startDate = By.id("startdate");
    public By insurancesum = By.id("insurancesum");
    public By meritrating = By.id("meritrating");
    public By damageInsurance = By.id("damageinsurance");
    public By optionalProducts = By.cssSelector(".field:nth-child(5) .ideal-radiocheck-label:nth-child(1) > .ideal-check'");
    public By courtesycar  = By.id(("courtesycar"));

    public By next = By.id(("nextselectpriceoption"));
}
