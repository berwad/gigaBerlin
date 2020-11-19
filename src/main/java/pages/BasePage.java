package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


public class BasePage {

    public BasePage() {
    }


    public void sendKeysToElement(By searchField, String searchText){
        $(searchField).setValue(searchText);
    }


    public void clickElement(By searchBtn){
        $(searchBtn).click();
    }

}
