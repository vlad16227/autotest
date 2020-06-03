package startup.translate.Page;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TranslatePage {

    WebDriver driver;


    public TranslatePage(WebDriver driver){ this.driver = driver; }


    @Step("Обнаружение страницы Транслейта")
    public void iSeeTranslate(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div[1]/div[1]/div[1]/div[1]/div[1]")) );
    }
    @Step("Открыть вкладку Инструменты")
    public void openTools(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Инструменты']")) )
                .click();                                                    //*[@id="root"]/div/div[1]/div[1]/div[1]/div[2]/div/div/div[3]/div[1]
    }
    @Step("Предперевод")
    public void allTranslate(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div[1]/div[1]/div[1]/div[2]/div/div/div[3]/div[2]/div[1]/span[2]")) )
                .click();
    }
    @Step("Обнаружение Перевода")
    public void iSeeFillTranslate(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"1\"]/div[3]/div/div/div/div/div/div/span/span")) );
    }
    @Step("Подтвердить перевод 1 сегмент")
    public void acceptTranslate1(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"1\"]/div[4]/div/div[1]/svg/path")) )
                .click();
    }
    @Step("Подтвердить перевод 2 сегмент")
    public void acceptTranslate2(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"2\"]/div[4]/div/div[1]/svg/path")) )
                .click();
    }
    @Step("Подтвердить перевод 3 сегмент")
    public void acceptTranslate3(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"3\"]/div[4]/div/div[1]/svg/path")) )
                .click();
    }

}
