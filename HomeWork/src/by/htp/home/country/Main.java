/* Создать объект класса Государство, используя классы Область, Район, Город. Методы:
вывести на консоль столицу, количество областей, площадь, областные центры. */

package by.htp.home.country;

public class Main {

	public static void main(String[] args) {
	
        District distric1 = new District("Минский район");
        District distric2 = new District("Брестский район");
        District distric3 = new District("Могилевский район");
        District distric4 = new District("Витебский район");
        District distric5 = new District("Гродненский район");
        District distric6 = new District("Гомельский район");
        
        distric1.addCity(new City("Минск", true, true));
        distric2.addCity(new City("Брест", true));
        distric3.addCity(new City("Могилев", true));
        distric4.addCity(new City("Витебск", true));
        distric5.addCity(new City("Гродно", true));
        distric6.addCity(new City("Гомель", true));
        
        Region r1 = new Region("Минская область", 39.9);
        Region r2 = new Region("Брестская область", 32.8);
        Region r3 = new Region("Могилевская область", 29.1);
        Region r4 = new Region("Витебская область", 40.0);
        Region r5 = new Region("Гродненская область", 25.1);
        Region r6 = new Region("Гомельская область", 40.4);
        
        r1.addDistrict(distric1);
        r2.addDistrict(distric2);
        r3.addDistrict(distric3);
        r4.addDistrict(distric4);
        r5.addDistrict(distric5);
        r6.addDistrict(distric6);
      
        Country belarus = new Country("Беларусь");
        
        belarus.addRegions(r1);
        belarus.addRegions(r2);
        belarus.addRegions(r3);
        belarus.addRegions(r4);
        belarus.addRegions(r5);
        belarus.addRegions(r6);
        
        ViewLogic vl = new ViewLogic();
        Logic l = new Logic();
        l.foundCapital(belarus);
        vl.printCapital(belarus);
        vl.numberRegionalCenter(belarus);
        vl.printSquare(belarus);
        vl.printRegional(belarus);
	}

}
