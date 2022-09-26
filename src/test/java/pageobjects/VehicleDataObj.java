package pageobjects;

import org.openqa.selenium.By;
import util.Utils;
public class VehicleDataObj {
    Utils utils = new Utils();
    public By make = By.id("make");
    public By model = By.id("model");
    public By cylinder = By.id("cylindercapacity");
    public By enginePerformance = By.id("engineperformance");
    public By dateofManufacture = By.id("dateofmanufacture");
    public By nbrOfsts = By.id(("numberofseats"));
    public By numberMotorCycle= By.id(("numberofseatsmotorcycle"));
    public By fuelType = By.id("fuel");
    public By payLoad = By.id(("payload"));
    public By totalWeight = By.id("totalweight");
    public By listPrice = By.id(("listprice"));
    public By licensePlate = By.id(("licenseplatenumber"));
    public By annualMileage = By.id("annualmileage");

    public By next = By.id("nextenterinsurantdata");

}