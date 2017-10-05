/**
 * File Name: AppBasics.java<br>
 * TODO: ADD NAME HERE<br>
 * Java Boot Camp Exercise<br>
 *
 * Created: Oct 2, 2017
 */
package com.sqa.vt.helpers;

import java.util.*;

/**
 * AppBasics //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author  TODO: ADD NAME HERE
 * @version 1.0.0
 * @since 1.0
 */
public class AppBasics {

	private static Scanner scanner = new Scanner(System.in);

	/**
	 * @param name
	 * @param appName
	 */
	public static void farewellUser(String name, String appName) {
		System.out.println("Thank you " + name + ", for using the " + appName + " Application.\nHave a great Day!");
	}

	/**
	 * @param appName
	 * @return name
	 */
	public static String greetUserAndGetName(String appName) {
		System.out.println("Welcome to my " + appName + " Application");
		System.out.print("Could I get your name please? ");
		return scanner.nextLine();
	}
}
