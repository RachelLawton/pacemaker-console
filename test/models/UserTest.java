package models;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class UserTest
{
  User homer = new User ("homer", "simpson", "homer@simpson.com",  "secret");
  
  
  private Map<String, User> users = new HashMap<String, User>();
  
  @Test
  public void testCreate()
  {
    assertEquals ("homer",               homer.firstName);
    assertEquals ("simpson",             homer.lastName);
    assertEquals ("homer@simpson.com",   homer.email);   
    assertEquals ("secret",              homer.password);   
  }

  @Test
  public void testIds()
  {
    Set<Long> ids = new HashSet<>();
    for (User user : users.values())
    {
      ids.add(user.id);
    }
    assertEquals (users.size(), ids.size());
  }

 @Test
  public void testToString()
  {
	  assertEquals ("User{" + homer.id + ", homer, simpson, secret, homer@simpson.com}", homer.toString());
  }
}
