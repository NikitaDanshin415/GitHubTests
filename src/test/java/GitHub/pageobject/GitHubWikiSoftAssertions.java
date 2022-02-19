package GitHub.pageobject;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class GitHubWikiSoftAssertions extends GitHubRepo{
    public GitHubWikiSoftAssertions pageContainsText(String text){
        $(byText("Using JUnit5 extend test class:"))
                .should(Condition.exist);

        return this;
    }
}
