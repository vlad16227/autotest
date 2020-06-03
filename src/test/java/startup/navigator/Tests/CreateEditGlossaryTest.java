//package startup.navigator.Tests;
//
//import io.qameta.allure.Description;
//import org.junit.Test;
//import org.openqa.selenium.support.PageFactory;
//import startup.driverSettings.DriverSettings;
//import startup.navigator.Pages.NavigatorPage;
//import startup.navigator.Pages.RegistrationCreateOrgPage;
//
//public class CreateEditGlossaryTest extends DriverSettings {
//
//    @Test
//    @Description("Создание/Редактирование Глоссария")
//
//
//    public void createEditGlossaryTest() throws InterruptedException{
//        // перешли на стр.вход\рег
//        RegistrationCreateOrgPage registrationPage = PageFactory.initElements(driver, RegistrationCreateOrgPage.class);
//        // зашли. зарегались. создали оргу
//        registrationPage.open();
//        registrationPage.findTittle();
//        registrationPage.clickReg();
//        registrationPage.fillNewMail();
//        registrationPage.fillNewPassword();
//        registrationPage.clickSubmit();
//        // создали оргу
//        registrationPage.clickCreateOrganization();
//        registrationPage.fillNameOrganizationWindow();
//        registrationPage.fillAboutOrganizationWindow();
//        registrationPage.fillEmailOrganizationWindow();
//        registrationPage.clickSubmit();
//        registrationPage.findOrg();
//        // перешли на стр. навигатор
//        NavigatorPage navigatorPage = PageFactory.initElements(driver, NavigatorPage.class);
//        // создан глосс
//        navigatorPage.selectGlossary();
//        navigatorPage.createGlossaryClick(); //костыль
//        driver.navigate().refresh();        //костыль
//        navigatorPage.createGlossaryClick();
//        navigatorPage.fillNameGlos();
//        navigatorPage.selectFirstLeng();
//        navigatorPage.selectSecondLeng();
//        navigatorPage.clickSubmitGloss();
//        navigatorPage.iSeeGloss();
//        // отредактирован глосс
//        navigatorPage.openGloss();
//        navigatorPage.addTerminGloss();
//        navigatorPage.fillFirstTerminGloss();
//        navigatorPage.fillSecondTerminGloss();
//        navigatorPage.fillCommentGloss();
//        navigatorPage.clickSubmitTerminGloss();
//        navigatorPage.iSeeTerminGloss();
//        navigatorPage.editTerminGloss();
//        navigatorPage.editFillTerminGloss();
//        navigatorPage.clickSubmitEditTerminGloss();
//        navigatorPage.iSeeEditTerminGloss();
//        navigatorPage.deleteTerminGloss();
//        navigatorPage.deleteTerminWindowGloss();
//        navigatorPage.iDontSeeTerminGloss();
//        navigatorPage.addTerminGloss();
//        navigatorPage.fillFirstTerminGloss();
//        navigatorPage.fillSecondTerminGloss();
//        navigatorPage.fillCommentGloss();
//        navigatorPage.clickSubmitTerminGloss();
//        navigatorPage.iSeeTerminGloss();
//        // выход
//    }
//}
//
//
