package project.by.stormnet.functional.tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import project.by.stormnet.functional.entities.helpers.onliner_helpers.CatalogPageHelper;
import project.by.stormnet.functional.entities.helpers.onliner_helpers.FilterPageHelper;
import project.by.stormnet.functional.entities.helpers.onliner_helpers.HomePageHelper;
import project.by.stormnet.functional.entities.helpers.onliner_helpers.NotebPageHelper;

public class OnlinerTest {
    private HomePageHelper homePageHelper = new HomePageHelper();
    private CatalogPageHelper catalogPageHelper = new CatalogPageHelper();
    private FilterPageHelper filterPageHelper = new FilterPageHelper();
    private NotebPageHelper notebPageHelper = new NotebPageHelper();

    @Test
    public void checkAsusLaptop() throws InterruptedException {
        homePageHelper.navigateToHomePage();
        homePageHelper.clickButton();
        catalogPageHelper.clickMenuButton();
        filterPageHelper.clickLaptop();
        notebPageHelper.setFilter();
        int result = notebPageHelper.getSearchResultCountPerPage();
        Assert.assertTrue(result > 0, "No results were found");

    }

    @AfterClass
    public void tearDown(){
        notebPageHelper.quit();
    }
}