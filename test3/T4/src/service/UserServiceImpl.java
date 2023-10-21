package service;
import org.springframework.stereotype.Service;
import pojo.UserForm;
//注解为一个服务
@Service
public class UserServiceImpl implements UserService{
	@Override
	public boolean login(UserForm user) {
		if("xgs".equals(user.getUname()) 
				&& "123".equals(user.getUpass()))
			return true;
		return false;
	}
	@Override
	public boolean register(UserForm user) {
		if("xgs".equals(user.getUname()) 
				&& "123".equals(user.getUpass()))
			return true;
		return false;
	}
}

