/**
 * Represents one person receiving deferred action for childhood arrivals (DACA).
 * 
 * @author Muhammad COnn
 *
 * @version 1.2
 **/

/* UML CLASS DIAGRAM:
-----------------------------------------
					DACArecipient
-----------------------------------------
- surname : String
- givenName : String
- uscisNumber : String
- countryOfOrigin : String
- birthday : int
- validFromDate : int
- expirationDate : int
- sex : char
-----------------------------------------
+ getSurname() : String
+ getGivenName() : String
+ getUscisNumber() : String
+ getCountyOfOrigin() : String
+ getBirthDay() : int
+ getValidFromDate() : int
+ getExpirationDate() : int
+ getSex() : char
+ setSurname(surname : String) : void
+ setGivenName(givenName : String) : void
+ setUscisNumber(uscisNumber : String) : void
+ setCountryOfOrigin(countryOfOrigin : String) : void
+ setBirthday(birthday : int) : void
+ setValidFromDate(validFromDate : int) : void
+ setExpirationDate(expirationDate : int) : void
+ setSex(sex : char) : void
+ setAll(surname:String, givenName:String, uscisNumber:String, countryOfOrigin:String, birthday:int, validFromDate:int, expirationDate:int,sex:char) : void
+ toString() : String
+ equals(other : DACArecipient) : boolean
+ printCard() : void
+ jdnToDate(J : int) : String
+ DACArecipient() : DACArecipient
+ DACArecipient(surname : String, givenName : String, uscisNumber : String, countryOfOrigin : String, birthday : int, validFromDate : int, expirationDate: int, sex: char) : DACArecipient
-----------------------------------------
*/

public class DACArecipient
{
	/****** CONSTANTS ******/
	private static final String ASCII_ART_0 ="    .----.    .----.  ",
	ASCII_ART_1 = "   (  --  \\  /  --  )",
	ASCII_ART_2 = "          |  |        ",
	ASCII_ART_3 = "         _/  \\_      ",
	ASCII_ART_4 = "        (_    _)      ",
	ASCII_ART_5 = "     ,    `--`    ,   ",
	ASCII_ART_6 = "     \\'-.______.-'/  ",
	ASCII_ART_7 = "      \\          /   ",
	ASCII_ART_8 = "       '.--..--.'     ",
	ASCII_ART_9 = "         `\"\"\"\"\"` ",
	ASCII_CREDIT ="   ascii art by: jgs    ";
private static final String TITLE_USA = "UNITED STATES OF AMERICA",
			TITLE_EAC = "EMPLOYMENT AUTHORIZATION CARD";
private static final String LABEL_SURNAME = "Surname", 
			LABEL_GIVEN_NAME = "Given Name", LABEL_USCIS_NUM = "USCIS#",
			LABEL_BIRTH_COUNTRY = "Country of Birth",
			LABEL_BIRTH_DATE = "Date of Birth",
			LABEL_SEX = "Sex", LABEL_VALID_DATE = "Valid From:", LABEL_EXPIRE_DATE = "Card Expires:",
			LABEL_REENTRY_DISCLAIMER = "NOT VALID FOR REENTRY TO U.S.";

	/***** INSTANCE VARIABLES *****/
  private String surname;
  private String givenName;
  private String uscisNumber;
  private String countryOfOrigin;
  private int birthday, validFromDate, expirationDate;
  private char sex;
	

	
	/***** ACCESSORS *****/
	/**
	 * Returns the surname of the DACA recipient.
	 * @return the surname of the DACA recipient.
	 */
	public String getSurname()
	{
		return surname;
	}

	/**
	 * Returns the given name of the DACA recipient.
	 * @return the given name of the DACA recipient.
	 */
	public String getGivenName()
	{
		return givenName;
	}

	/**
	 * Returns the USCIS number of the DACA recipient.
	 * @return the USCIS number of the DACA recipient.
	 */
	public String getUscisNumber()
	{
		return uscisNumber;
	}

	/**
	 * Returns the country of origin of the DACA recipient.
	 * @return the country of origin of the DACA recipient.
	 */
	public String getCountryOfOrigin()
	{
		return countryOfOrigin;
	}

	/**
	 * Returns the birthday of the DACA recipient.
	 * @return the birthday of the DACA recipient.
	 */
	public int getBirthday()
	{
		return birthday;
	}

	/**
	 * Returns the valid from date of the DACA recipient.
	 * @return the valid from date of the DACA recipient.
	 */
	public int getValidFromDate()
	{
		return validFromDate;
	}

	/**
	 * Returns the expiration date of the DACA recipient.
	 * @return the expiration date of the DACA recipient.
	 */
	public int getExpirationDate()
	{
		return expirationDate;
	}

	/**
	 * Returns the sex of the DACA recipient.
	 * @return the sex of the DACA recipient.
	 */
	public char getSex()
	{
		return sex;
	}
	
	/***** MUTATORS *****/
	/**
	 * Sets the surname of the DACA recipient.
	 * @param surname the new surname of the DACA recipient.
	 */
	public void setSurname(String newSurname)
	{
		surname = newSurname;
	}

	/**
	 * Sets the given name of the DACA recipient.
	 * @param givenName the new given name of the DACA recipient.
	 */
	public void setGivenName(String newGivenName)
	{
		givenName = newGivenName;
	}

	/**
	 * Sets the USCIS number of the DACA recipient.
	 * @param uscisNumber the new USCIS number of the DACA recipient.
	 */
	public void setUscisNumber(String newUscisNumber)
	{
		uscisNumber = newUscisNumber;
	}

	/**
	 * Sets the country of origin of the DACA recipient.
	 * @param countryOfOrigin the new country of origin of the DACA recipient.
	 */
	public void setCountryOfOrigin(String newCountryOfOrigin)
	{
		countryOfOrigin = newCountryOfOrigin;
	}

	/**
	 * Sets the birthday of the DACA recipient.
	 * @param birthday the new birthday of the DACA recipient.
	 */
	public void setBirthday(int newBirthday)
	{
		birthday = newBirthday;
	}

	/**
	 * Sets the valid from date of the DACA recipient.
	 * @param validFromDate the new valid from date of the DACA recipient.
	 */
	public void setValidFromDate(int newValidFromDate)
	{
		validFromDate = newValidFromDate;
	}

	/**
	 * Sets the expiration date of the DACA recipient.
	 * @param expirationDate the new expiration date of the DACA recipient.
	 */
	public void setExpirationDate(int newExpirationDate)
	{
		expirationDate = newExpirationDate;
	}

	/**
	 * Sets the sex of the DACA recipient
	 * @param newSex
	 */
	public void setSex(char newSex)
	{
		sex = newSex;
	}
    
  /**DESCRIPTION: Assigns parameters to corresponding instance variables of calling DACArecipient. */
	public void setAll(String surname, String givenName, String uscisNumber, String countryOfOrigin, int birthday, int validFromDate, int expirationDate, char sex)
	{
		this.surname = surname;
		this.givenName = givenName;
		this.uscisNumber = uscisNumber;
		this.countryOfOrigin = countryOfOrigin;
		this.birthday = birthday;
		this.validFromDate = validFromDate;
		this.expirationDate = expirationDate;
		this.sex = sex;
	}
	
  /**** CONSTRUCTORS ****/
  /** 
   * DESCRIPTION: Default constructor for DACArecipient class. Initializes all instance variables to default values.
  */
  public DACArecipient()
  {
    surname = "Unknown";
    givenName = "Unknown";
    uscisNumber = "Unknown";
    countryOfOrigin = "Unknown";
    birthday = 2415021;
    validFromDate = 2415021;
    expirationDate = 2415021;
    sex = 'X';
  }

  public DACArecipient(String surname, String givenName, String uscisNumber, String countryOfOrigin, int birthday, int validFromDate, int expirationDate, char sex)
  {
    this.surname = surname;
    this.givenName = givenName;
    this.uscisNumber = uscisNumber;
    this.countryOfOrigin = countryOfOrigin;
    this.birthday = birthday;
    this.validFromDate = validFromDate;
    this.expirationDate = expirationDate;
    this.sex = sex;
  }

	/***** OTHER REQUIRED METHODS *****/
  	/** DESCRIPTION: Returns a string representation of the DACArecipient object.*/
	public String toString()
	{
		return "Surname:" + surname +
		"\nGiven Name: " + givenName +
		"\nUSCIS Number: " + uscisNumber +
		"\nCountry of Origin: " + countryOfOrigin +
		"\nBirthday: " + jdnToDate(birthday) +
		"\nValid From Date: " + jdnToDate(validFromDate) +
		"\nExpiration Date: " + jdnToDate(expirationDate) +
		"\nSex: " + sex;
	}

  /**
	 * DESCRIPTION: Checks if two DACArecipient objects are equal,
	 * @param other the other DACArecipient object to compare with.
	 * @return true if the two DACArecipient objects are equal, false otherwise.
	 */
	public boolean equals(DACArecipient other)
	{
		return this.surname.equals(other.surname) &&
		this.givenName.equals(other.givenName) &&
		this.uscisNumber.equals(other.uscisNumber) &&
		this.countryOfOrigin.equals(other.countryOfOrigin) &&
		this.birthday == other.birthday &&
		this.validFromDate == other.validFromDate &&
		this.expirationDate == other.expirationDate &&
		this.sex == other.sex;
	}

  /** DESCRIPTION: Prints to the console the Employment Authorization Card using the calling DACArecipient's instance variables.*/
  public String printCard()
  {
		String card;
		
    	card = String.format("╔══════════════════════════════════════════════════════════════════════╗%n");
		card += String.format("║%35s%35s║%n", TITLE_USA, "");
		card += String.format("║%60s%10s║%n", TITLE_EAC, "");
		card += String.format("║%-25s%-45S║%n", "", LABEL_SURNAME);
		card += String.format("║%-25s%-45s║%n", ASCII_ART_0, surname);
		card += String.format("║%-25s%-45S║%n", ASCII_ART_1, LABEL_GIVEN_NAME);
		card += String.format("║%-25s%-45s║%n", ASCII_ART_2, givenName);
		
		card += String.format("║%-25s%-45S║%n", ASCII_ART_3, LABEL_USCIS_NUM);
		card += String.format("║%-25s%-45s║%n", ASCII_ART_4, uscisNumber);
		
		card += String.format("║%-25s%-45S║%n", ASCII_ART_5, LABEL_BIRTH_COUNTRY);
		card += String.format("║%-25s%-45s║%n", ASCII_ART_6, countryOfOrigin);
		card += String.format("║%-25s%-15S%-30S║%n", ASCII_ART_7, LABEL_BIRTH_DATE, LABEL_SEX);
		card += String.format("║%-25s%-15s%-30s║%n", ASCII_ART_8, jdnToDate(birthday), sex);
		card += String.format("║%-25s%-15S%-30s║%n", ASCII_ART_9, LABEL_VALID_DATE, jdnToDate(validFromDate));
		card += String.format("║%-25s%-15S%-30s║%n", "", LABEL_EXPIRE_DATE, jdnToDate(expirationDate));
		card += String.format("║%-25s%-45s║%n", ASCII_CREDIT, LABEL_REENTRY_DISCLAIMER);
		card += String.format("╚══════════════════════════════════════════════════════════════════════╝%n");
		return card;
  }

	/**DESCRIPTION: Converts a Julian Day Number to Julian calendar date formatted as MM/DD/YYYY using algorithm adapted from https://en.wikipedia.org/wiki/Julian_day.*/
  public static String jdnToDate(int J)
	{
		int B, C, e, f, g, h, D, M, Y;
		
		B=274277;
		C=-38;
		f=J + 1401 + (((4*J+B)/146097)*3)/4+C;
		e=4*f+3;
		g=(e%1461)/4;
		h=5*g+2;
		D=((h%153)/5)+1;
		M=((h/153)+2)%12+1;
		Y=(e/1461)-4716+(12+2-M)/12;

		return String.format("%02d/%02d/%04d",M,D,Y);
	}
}
