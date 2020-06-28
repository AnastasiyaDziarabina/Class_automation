package project.by.stormnet.functional.entities.helpers.onliner_helpers;

import project.by.stormnet.functional.entities.helpers.AbstractHelper;
import project.by.stormnet.functional.entities.pages.onliner.NotebPage;

public class NotebPageHelper extends AbstractHelper {
    private NotebPage notebookPage = new NotebPage();

    public void setFilter() throws InterruptedException {
        notebookPage.clickAsusCheckbox();
        notebookPage.setMinPrice("500");
        notebookPage.setMaxPrice("1200");
        notebookPage.clickDateCheckbox();

    }

    public int getSearchResultCountPerPage(){
        return notebookPage.getResultsSizePerPage();
    }
}