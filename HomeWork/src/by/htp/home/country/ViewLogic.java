package by.htp.home.country;

public class ViewLogic {
	Logic l = new Logic();
	
	public void printCapital(Country country) {
		System.out.println("Столица республики " + country.getNameCountry() + " - " + l.foundCapital(country));
	}
	
	public void numberRegionalCenter(Country country) {
		System.out.println("Количество областей: " + Region.getIdRegion()); 
	}
	
	public void printSquare(Country country) {
		System.out.println("Общая площадь всех областей республики " + country.getNameCountry() + 
				" = " + l.squareRegion(country) + " километров квадратных");
	}
	
	public void printRegional(Country country) {
		System.out.println("Областные центры республики " + country.getNameCountry() + ": " + l.foundRegional(country));
	}
	
}