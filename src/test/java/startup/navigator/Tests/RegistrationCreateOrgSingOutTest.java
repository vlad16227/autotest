//package startup.navigator.Tests;
//
//import io.qameta.allure.Description;
//import org.junit.Test;
//import org.openqa.selenium.support.PageFactory;
//import startup.driverSettings.DriverSettings;
//import startup.navigator.Pages.RegistrationCreateOrgPage;
//
//public class RegistrationCreateOrgSingOutTest extends DriverSettings {
//
//    @Test
//    @Description("Регистрация. Создание организации")
//
//
//    public void registationCreateOrgTest() throws InterruptedException {
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
//    }
//}
