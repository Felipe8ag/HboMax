package com.HBO.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage extends PageObject {

    public static final Target LOGIN_BTN = Target.the("Login Button").locatedBy("//a[@aria-label='Iniciar sesión']");
    public static final Target EMAIL_BOX = Target.the("Email Box").locatedBy("//*[@id='EmailTextInput']");
    public static final Target PASSWORD_BOX = Target.the("Password Box").locatedBy("//*[@id='PasswordTextInput']");
    public static final Target LOGIN_BTN2 = Target.the("Login Button").locatedBy("//div[@aria-label='Iniciar sesión']");
    public static final Target LOGIN_BTN3 = Target.the("Login Button").locatedBy("/html/body/div[1]/div[1]/div/div[3]/div[2]/div/div/div[1]/div[5]/div[2]/div[2]/div/div/div/div[1]/div/div/div/div[2]/div[1]/div[4]/div[1]");

    public static final Target AVATAR_BTN = Target.the("Avatar Button").locatedBy("//*[contains(text(),'Colombia QA')]");


}
