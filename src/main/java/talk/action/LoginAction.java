package talk.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import talk.form.LoginForm;
import talk.logic.LoginLogic;

public class LoginAction {

	@ActionForm
	@Resource
	protected LoginForm loginForm;

	@Resource
	protected LoginLogic loginLogic;

    @Execute(validator = false)
	public String index() {
        return "login.jsp";
	}

    @Execute(validator = false)
    public String login(){

//    	LoginLogic loginLogic = new LoginLogic();

    	String path = loginLogic.checkLogin();

    	return path;
    }

}
