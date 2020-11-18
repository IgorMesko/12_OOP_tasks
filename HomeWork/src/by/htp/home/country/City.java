package by.htp.home.country;

public class City {

	private String nameCity;
	private boolean capital = false;
	private boolean regCenter = false;
	
	public City(String nameCity) {
		this.nameCity = nameCity;
	}
	
	public City(String nameCity, boolean capital, boolean regCenter) {
		this.nameCity = nameCity;
		this.capital = capital;
		this.regCenter = regCenter;
	}
	
	public City(String nameCity, boolean distrCenter) {
		this.nameCity = nameCity;
		this.regCenter = distrCenter;
	}

	public String getNameCity() {
		return nameCity;
	}

	public void setNameCity(String nameCity) {
		this.nameCity = nameCity;
	}

	public boolean isCapital() {
		return capital;
	}

	public void setCapital(boolean capital) {
		this.capital = capital;
	}

	public boolean isDistrCenter() {
		return regCenter;
	}

	public void setDistrCenter(boolean distrCenter) {
		this.regCenter = distrCenter;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (capital ? 1231 : 1237);
		result = prime * result + (regCenter ? 1231 : 1237);
		result = prime * result + ((nameCity == null) ? 0 : nameCity.hashCode());
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
		City other = (City) obj;
		if (capital != other.capital)
			return false;
		if (regCenter != other.regCenter)
			return false;
		if (nameCity == null) {
			if (other.nameCity != null)
				return false;
		} else if (!nameCity.equals(other.nameCity))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return nameCity;
	}

}

