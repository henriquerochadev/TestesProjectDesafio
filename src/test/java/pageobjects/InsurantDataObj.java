package pageobjects;

import util.Utils;
import org.openqa.selenium.By;
public class InsurantDataObj {
    Utils utils = new Utils();
    public By firstName = By.id("firstname");
    public By lastName = By.id("lastname");
    public By dob = By.id("birthdate");
    public By country = By.id("country");
    public By Zipcode = By.id("zipcode");
    public By occupation = By.id("occupation");
    public By next = By.id("nextenterproductdata");


}
