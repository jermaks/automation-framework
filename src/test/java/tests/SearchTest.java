package tests;

import org.testng.annotations.Test;

public class SearchTest extends BaseTest {

    @Test(dataProvider = "dataProvider")
    public void googleSearchTest(String text) throws InterruptedException {
        steps.executeSearchByKeyword(text)
                .verifyThatTopResultContainsCorrectText("Selenium")
                .verifyThatTopResultContainsProperAttributeText("LC20lb");
    }

    @Test
    public void verifySearchByVoiceTooltipOnGoogle() throws InterruptedException {
        steps.openTooltip()
                .verifyThatTooltipContainsProperText("Search by voice");
    }

}
