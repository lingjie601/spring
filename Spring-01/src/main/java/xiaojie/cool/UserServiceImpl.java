package xiaojie.cool;

/**
 * @author Taylor
 */
public class UserServiceImpl implements UserService{
    private UserDao userDao = new UserDaoOracleImpl();

    public void getUser() {
        userDao.getUser();
    }
}
