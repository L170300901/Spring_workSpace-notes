package net.javajigi.user.service;

import java.util.List;

import net.javajigi.user.ExistedUserException;
import net.javajigi.user.PasswordMismatchException;
import net.javajigi.user.UserNotFoundException;
import net.javajigi.user.dao.UserDAO;
import net.javajigi.user.model.User;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;

public class UserServiceProxy implements UserService {


	@Override
	public void setUserDAO(UserDAO userDAO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int addUser(User user) throws ExistedUserException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int removeUser(String userId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User findUser(String userId) throws UserNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List findUserList() {
		loggingAdvice.invoke(invocation);
		return null;
	}

	@Override
	public boolean login(String userId, String password)
			throws PasswordMismatchException, UserNotFoundException {
	    Object advice1 = container.getBean("loggingAdvice");
	    Object advice2 = container.getBean("dataAccessThrowsAdvice");
	 try{   
		 advice1.invoke(invocation);
	 }catch (Exception e){
		 if(advice2 instance of ThrowAdvice ){  advice2.     }
		 
	 } 
	}
		
		return false;
	}
	
	

}
