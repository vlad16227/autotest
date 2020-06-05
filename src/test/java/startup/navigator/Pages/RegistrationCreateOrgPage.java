package startup.navigator.Pages;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

public class RegistrationCreateOrgPage {

    WebDriver driver;



    public RegistrationCreateOrgPage(WebDriver driver){
        this.driver = driver;
    }

    @Description("Переход на страницу входа")
    @Step("Переход на страницу входа")

    public void open(){
        driver.get("https://stable-web.apps.marfa-dev.space/");
    }

    @Step("Обнаружение заголовка111")
    public void findTittle(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='ui header']")) );

    }

    @Step("Переход на страницу регистрации")
    public void clickReg(){
        driver.findElement(By.xpath(".//*[text()='зарегистрируйтесь']")).click();
    }

    @Step("Ввод РАНДОМ Емейл")
    public void fillNewMail(){
        Random random = new Random();
        int n = random.nextInt(111111) + 1;
        WebDriverWait wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#root > div.SignUp._Rfx0_._Rfx1_._Rfx2_._Rfx3_ > " +
                "div > form > div > div > div:nth-child(1) > div > div > input[type=text]"))).sendKeys("auto" + n + "@mail.com");

    }

    @Step("Ввод РАНДОМ пароль")
    public void fillNewPassword(){
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("099a17cde");

    }

    @Step("Клик ПРИМЕННИТЬ")
    public void clickSubmit(){
        driver.findElement(By.xpath("//button[@type='submit']")).click();

    }
    @Step("Создать организацию")
    public void clickCreateOrganization() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Создать организацию']/..")))
                .click();
    }
    @Step("Ввод Рандом Название")
    public void fillNameOrganizationWindow() {
        Random random = new Random();
        int n = random.nextInt(111111111) + 1;
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='ui tiny modal transition visible active']")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text']")))
                .sendKeys("Автотест. " + n);
    }
    @Step("Ввод Описание")
    public void fillAboutOrganizationWindow() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@name='description']")))
                .sendKeys("Описание тест. Тест.");
    }
    @Step("Ввод Рандом Емайл")
    public void fillEmailOrganizationWindow() {
        Random random = new Random();
        int n = random.nextInt(1111111111) + 1;
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='contact_email']")) )
                .sendKeys("auto" + n + "@mail.com");
    }

    @Step("Обнаружение Организации")
    public void findOrg(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='OrganizationMenu__trigger']")) );

    }



}
