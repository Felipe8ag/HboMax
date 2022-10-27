package com.HBO.userinterfaces;

import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;



public class PopUpPage  extends PageObject {

    public static final Target BTN_ACEPTAR = Target.the("Aceptar Button").locatedBy("//*[@aria-label='Aceptar']");

}
