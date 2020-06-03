package startup.navigator.Tests;

import io.qameta.allure.Description;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import startup.driverSettings.DriverSettings;
import startup.navigator.Pages.NavigatorPage;
import startup.navigator.Pages.RegistrationCreateOrgPage;
import startup.translate.Page.TranslatePage;

public class FullSmokeTest extends DriverSettings {

    @Test
    @Description("Полный Smoke Тест (Регистрация)(Создание всего трафика)(Редактирование)(Транслейт)")


    public void fullSmokeTest() throws InterruptedException{
        // перешли на стр.вход\рег
        RegistrationCreateOrgPage registrationPage = PageFactory.initElements(driver, RegistrationCreateOrgPage.class);
        // зашли. зарегались. создали оргу
        registrationPage.open();
        registrationPage.findTittle();
        registrationPage.clickReg();
        registrationPage.fillNewMail();
        registrationPage.fillNewPassword();
        registrationPage.clickSubmit();
        // создали оргу
        registrationPage.clickCreateOrganization();
        registrationPage.fillNameOrganizationWindow();
        registrationPage.fillAboutOrganizationWindow();
        registrationPage.fillEmailOrganizationWindow();
        registrationPage.clickSubmit();
        registrationPage.findOrg();
        // перешли на стр. навигатор
        NavigatorPage navigatorPage = PageFactory.initElements(driver, NavigatorPage.class);
        // создан проект
        navigatorPage.selectProject();
        navigatorPage.createProjectClick();  //костыль
        driver.navigate().refresh();        //костыль
        navigatorPage.createProjectClick();
        navigatorPage.fillNameProject();
        navigatorPage.fillLangOrig();
        navigatorPage.fillLangTarget();
        navigatorPage.clickSubmitProject();
        navigatorPage.iSeeProject();
         // создан глосс
        navigatorPage.selectGlossary();
        navigatorPage.createGlossaryClick(); //костыль
        driver.navigate().refresh();        //костыль
        navigatorPage.createGlossaryClick();
        navigatorPage.fillNameGlos();
        navigatorPage.selectFirstLeng();
        navigatorPage.selectSecondLeng();
        navigatorPage.clickSubmitGloss();
        navigatorPage.iSeeGloss();
        // отредактирован глосс
        navigatorPage.openGloss();
        navigatorPage.addTerminGloss();
        navigatorPage.fillFirstTerminGloss();
        navigatorPage.fillSecondTerminGloss();
        navigatorPage.fillCommentGloss();
        navigatorPage.clickSubmitTerminGloss();
        navigatorPage.iSeeTerminGloss();
        navigatorPage.editTerminGloss();
        navigatorPage.editFillTerminGloss();
        navigatorPage.clickSubmitEditTerminGloss();
        navigatorPage.iSeeEditTerminGloss();
        navigatorPage.deleteTerminGloss();
        navigatorPage.deleteTerminWindowGloss();
        navigatorPage.iDontSeeTerminGloss();
        navigatorPage.addTerminGloss();
        navigatorPage.fillFirstTerminGloss();
        navigatorPage.fillSecondTerminGloss();
        navigatorPage.fillCommentGloss();
        navigatorPage.clickSubmitTerminGloss();
        navigatorPage.iSeeTerminGloss();
        //  создан ТМ
        navigatorPage.selectTM();
        navigatorPage.createTMBaseClick();  //костыль
        driver.navigate().refresh();        //костыль
        navigatorPage.createTMBaseClick();
        navigatorPage.fillNameTM();
        navigatorPage.selectOrigLangTM();
        navigatorPage.selectFirstTargetLangTM();
        navigatorPage.selectSecondTargetLangTM();
        navigatorPage.clickSubmitTM();
        navigatorPage.iSeeTMBase();
        // создан Ключ МТ
        navigatorPage.selectKeyMT();
        navigatorPage.createKeyMTClick(); //костыль
        driver.navigate().refresh();        //костыль
        navigatorPage.createKeyMTClick();
        navigatorPage.selectMT();
        navigatorPage.fillAPIKey();
        navigatorPage.clickSubmitMT();
        navigatorPage.iSeeMT();
        // наполняем проект
        navigatorPage.selectProject();
        navigatorPage.openProject();
        navigatorPage.openLikeTranslate();
        navigatorPage.addGlossary();
        navigatorPage.addTM();
        navigatorPage.addМТ();
        navigatorPage.clickLikeTranslateSubmit();
        navigatorPage.iSeeAdds();
        // грузим файл. создаем ресурс. ходим в транслейт
        navigatorPage.clickDocForTranslate();
        navigatorPage.upLoadFileOrig();
        navigatorPage.iSeeFile();
        navigatorPage.createRes();
        navigatorPage.selectLengRes();
        navigatorPage.okGoRes();
        navigatorPage.clickRes();
        driver.navigate().refresh();        //костыль
        navigatorPage.clickRes();           //костыль
        navigatorPage.iSeeRes();
        navigatorPage.clickGoTranslate();
        // перешли на стр. транслейт
        TranslatePage translatePage = PageFactory.initElements(driver, TranslatePage.class);

//        translatePage.iSeeTranslate();
//        translatePage.openTools();
//        translatePage.allTranslate();
//        translatePage.iSeeFillTranslate();
//        translatePage.acceptTranslate1();
//        translatePage.acceptTranslate2();
//        translatePage.acceptTranslate3();








    }
}
