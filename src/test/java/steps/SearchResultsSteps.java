package steps;

import pages.SearchResultPage;

public class SearchResultsSteps {

    private SearchResultPage searchResultPage = new SearchResultPage();

    public SearchResultsSteps verifyThatTopResultContainsCorrectText(String text) {
        searchResultPage.asserThatTopResultContainsCorrectText(text);
        return this;
    }

    public SearchResultsSteps verifyThatTopResultContainsProperAttributeText(String text) {
        searchResultPage.asserThatTopResultContainsProperAttributeText(text);
        return this;
    }

}
