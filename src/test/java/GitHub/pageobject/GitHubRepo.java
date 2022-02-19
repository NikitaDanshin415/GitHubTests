package GitHub.pageobject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class GitHubRepo {
    private final SelenideElement tabPanel = $("#repository-container-header nav > ul ");

    public GitHubRepo selectTabPanelElement(String text) {
        tabPanel
                .$(byText(text))
                .click();

        return this;
    }
}
