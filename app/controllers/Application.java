package controllers;

import passwordmeter.PasswordMeter;
import play.*;
import play.data.Form;
import play.libs.Json;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public Result index() {
        return ok(index.render());
    }

    public Result password() {
        String password = Form.form().bindFromRequest().get("password");
        return ok(new PasswordMeter(password).score() + "");
    }

}
