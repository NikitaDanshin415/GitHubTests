import org.junit.jupiter.api.Test;
import GitHub.pageobject.GitHubRepo;
import GitHub.pageobject.GitHubWiki;
import GitHub.pageobject.GitHubWikiSoftAssertions;
import GitHub.utils.BaseTest;

import static com.codeborne.selenide.Selenide.*;

public class GitHubTests extends BaseTest {

    GitHubRepo gitHubRepo = new GitHubRepo();
    GitHubWiki gitHubWiki = new GitHubWiki();
    GitHubWikiSoftAssertions gitHubWikiSoftAssertions = new GitHubWikiSoftAssertions();
    String item = "SoftAssertions";

    @Test
    public void findSelenideSoftAssertJunit5() {
        open("/selenide/selenide");

        gitHubRepo
                .selectTabPanelElement("Wiki");

        gitHubWiki
                .findPage(item)
                .pageIsFound(item)
                .openPage(item);

        gitHubWikiSoftAssertions
                .pageContainsText("Using JUnit5 extend test class:");
    }
}
