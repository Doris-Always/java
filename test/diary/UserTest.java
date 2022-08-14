package diary;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//ToDo collect username and password;
//ToDo collect and save the user thought;
//ToDo you can read previuos entry;
//ToDo delete what you have written;
public class UserTest {

    @Test
    public void checkUserName(){
        User user = new User();
        user.setUserName("Doris Ebele");
        Assertions.assertEquals("Doris Ebele",user.getUserName());
    }

    @Test
    public void checkUserPassword(){
        User user = new User();
        Assertions.assertEquals("123rdear",user.getPassword("123rdear"));
    }

    @Test
    public void checkUserId(){
        User user = new User();
        user.setUserId(1);
        Assertions.assertEquals(1,user.getUserId());
    }


    @Test
    public void checkUserEmail(){
        User user = new User();
        user.setUserEmail("www.somebody.com");
        Assertions.assertEquals("www.somebody.com",user.getUserEmail());
    }


}
