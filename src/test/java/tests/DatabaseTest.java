package tests;

import database.DatabaseHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DatabaseTest {

    @Test
    public void verifyUserExistsInDatabase() {

        String actualUsername =
                DatabaseHelper.getUsername("superadmin");
        System.out.println("Retrieved User: " + actualUsername);

        Assert.assertNotNull(actualUsername,
                "User was not found in the database.");

        Assert.assertEquals(actualUsername,
                "superadmin",
                "Username does not match.");
    }
}
