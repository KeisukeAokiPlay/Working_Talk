package talk.service;

import javax.annotation.Resource;

import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.extension.jdbc.service.S2AbstractService;

import talk.entity.User;

public class LoginService extends S2AbstractService<User> {

	@Resource
	protected JdbcManager jdbcManager;

	public User loginUser(String userName, String password){

		User userInfo = jdbcManager.from(User.class)
				.where("userName = ? And password = ?", userName, password )
				.getSingleResult();

		return userInfo;

	}

}
