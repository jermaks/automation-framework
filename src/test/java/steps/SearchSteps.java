package steps;

import pages.SearchPage;

public class SearchSteps {

    private SearchPage searchPage = new SearchPage();

    public SearchResultsSteps executeSearchByKeyword(String keyword) throws InterruptedException {
        searchPage.acceptAllCookies();
        searchPage.pasteToSearchField(keyword);
        searchPage.clickSearchButtonOrPressEnter();
        return new SearchResultsSteps();
    }

    public SearchSteps openTooltip() {
        searchPage.acceptAllCookies();
        searchPage.moveVoiceSearchButton();
        return this;
    }

    public SearchSteps verifyThatTooltipContainsProperText(String text) throws InterruptedException {
        searchPage.assertThatVoiceSearchTooltipContainsText(text);
        return this;
    }

}
