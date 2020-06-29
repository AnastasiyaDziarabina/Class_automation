package project.by.stormnet.functional.entities.pages.onliner;

import project.by.stormnet.functional.entities.pages.AbstractPage;

public class NotebPage extends AbstractPage {

    private static String laptopTitle = "//h1[@class='schema-header__title']";
    private  String asusCheckbox = "//label[@class='schema-filter__checkbox-item']/span[text()='ASUS'][1]";
    private  String minPrice = "//input[@placeholder='от']";
    private  String maxPrice = "//input[contains(@class,'schema-filter__number-input_price') and contains(@data-bind,'до')]";
    private  String date = "//label[@class='schema-filter__checkbox-item']/span[text()='2019']";
    private  String result = "//div[@class='schema-product__title']";



    public static NotebPage getNotebPage(){
        NotebPage notebPage = new NotebPage();
        waitForElementVisible(getElementBy(laptopTitle));
        return notebPage;

    }

    public NotebPage clickAsusCheckbox(){
        getElement(asusCheckbox).click();
        try {
            wait(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return getNotebPage();
    }

    public NotebPage setMinPrice(String min){
        getElement(minPrice).sendKeys(min);
        try {
            wait(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return getNotebPage();
    }
    public NotebPage setMaxPrice(String max){
        getElement(maxPrice).sendKeys(max);
        try {
            wait(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return getNotebPage();
    }

    public NotebPage clickDateCheckbox() throws InterruptedException {
        getElement(date).click();
        wait(300
        );
        return getNotebPage();
    }

    public int getResultsSizePerPage(){
        return getElements(result).size();
    }
}