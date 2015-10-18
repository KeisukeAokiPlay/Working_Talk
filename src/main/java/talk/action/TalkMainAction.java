package talk.action;

import org.seasar.struts.annotation.Execute;

public class TalkMainAction {

	@Execute(validator = false)
	public String index(){

		return "talkMain.jsp";

	}
}
