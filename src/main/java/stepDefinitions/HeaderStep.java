package stepDefinitions;

import functionalLibrary.CommonFunctions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class HeaderStep extends CommonFunctions {
    @Given("I am on Home page")
    public void i_am_on_home_page() {
        driver.get("https://www.next.co.uk/");
    }

    @Then("I search an item")
    public void i_search_an_item() {
        driver.findElement(By.xpath("//input[@name='w']")).sendKeys("trouser",Keys.ENTER);
        driver.findElement(By.xpath("//a[@class='TitleText']")).click();
        driver.findElement(By.xpath("//div[@id='dk_container_Size-475-280']")).click();
        driver.findElement(By.xpath("//a[@class='dk_dropdown_option'   and @data-dk-dropdown-value='11']")).click();


    }

    @Then("I click on add to bag")
    public void i_click_on_add_to_bag() {

        driver.findElement(By.xpath("//a[@class='nxbtn primary btn-addtobag addToBagCTA add-to-bag Enabled']")).click();


    }

    @Then("I can see an item")
    public void i_can_see_an_item() {

        driver.findElement(By.xpath("//div[@class='Icon active']")).click();

    }

    @Then("I can see it")
    public void i_can_see_it() {


        driver.findElement(By.xpath("//div[@class='bagFooter']//a[@claSS='view_edit_bag']")).click();
    }

}



