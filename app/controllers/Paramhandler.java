package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Paramhandler extends Controller {

   /* public static void getparam(List<String> params) {
    	for(String i : params)
    		System.out.println(i);
    		}
     */
	public static void getparam() {
	    System.out.println("Email to someone data is got as follows:");
	    System.out.println("Name is: " +params.get("name"));
	    System.out.println("Email id is:"+params.get("mail"));
	    System.out.println("Comment entered is:"+params.get("comment"));
	}
    
}