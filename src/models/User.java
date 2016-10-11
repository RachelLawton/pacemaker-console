package models;

import static com.google.common.base.MoreObjects.toStringHelper;
import com.google.common.base.Objects;

import java.util.HashMap;
import java.util.Map;



public class User 
{
  static Long   counter = 0l;

  public Long   id;
  public String firstName;
  public String lastName;
  public String email;
  public String password;
  
	
  private Map<String, User> users = new HashMap<String, User>();
  public Map<Long, Activity> activities = new HashMap<>();
 
	
	public User()
	  {
	  }
	
	
	public User(String firstName, String lastName, String email, String password)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.id = counter++;
		
	}
	
	@Override
	public String toString()
	{
		 return toStringHelper(this).addValue(firstName)
                 .addValue(lastName)
                 .addValue(password)
                 .addValue(email)                               
                 .toString();
	}
	
	@Override 
	public int hashCode()
	{
		return Objects.hashCode(this.lastName, this.firstName, this.email, this.password);
	}
}
