package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ChoucairAcademyLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to login")
                                                .located(By.xpath("//div[@class='d-none d-lg-block']//strong[contains(text(),'Ingresar')]"));
    public static final Target INPUT_USER = Target.the("where we write the username")
                                                .located(By.name("username"));
    public static final Target INPUT_PASSWORD = Target.the("where we write the password")
                                                    .located(By.name("password"));
    public static final Target ACCESS_BUTTON = Target.the("button to login")
                                                .located(By.xpath("//button[contains(@class,'btn btn-primary')]"));
}
