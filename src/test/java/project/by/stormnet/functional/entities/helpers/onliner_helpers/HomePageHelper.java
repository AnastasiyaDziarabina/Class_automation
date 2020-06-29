package project.by.stormnet.functional.entities.helpers.onliner_helpers;

import project.by.stormnet.functional.entities.helpers.AbstractHelper;
import project.by.stormnet.functional.entities.pages.onliner.OnlinerCatalogPage;
import project.by.stormnet.functional.entities.pages.onliner.OnlinerHomePage;

public class HomePageHelper extends AbstractHelper {
    private OnlinerHomePage onlinerHomePage = new OnlinerHomePage();

    public HomePageHelper navigateToHomePage(){
        System.out.println("Navigate to 'Home' page");
        onlinerHomePage.navigateToOnlinerHomePage();
        return this;
    }

    public OnlinerCatalogPage clickButton(){
        onlinerHomePage.clickCatalogButton();
        return new OnlinerCatalogPage();
    }
}