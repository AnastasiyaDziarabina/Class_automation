package project.by.stormnet.functional.entities.helpers.lamoda_helpers;

import project.by.stormnet.functional.entities.helpers.AbstractHelper;
import project.by.stormnet.functional.entities.helpers.SearchHelper;
import project.by.stormnet.functional.entities.pages.HomePage;

public class HomeHelperLamoda extends AbstractHelper {
    private HomePage homePage = new HomePage();

    public HomeHelperLamoda navigateToHomePage(){
        System.out.println("Navigate to 'Home' page");
        homePage.navigateToHomePage();
        return this;
    }

    public SearchHelper search(String searchKey){
        navigateToHomePage();

        homePage.fillSearchField(searchKey).clickSearchButton();
        return new SearchHelper();
    }
}
