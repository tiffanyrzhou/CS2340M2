package edu.gatech.oad.antlab.person;
import java.lang.StringBuilder;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string 
 *
 * @author Michael Lin
 * @version 1.1
 */
public class Person2 { 
    /** Holds the persons real name */
    private String name;
	 	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
	 public Person2(String pname) {
	   name = pname;
	 }
	/**
	 * This method should take the string
	 * input and return its characters in
	 * random order.
	 * given "gtg123b" it should return
	 * something like "g3tb1g2".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
            ArrayList<Character> stringList = new ArrayList<Character>();
            for (char character : input.toCharArray()) {
                stringList.add(character);
            }
            Collections.shuffle(stringList);
            StringBuilder newString = new StringBuilder();
            for (char character : stringList) {
                newString.append(character);
            }
            return newString.toString();
        }
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}       
}
