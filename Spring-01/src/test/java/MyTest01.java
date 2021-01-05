import org.junit.Test;
import xiaojie.cool.UserService;
import xiaojie.cool.UserServiceImpl;

public class MyTest01 {

    @Test
    public void test(){
        UserService service = new UserServiceImpl();
        service.getUser();
    }

}
