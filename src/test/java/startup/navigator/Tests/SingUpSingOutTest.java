//package startup.navigator.Tests;
//
//import io.qameta.allure.Description;
//import org.junit.Test;
//import org.openqa.selenium.support.PageFactory;
//import startup.driverSettings.DriverSettings;
//import startup.navigator.Pages.SignUpPage;
//
//public class SingUpSingOutTest extends DriverSettings {
//
//    @Test
//    @Description("Вход в Аккаунт. Выбор Организации")
//
//
//    public void fullSmokeTest() throws InterruptedException {
//        SignUpPage signUpPage = PageFactory.initElements(driver, SignUpPage.class);
//        // Вход
//        signUpPage.open();
//        signUpPage.findTittle();
//        signUpPage.fillMail();
//        signUpPage.fillPassword();
//        signUpPage.clickSubmit();
//        // выбор орги
//        signUpPage.selectOrganization();
//    }
//}
