/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package TestClass;

import com.mycompany.Login;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

/**
 *
 * @author USER
 */

 
public class LoginTest {

    // Test valid username
    @Test
    public void testCheckUsernameValid() {
          Login login = new Login("Au_bz", "@A2wweopttr","+27728638163");
    String username = "kyl_1";

    assertEquals  ("Username successfully captured.", login.checkUsername(username));
    }
    
 @Test
  public void testUsernameIncorrectlyFormatted() {

        String username = "kyle!!!!!!";

        assertEquals("Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.",checkUsername(username));
    }
  @Test
    public void testPasswordCorrectlyFormatted() {

        String password = "Ch&sec@ke99!";

        assertEquals(
            "Password successfully captured.",
            checkPassword(password)
        );
    }

    @Test
    public void testPasswordIncorrectlyFormatted() {

        String password = "password";

        assertEquals(
            "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.",
            checkPassword(password)
        );
    }


    
    @Test
    public void testCellPhoneCorrectlyFormatted() {

        String cellPhone = "+27838969876";

        assertEquals(
            "Cell number successfully captured.",
            checkCellPhone(cellPhone)
        );
    }

    @Test
    public void testCellPhoneIncorrectlyFormatted() {

        String cellPhone = "08966553";

        assertEquals(
            "Cell number is incorrectly formatted or does not contain an international code; please correct the number and try again.",
            checkCellPhone(cellPhone)
        );
    }


    

    @Test
    public void testLoginSuccessful() {

        assertTrue(loginUser());
    }

    @Test
    public void testLoginFailed() {

        assertFalse(loginUser());
    }

    @Test
    public void testUsernameIsCorrectlyFormatted() {

        String username = "kyl_1";

        assertTrue(checkUsernameBoolean(username));
    }
}
 
    
    
    
    
    
    
