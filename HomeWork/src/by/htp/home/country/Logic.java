package by.htp.home.country;

import java.util.ArrayList;
import java.util.List;

public class Logic {
	
	public City foundCapital(Country country) {
		for(Region region : country.getRegions()) {
			for(District district : region.getDistricts()) {
				for(City city : district.getCities()) {
					if(city.isCapital()) {
						return city;
					}
				}
			}
		}
		return null;
	}
	
	public List<City> foundRegional(Country country) {
		List<City> list = new ArrayList<>();
		
		for(Region region : country.getRegions()) {
			for(District district : region.getDistricts()) {
				for(City city : district.getCities()) {
					if(city.isDistrCenter()) {
						list.add(city);
					}
				}
			}
		}
		return list;
	}
	
	public double squareRegion(Country country) {
		double s = 0;
		List<Region> list = country.getRegions();
		
		for(Region r : list) {
			s += r.getSquare();
		}
		return (int)s;
	}
}
