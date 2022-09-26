import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {
By buttonAccetto = By.xpath("//div[text()='Accetta tutto']");
    public void navigateGoogle(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.it/");
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(buttonAccetto));
        driver.findElement(buttonAccetto).click();
    }

    public static void main (String[]args){
        Test e = new Test();
        e.navigateGoogle();
    }
}
