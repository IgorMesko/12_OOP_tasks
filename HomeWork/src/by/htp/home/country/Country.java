package by.htp.home.country;

import java.util.ArrayList;
import java.util.List;

public class Country {
	
	private String nameCountry;
	private List<Region> regions;
	
	public Country(String nameCountry) {
		this.nameCountry = nameCountry;
		this.regions = new ArrayList<>();
	}

	public String getNameCountry() {
		return nameCountry;
	}

	public void setNameCountry(String nameCountry) {
		this.nameCountry = nameCountry;
	}

	public List<Region> getRegions() {
		return regions;
	}

	public void setRegions(List<Region> regions) {
		this.regions = regions;
	}
	
	public void addRegions(Region region) {
		regions.add(region);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nameCountry == null) ? 0 : nameCountry.hashCode());
		result = prime * result + ((regions == null) ? 0 : regions.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Country other = (Country) obj;
		if (nameCountry == null) {
			if (other.nameCountry != null)
				return false;
		} else if (!nameCountry.equals(other.nameCountry))
			return false;
		if (regions == null) {
			if (other.regions != null)
				return false;
		} else if (!regions.equals(other.regions))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Country [nameCountry=" + nameCountry + ", regions=" + regions + "]";
	}

}
