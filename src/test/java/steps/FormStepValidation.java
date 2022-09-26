package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.*;
import util.Utils;

import static java.lang.System.out;

public class FormStepValidation {
    VehicleDataObj vehicleDataObj = new VehicleDataObj();
    InsurantDataObj insurantDataObj = new InsurantDataObj();
    ProductDataObj productDataObj = new ProductDataObj();
    PriceOptionObj priceOptionObj = new PriceOptionObj();
    SendQuoteObj sendQuoteObj = new SendQuoteObj();
    Utils action = new Utils();

    @Given("^administrator user goes to login screen$")
    public void administrator_user_goes_to_login_screen() {
        action.start();
    }
    @Given("^fill out form Vehicle Data$")
    public void fill_out_form_Vehicle_Data(){
        out.println("PageObject => fill out form Vehicle Data");
        action.dropdown(vehicleDataObj.make,"Audi");
        action.dropdown(vehicleDataObj.model,"Scooter");
        action.fillformid(vehicleDataObj.cylinder,"200");
        action.fillformid(vehicleDataObj.enginePerformance,"500");
        action.fillformid(vehicleDataObj.dateofManufacture,"04/05/1990");
        action.dropdown(vehicleDataObj.nbrOfsts,"2");
        action.dropdown(vehicleDataObj.numberMotorCycle,"2");
        action.dropdown(vehicleDataObj.fuelType,"Gas");
        action.fillformid(vehicleDataObj.payLoad,"500");
        action.fillformid(vehicleDataObj.totalWeight,"1000");
        action.fillformid(vehicleDataObj.listPrice,"500");
        action.fillformid(vehicleDataObj.licensePlate,"500");
        action.fillformid(vehicleDataObj.licensePlate,"5000");
        action.fillformid(vehicleDataObj.annualMileage,"190");
        action.click(vehicleDataObj.next);
        action.sleep();
        }
    @Given("^fill out form Insurant Data$")
    public void fill_out_form_Insurant_Data(){
        out.println("PageObject => fill out form Vehicle Data");
        action.fillformid(insurantDataObj.firstName,"Brayan");
        action.fillformid(insurantDataObj.lastName,"James");
        action.fillformid(insurantDataObj.dob,"10/01/1992");
        action.dropdown(insurantDataObj.country,"United States");
        action.fillformid(insurantDataObj.Zipcode,"33015");
        action.fillformid(insurantDataObj.occupation,"Employee");
        action.dropdownvlue();
        action.click(insurantDataObj.next);
        action.sleep();
        }
    @Given("^fill out form Product Data$")
    public void fill_out_form_Product_Dat(){
        out.println("PageObject => fill out form Product Data");
        action.fillformid(productDataObj.startDate,"10/01/2025");
        action.dropdown(productDataObj.insurancesum,"5.000.000,00");
        action.dropdown(productDataObj.meritrating,"Bonus 2");
        action.dropdown(productDataObj.damageInsurance,"No Coverage");
        action.dropdownop();
        action.dropdown(productDataObj.courtesycar,"Yes");
        action.click(productDataObj.next);
        action.sleep();
    }
    @Given("^fill out form Price Option$")
    public void fill_out_form_Price_Option(){
        out.println("PageObject => fill out form Price Option");
        action.selectionPriceOption();
        action.sleep();
        action.click(PriceOptionObj.nextpo);

    }
    @Given("^fill out form Send Quote")
    public void fill_out_form_Send_Quote(){
        out.println("PageObject => fill out form Send Quote");
        action.fillformid(SendQuoteObj.email,("teter@testes.com"));
        action.fillformid(SendQuoteObj.phone,("3054154040"));
        action.fillformid(SendQuoteObj.username,("teterselenium"));
        action.fillformid(SendQuoteObj.password,("Testes@10"));
        action.fillformid(SendQuoteObj.confirmpassword,("Testes@10"));
        action.fillformid(SendQuoteObj.Comments,"Finalizando");
    }
    @When("^sends the completed form$")
    public void sends_the_completed_form(){
        out.println("PageObject => Final Button");
        action.click(sendQuoteObj.btnfinal);
        action.sleepfinal();
    }
    @Then("^a successful message appears$")
    public void a_successful_message_appears(){
        action.checkmessage();
        action.sleep();
    }
}
