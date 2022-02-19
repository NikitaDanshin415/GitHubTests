package GitHub.pageobject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class GitHubWiki extends GitHubRepo{

    private final SelenideElement findPageInput = $("[placeholder='Find a Page…']");
    private final SelenideElement listOfFoundPages =  $("[data-filterable-for=wiki-pages-filter]");


    public GitHubWiki findPage(String text){
        findPageInput
                .setValue(text);

        return this;
    }

    public GitHubWiki pageIsFound(String text){
        listOfFoundPages
                .$(byText("SoftAssertions"))
                .should(Condition.appear);

        return this;
    }

    public GitHubWiki openPage(String text){
        listOfFoundPages
                .$(byText("SoftAssertions"))
                .click();

        return this;
    }
}
