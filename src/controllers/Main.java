package controllers;

import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import models.User;
import utils.FileLogger;
//import pim.log.FileLogger;

public class Main
{
	 public static void main(String[] args) throws IOException
	  {    
	    PacemakerAPI pacemakerAPI = new PacemakerAPI();

	    pacemakerAPI.createUser("Bart",  "Simpson", "bart@simpson.com",  "secret");
	    pacemakerAPI.createUser("Homer", "Simpson", "homer@simpson.com", "secret");
	    pacemakerAPI.createUser("Lisa",  "Simpson", "lisa@simpson.com",  "secret");

	    Collection<User> users = pacemakerAPI.getUsers();
	    System.out.println(users);
	  }
}
