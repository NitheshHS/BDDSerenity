package test;

import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    @Managed(uniqueSession = true)
    WebDriver driver;
}
