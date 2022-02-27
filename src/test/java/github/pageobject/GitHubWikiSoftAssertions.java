package github.pageobject;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class GitHubWikiSoftAssertions extends GitHubRepo{
    public GitHubWikiSoftAssertions pageContainsText(String text){
        $(byText(text))
                .should(Condition.exist);

        return this;
    }
}
