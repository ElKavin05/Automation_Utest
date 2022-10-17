package co.com.choucair.testing.pruebatecnica.tasks;

import co.com.choucair.testing.pruebatecnica.userinterface.UtestPage;
import net.serenitybdd.core.pages.FluentDropdownSelect;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;


public class Register implements Task {
    public static Register onThePage() {
        return Tasks.instrumented(Register.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(UtestPage.JOIN_BUTTON),
                Enter.theValue("Kevin").into(UtestPage.INPUT_FIRST_NAME),
                Enter.theValue("Rengifo").into(UtestPage.INPUT_LAST_NAME),
                Enter.theValue("kavinrc98@gmail.com").into(UtestPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText("May").from(UtestPage.SELECT_MONTH),
                SelectFromOptions.byVisibleText("5").from(UtestPage.SELECT_DAY),
                SelectFromOptions.byVisibleText("1998").from(UtestPage.SELECT_YEAR),
                Click.on(UtestPage.NEXT_BUTTON),
                //SelectFromOptions.byVisibleText("Panama City").from(UtestPage.CITY),
                Enter.theValue("Panama City").into(UtestPage.CITY),
                Enter.theValue("+507").into(UtestPage.CODE_POSTAL)
                //SelectFromOptions.byVisibleText("Panama").from(UtestPage.COUNTRY)
                //Click.on(UtestPage.COUNTRY),
                //************WIP********************



        );

    }

}
