package uk.co.automatictester.jwebfwk.page.objects;

/**
 * Created by Alex on 2017/3/12.
 */
import org.openqa.selenium.WebDriver;
import uk.co.automatictester.jwebfwk.framework.ParentPage;

public class MainPage extends ParentPage {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void clickTab(String tab) {
        click(tab);
    }

}