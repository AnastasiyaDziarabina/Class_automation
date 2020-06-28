package project.by.stormnet.functional.entities.helpers.lamoda_helpers;

import project.by.stormnet.functional.entities.helpers.AbstractHelper;
import project.by.stormnet.functional.entities.pages.SearchPage;

public class SearchHelperLamoda extends AbstractHelper {
    private SearchPage searchPage = new SearchPage();

    public int getSearchResultCountPerPage(){
        return searchPage.getResultsSizePerPage();
    }

    public int getAllResultsCount(){
        return Integer.parseInt(searchPage.getResultsCount().split(" ")[0]);
    }
}