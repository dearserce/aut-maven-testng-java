
        import io.github.bonigarcia.wdm.WebDriverManager;
        import io.github.bonigarcia.wdm.config.DriverManagerType;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.chrome.ChromeOptions;
        import org.testng.annotations.Test;

public class main {

    @Test
    public void testBrowser() {
        WebDriverManager.getInstance(DriverManagerType.CHROME).setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("enable-automation");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-browser-side-navigation");
        options.addArguments("--disable-gpu");
        driver = new ChromeDriver(options);
        driver.get("https://www.google.com/");
    }
}