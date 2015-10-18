package talk.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@Column
	public int userId;

	@Column
	public String userName;

	@Column
	public String passwodr;

}
