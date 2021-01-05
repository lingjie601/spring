import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xiaojie.cool.User;

public class MyTest04 {

        @Test
        public void testMethodAutowire() {
            ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
            User user = (User) context.getBean("user");
            user.getCat().shout();
            user.getDog().shout();
        }
    }

