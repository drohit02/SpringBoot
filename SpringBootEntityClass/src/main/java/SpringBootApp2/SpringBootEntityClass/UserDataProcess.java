package SpringBootApp2.SpringBootEntityClass;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserDataProcess {

	@RequestMapping("/process")
	public String processUser(UserData usr) {
		System.out.println(usr.getUsername()+" "+usr.getUseradd()+" "+usr.getUsercity());
		return "<h2>Data process</h2>";
	}
}
