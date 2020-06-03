package startup.navigator.Pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPage {

    WebDriver driver;

    public SignUpPage(WebDriver driver){
        this.driver = driver;
    }
    @Step("Переход на сайт навигатора")
    public void open(){

        driver.get("https://marfa-web.apps.marfa-dev.space/nav/sign-in?next=/");
    }
    @Step("Обнаружение заголовка")
    public void findTittle(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='ui header']")) );

    }
    @Step("Ввод Емейл")
    public void fillMail(){
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("autotestselect@gmail.com");
    }
    @Step("Ввод пароль")
    public void fillPassword(){
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123123123qwe");

    }

    @Step("Клик (ПРИМЕНИТЬ)")
    public void clickSubmit(){
        driver.findElement(By.xpath("//button[@type='submit']")).click();

    }
    @Step("Выбор организации")
    public void selectOrganization(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='ui borderless AppBar menu']")) );
        driver.findElement(By.xpath(".//*[text()='Автотест']/..")).click();


    }



}
