package co.com.choucair.testing.pruebatecnica.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

@DefaultUrl("https://www.utest.com/")
public class UtestPage extends PageObject {
    public static final Target JOIN_BUTTON = Target.the("Button that open form to register").located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));
    public static final Target INPUT_FIRST_NAME = Target.the("Input firstname").located(By.id("firstName"));
    public static final Target  INPUT_LAST_NAME= Target.the("Input lastname").located(By.id("lastName"));
    public static final Target  INPUT_EMAIL = Target.the("Input email").located(By.id("email"));
    public static final Target SELECT_MONTH = Target.the("SELECT_MONTH").located(By.xpath("//*[@id=\"birthMonth\"]"));
    public static final Target SELECT_DAY  = Target.the("SELECT_DAY").located(By.xpath("//*[@id=\"birthDay\"]"));
    public static final Target SELECT_YEAR  = Target.the("SELECT_YEAR ").located(By.xpath("//*[@id=\"birthYear\"]"));

    public static final Target CITY  = Target.the("CODE_POSTAL ").located(By.xpath("//*[@id=\"city\"]"));

    public static final Target PROVINCE  = Target.the("CODE_POSTAL ").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[2]/div[2]/div/div[1]/span"));

    public static final Target CODE_POSTAL  = Target.the("CODE_POSTAL ").located(By.xpath("//*[@id=\"zip\"]"));

    public static final Target COUNTRY  = Target.the("CODE_POSTAL ").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span"));
    public static final Target NEXT_BUTTON  = Target.the("NEXT_BUTTON").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));


}
