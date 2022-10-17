package co.com.choucair.testing.pruebatecnica.tasks;

//import co.com.choucair.certification.proyectobase.userinterface.ChoucairAcademyPage;
import co.com.choucair.testing.pruebatecnica.userinterface.UtestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {
    private UtestPage utestPageage;
    public static OpenUp thePage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(utestPageage));
    }
}