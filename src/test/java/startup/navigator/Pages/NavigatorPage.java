package startup.navigator.Pages;

import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;

public class NavigatorPage
 {

    WebDriver driver;


    public NavigatorPage(WebDriver driver){ this.driver = driver; }


    @Step("Переход на вкладку 'Проекты'")
    public void selectProject(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Проекты']/..")) )
                .click();
    }
    @Step("Переход на вкладку 'Глоссарий'")
    public void selectGlossary(){
        WebDriverWait wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Глоссарии']/..")) )
                .click();
    }

    @Step("Переход на вкладку 'ТМ Файлы'")
    public void selectTM(){
        WebDriverWait wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='TM Файлы']/..")) )
                .click();
    }
    @Step("Переход на вкладку 'МТ Ключи'")
    public void selectKeyMT(){
        WebDriverWait wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Ключи MT']/..")) )
                .click();
    }
     @Step("Создать проект Клик")
     public void createProjectClick() {
         WebDriverWait wait = new WebDriverWait(driver, 10);

         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/main/div/div/div[1]/div/div/div[1]/span")))
                 .click();
     }

     @Step("Ввод названия проекта")
     public void fillNameProject() throws InterruptedException {
         WebDriverWait wait = new WebDriverWait(driver, 10);


         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='name']")))
                 .sendKeys("Автотест. Проект.");
     }
     @Step("Добавление языка оригинала")
     public void fillLangOrig() throws InterruptedException {
         WebDriverWait wait = new WebDriverWait(driver, 10);
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"react-select-2-input\"]")))
                 .sendKeys("Английский");
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"react-select-2-input\"]")) )
                 .sendKeys(Keys.RETURN);
     }
     @Step("Добавление языка перевода")
     public void fillLangTarget() throws InterruptedException {
         WebDriverWait wait = new WebDriverWait(driver, 10);

         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"react-select-3-input\"]")))
                 .sendKeys("Русский");
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"react-select-3-input\"]")))
                 .sendKeys(Keys.RETURN);
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/form/div/div/div[5]/div")))
                 .click();
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/form/div/div/div[5]/div")))
                 .click();
     }
     @Step("Применить")
     public void clickSubmitProject() throws InterruptedException {
         WebDriverWait wait = new WebDriverWait(driver, 10);
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/form/button")))
                 .click();
     }
     @Step("Отображение созданного проекта")
     public void iSeeProject() throws InterruptedException {
         WebDriverWait wait = new WebDriverWait(driver, 10);
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Автотест. Проект.']/..")) );

     }
     @Step("Открыть проект")
     public void openProject() throws InterruptedException {
         WebDriverWait wait = new WebDriverWait(driver, 10);

         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Автотест. Проект.']/..")) )
                 .click();
     }
     @Step("Открыть вкладку 'Предпочтнеия перевода'")
     public void openLikeTranslate() throws InterruptedException {
         WebDriverWait wait = new WebDriverWait(driver, 10);

         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/main/div/div/div/div[2]/div[1]/a[3]")) )
                 .click();
     }
     @Step("Открыть вкладку 'Документы для перевода'")
     public void clickDocForTranslate() throws InterruptedException {
         WebDriverWait wait = new WebDriverWait(driver, 10);

         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/main/div/div/div/div[2]/div[1]/a[7]")) )
                 .click();
     }
     @Step("Загрузить файл")
     public void upLoadFileOrig() throws InterruptedException {

         Thread.sleep(3000);
         By fileInput = By.xpath("//*[@id=\"fileinput\"]");
         String filePath = "/Users/vlad/untitled123/src/main/resources/upload/test_en_en-ru.ru.txt";
         driver.findElement(fileInput).sendKeys(filePath);
     }
     @Step("Отображение загруженного файла")
     public void iSeeFile() throws InterruptedException {
         WebDriverWait wait = new WebDriverWait(driver, 10);

         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/main/div/div/div/div[2]/div[2]/div/div[2]/table/tbody/tr/td[1]/span")) );
     }
     @Step("Создать ресурс")
     public void createRes() throws InterruptedException {
         WebDriverWait wait = new WebDriverWait(driver, 10);

         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/main/div/div/div/div[2]/div[2]/div/div[2]/table/tbody/tr/td[1]/button[2]/span")) )
                 .click();
     }
     @Step("Выбор'Язык перевода'")
     public void selectLengRes() throws InterruptedException {
         WebDriverWait wait = new WebDriverWait(driver, 10);

         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/div/div[3]/div/div/div[2]/div")) )
                 .click();
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/div/div[3]/div/div[2]")) )
                 .click();
     }
     @Step("Клик 'ПРИМЕНИТЬ'")
     public void okGoRes() throws InterruptedException {
         WebDriverWait wait = new WebDriverWait(driver, 10);

         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/div/div[4]/button[1]")) )
                 .click();

     }
     @Step("Открыть вкладку 'Ресурсы'")
     public void clickRes() throws InterruptedException {
         WebDriverWait wait = new WebDriverWait(driver, 10);

         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/main/div/div/div/div[2]/div[1]/a[2]")) )
                 .click();
         Thread.sleep(5000);


     }
     @Step("Обнаружение созданного ресурса")
     public void iSeeRes() throws InterruptedException {
         WebDriverWait wait = new WebDriverWait(driver, 10);

         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/main/div/div/div/div[2]/div[2]/div/table/tbody/tr/td[1]")) );

     }
     @Step("Переход в 'Переводчик'")
     public void clickGoTranslate() throws InterruptedException {
         WebDriverWait wait = new WebDriverWait(driver, 10);

         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/main/div/div/div/div[2]/div[2]/div/table/tbody/tr/td[6]/a")) )
                 .click();
         Thread.sleep(6000);

     }
     @Step("Добавление Глоссария")
     public void addGlossary() throws InterruptedException {
         WebDriverWait wait = new WebDriverWait(driver, 10);

         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/main/div/div/div/div[2]/div[2]/form/div[2]/button")) )
                 .click();
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/main/div/div/div/div[2]/div[2]/form/div[2]/div[2]/div/div/div/div[2]/div")) )
                 .click();

         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/main/div/div/div/div[2]/div[2]/form/div[2]/div[2]/div/div/div[2]")) )
                 .click();

     }
     @Step("Добавление ТМ Файл")
     public void addTM() throws InterruptedException {
         WebDriverWait wait = new WebDriverWait(driver, 10);

         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/main/div/div/div/div[2]/div[2]/form/div[3]/button")) )
                 .click();
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/main/div/div/div/div[2]/div[2]/form/div[3]/div[4]/div/div[1]/div/div[2]/div")) )
                 .click();
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/main/div/div/div/div[2]/div[2]/form/div[3]/div[4]/div/div[1]/div[2]/div")) )
                 .click();
     }
     @Step("Добавление МТ Ключ")
     public void addМТ() throws InterruptedException {
         WebDriverWait wait = new WebDriverWait(driver, 10);


         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/main/div/div/div/div[2]/div[2]/form/div[5]/div[2]/div/div/div[1]")) )
                 .click();
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/main/div/div/div/div[2]/div[2]/form/div[5]/div[2]/div/div[2]")) )
                 .click();
     }
     @Step("Клик ПРИМЕНИТЬ")
     public void clickLikeTranslateSubmit() throws InterruptedException {
         WebDriverWait wait = new WebDriverWait(driver, 10);

         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/main/div/div/div/div[2]/div[2]/form/button")) )
                 .click();
     }
     @Step("Вкладка Инфо. Отображение Изменений")
     public void iSeeAdds() throws InterruptedException {
         WebDriverWait wait = new WebDriverWait(driver, 10);

         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/main/div/div/div/div[2]/div[1]/a[1]")) )
                 .click();
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/main/div/div/div/div[2]/div" +
                 "[2]/div/div/div[2]/div/div/div[1]/div/div[2]/div/a/div")) );
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/main/div/div/div/div[2]/div" +
                 "[2]/div/div/div[2]/div/div/div[2]/div/div[2]/div/a/div")) );
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/main/div/div/div/div[2]/div" +
                 "[2]/div/div/div[2]/div/div/div[5]/div/div[2]/div/a/div")) );

     }
     @Step("Создать глоссарий Клик")
     public void createGlossaryClick() {
         WebDriverWait wait = new WebDriverWait(driver, 10);

         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/main/div/div/div[1]/div/div/div[1]/span")))
                 .click();
     }
     @Step("Ввод Название глоссария")
     public void fillNameGlos() throws InterruptedException {
         WebDriverWait wait = new WebDriverWait(driver, 10);

         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='name']")))
                 .sendKeys("Автотест. Глоссарий.");
     }
     @Step("Выбор первого языка")
     public void selectFirstLeng() throws InterruptedException {
         WebDriverWait wait = new WebDriverWait(driver, 10);
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"react-select-2-input\"]")))
                 .sendKeys("Русский");
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"react-select-2-input\"]")))
                 .sendKeys(Keys.RETURN);
     }
     @Step("Выбор второго языка")
     public void selectSecondLeng() throws InterruptedException {
         WebDriverWait wait = new WebDriverWait(driver, 10);
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"react-select-2-input\"]")))
                 .sendKeys("Английский");
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"react-select-2-input\"]")))
                 .sendKeys(Keys.RETURN);
     }
     @Step("Клик ПРИМЕНИТЬ")
     public void clickSubmitGloss() throws InterruptedException {
         WebDriverWait wait = new WebDriverWait(driver, 10);
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/form/button")))
                 .click();
     }
     @Step("Обнаружение созданного глоссария")
     public void iSeeGloss() throws InterruptedException {
         WebDriverWait wait = new WebDriverWait(driver, 10);
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Автотест. Глоссарий.']/..")) );
     }
     @Step("переход в глоссарий")
     @Story("Редактирование Глоссария ")
     public void openGloss() throws InterruptedException {
         WebDriverWait wait = new WebDriverWait(driver, 10);
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Автотест. Глоссарий.']/..")) )
                 .click();
     }
     @Step("Добавление термина")
     @Story("Редактирование Глоссария ")

     public void addTerminGloss() throws InterruptedException {
         WebDriverWait wait = new WebDriverWait(driver, 10);
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/main/div/div/div/div[2]/div[1]/div[1]/button")) )
                 .click();
     }
     @Step("Ввод термина первый язык")
     @Story("Редактирование Глоссария ")

     public void fillFirstTerminGloss() throws InterruptedException {
         WebDriverWait wait = new WebDriverWait(driver, 10);
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/main/div/div/div/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div/input")) )
                 .sendKeys("autotest");

     }
     @Step("Ввод термина второй язык")
     @Story("Редактирование Глоссария ")

     public void fillSecondTerminGloss() throws InterruptedException {
         WebDriverWait wait = new WebDriverWait(driver, 10);
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/main/div/div/div/div[2]/div[1]/div[3]/div[2]/div[1]/div[2]/div/input")) )
                 .sendKeys("автотест");
     }
     @Step("Ввод комментарий")
     @Story("Редактирование Глоссария ")

     public void fillCommentGloss() throws InterruptedException {
         WebDriverWait wait = new WebDriverWait(driver, 10);
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/main/div/div/div/div[2]/div[1]/div[3]/div[2]/div[2]/form/textarea")) )
                 .sendKeys("Comment. autotest");
     }
     @Step("Клик Сохранить")
     @Story("Редактирование Глоссария ")

     public void clickSubmitTerminGloss() throws InterruptedException {
         WebDriverWait wait = new WebDriverWait(driver, 10);
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/main/div/div/div/div[2]/div[1]/div[3]/div[1]/button[1]")) )
                 .click();
     }
     @Step("Отображение добавленного термина")
     @Story("Редактирование Глоссария ")

     public void iSeeTerminGloss() throws InterruptedException {
         WebDriverWait wait = new WebDriverWait(driver, 10);
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='autotest']/..")) );
     }
     @Step("Редактирование термина. Переход")
     @Story("Редактирование Глоссария ")

     public void editTerminGloss() throws InterruptedException {
         WebDriverWait wait = new WebDriverWait(driver, 10);
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='autotest']/..")) )
                 .click();
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/main/div/div/div/div[2]/div[1]/div[3]/div/div[2]/div[1]/button[1]")) )
                 .click();

     }
     @Step("Редактирование термина. Ввод нового термина")
     @Story("Редактирование Глоссария ")

     public void editFillTerminGloss() throws InterruptedException {
         WebDriverWait wait = new WebDriverWait(driver, 10);
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/main/div/div/div/div[2]/div[1]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div/input")) )
                 .sendKeys("autotestEdit");
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/main/div/div/div/div[2]/div[1]/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/input")) )
                 .sendKeys("автотестИзменен");
     }
     @Step("Клик Сохранить. После редактирования")
     @Story("Редактирование Глоссария ")

     public void clickSubmitEditTerminGloss() throws InterruptedException {
         WebDriverWait wait = new WebDriverWait(driver, 10);
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/main/div/div/div/div[2]/div[1]/div[3]/div/div[2]/div[1]/button[1]")) )
                 .click();
     }
     @Step("Отображение отредактированного термина")
     @Story("Редактирование Глоссария ")

     public void iSeeEditTerminGloss() throws InterruptedException {
         WebDriverWait wait = new WebDriverWait(driver, 10);
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='autotestautotestEdit']/..")) );
     }
     @Step("Удаление добавленного термина")
     @Story("Редактирование Глоссария ")

     public void deleteTerminGloss() throws InterruptedException {
         WebDriverWait wait = new WebDriverWait(driver, 10);
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='autotestautotestEdit']/..")) )
                 .click();
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/main/div/div/div/div[2]/div[1]/div[3]/div/div[2]/div[1]/button[3]")) )
                 .click();
     }
     @Step("Удаление добавленного термина. Подтвердить")
     @Story("Редактирование Глоссария ")

     public void deleteTerminWindowGloss() throws InterruptedException {
         WebDriverWait wait = new WebDriverWait(driver, 10);
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div[2]/button[1]/span")) )
                 .click();
     }
     @Step("Отображение отсутствия термина")
     @Story("Редактирование Глоссария ")
     public void iDontSeeTerminGloss() throws InterruptedException {
         WebDriverWait wait = new WebDriverWait(driver, 10);
         wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[text()='autotestautotestEdit']/..")) );
     }
     @Step("Создать ТМ файл Клик")
     public void createTMBaseClick() {
         WebDriverWait wait = new WebDriverWait(driver, 10);

         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/main/div/div/div[1]/div/div/div[1]/span")))
                 .click();
     }
     @Step("Ввод название ТМ файла")
     public void fillNameTM() {
         WebDriverWait wait = new WebDriverWait(driver, 10);

         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='name']")))
                 .sendKeys("Автотест. ТМ Файл.");
     }
     @Step("Выбор языка оригинала")
     public void selectOrigLangTM() {
         WebDriverWait wait = new WebDriverWait(driver, 10);
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"react-select-2-input\"]")))
                 .sendKeys("Русский");
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"react-select-2-input\"]")))
                 .sendKeys(Keys.RETURN);
     }
     @Step("Выбор первого языка перевода")
     public void selectFirstTargetLangTM() {
         WebDriverWait wait = new WebDriverWait(driver, 10);
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"react-select-3-input\"]")))
                 .sendKeys("Русский");
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"react-select-3-input\"]")))
                 .sendKeys(Keys.RETURN);
     }
     @Step("Выбор второго языка перевода")
     public void selectSecondTargetLangTM() {
         WebDriverWait wait = new WebDriverWait(driver, 10);
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"react-select-3-input\"]")))
                 .sendKeys("Английский");
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"react-select-3-input\"]")))
                 .sendKeys(Keys.RETURN);
     }
     @Step("Клик ПРИМЕНИТЬ")
     public void clickSubmitTM() {
         WebDriverWait wait = new WebDriverWait(driver, 10);
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/form/button")))
                 .click();
     }
     @Step("Обнаружение созданного ТМ Файла")
     public void iSeeTMBase() {
         WebDriverWait wait = new WebDriverWait(driver, 10);
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Автотест. ТМ Файл.']/..")) );

     }
     @Step("Создать МТ Ключ Клик")
     public void createKeyMTClick() {
         WebDriverWait wait = new WebDriverWait(driver, 10);

         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/main/div/div/div[1]/div/div/div[1]/span")))
                 .click();
     }
     @Step("Выбор движка МТ")
     public void selectMT() {
         WebDriverWait wait = new WebDriverWait(driver, 10);

         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"react-select-2-input\"]")))
                 .sendKeys("Yandex Translate");
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"react-select-2-input\"]")))
                 .sendKeys(Keys.RETURN);
     }
     @Step("Ввод ключа API движка")
     public void fillAPIKey() {
         WebDriverWait wait = new WebDriverWait(driver, 10);
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/form/div/div/div[2]/div/div/input")))
                 .sendKeys("trnsl.1.1.20200512T125012Z.037067857d068b5a.9d2b096a0e011b293430c9f9032bf0ddeadb81f3");
     }
     @Step("Клик ПРИМЕНИТЬ")
     public void clickSubmitMT() {
         WebDriverWait wait = new WebDriverWait(driver, 10);
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/form/button")))
                 .click();
     }
     @Step("Обнаружение созданного движка МТ")
     public void iSeeMT() {
         WebDriverWait wait = new WebDriverWait(driver, 10);
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Yandex Translate']/..")) );

     }



}
