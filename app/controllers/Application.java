package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result startpage() 
    {
        return ok(index.render("Your new application is ready....Haha"));
    }

    public static Result freeMemory() {
    	return ok(index.render("lorem ipsum"));
    }
    
    public static Result startsida(String id)
    {
    	return ok(index.render(id));
    }
}
