package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SearchCoursePage extends PageObject {
    public static  final Target BUTTON_UC = Target.the("Seleccionar la universidad Choucair")
                                            .located(By.id("certificaciones"));
    public static final Target INPUT_COURSE = Target.the("Buscar el curso")
                                                .located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("Dar click para buscar el curso")
                                            .located(By.xpath("//button[@class='btn btn-secondary']"));
    public static final Target SELECT_COURSE = Target.the("Dar click para ingresar al curso")
                                                .located(By.xpath("//a[contains(text(),'Bancolombia')]"));
    public static final Target NAME_COURSE = Target.the("Obtener el nombre del curso")
                                                .located(By.xpath("//a[contains(text(),'Bancolombia')]"));
}
