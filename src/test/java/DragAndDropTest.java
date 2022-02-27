import dragAndDrop.utils.BaseTest;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class DragAndDropTest extends BaseTest {

    @Test
    public void checkDragAndDrop() {
        SelenideElement columnA = $("#column-a header");
        SelenideElement columnB = $("#column-b header");

        open("/drag_and_drop");

        columnA.shouldHave(Condition.text("A"));
        columnB.shouldHave(Condition.text("B"));

        columnA
                .dragAndDropTo($("#column-b header"))
                .shouldHave(Condition.text("B"));

        columnB.shouldHave(Condition.text("A"));
    }
}
