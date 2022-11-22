package com.HBO.tasks;


import com.HBO.interactions.Wait;
import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static com.HBO.userinterfaces.HomePage.*;

public class SignIn implements Task {
    public static SignIn with(String user, String password) {
        return Tasks.instrumented(SignIn.class, user, password);
    }

  private String user;
    private String password;

    public SignIn(String user, String password) {
        this.user = user;
        this.password = password;
    }

    @SneakyThrows
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LOGIN_BTN),
                Enter.theValue(user).into(EMAIL_BOX),
                Enter.theValue(password).into(PASSWORD_BOX).thenHit(Keys.TAB),
                Click.on(LOGIN_BTN2),Wait.until(3),
                Click.on(AVATAR_BTN), Wait.until(3)
        );
    }
}
