package project.by.stormnet.functional.entities.helpers.onliner_helpers;

import project.by.stormnet.functional.entities.helpers.AbstractHelper;
import project.by.stormnet.functional.entities.pages.onliner.FilterPage;
import project.by.stormnet.functional.entities.pages.onliner.NotebPage;

public class FilterPageHelper extends AbstractHelper {
    private FilterPage filterPage = new FilterPage();

    public NotebPage clickLaptop(){
        filterPage.clicklLaptopButton();
        return new NotebPage();
    }
}