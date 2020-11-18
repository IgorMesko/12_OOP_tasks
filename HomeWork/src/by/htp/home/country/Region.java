package by.htp.home.country;

import java.util.ArrayList;
import java.util.List;

public class Region {
	{
		idRegion++;
	}
	private String nameRegion;
	private List<District> districts;
	private double square;
	private static int idRegion = 0;
	
	public Region(String nameRegion, double square) {
		this.nameRegion = nameRegion;
		this.square = square;
		this.districts = new ArrayList<>();
	}

	public String getNameRegion() {
		return nameRegion;
	}

	public void setNameRegion(String nameRegion) {
		this.nameRegion = nameRegion;
	}

	public List<District> getDistricts() {
		return districts;
	}

	public void setDistricts(List<District> districts) {
		this.districts = districts;
	}

	public double getSquare() {
		return square;
	}

	public void setSquare(double square) {
		this.square = square;
	}

	public void addDistrict(District distritc) {
		districts.add(distritc);
	}

	public static int getIdRegion() {
		return idRegion;
	}

	public static void setIdRegion(int idRegion) {
		Region.idRegion = idRegion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((districts == null) ? 0 : districts.hashCode());
		result = prime * result + ((nameRegion == null) ? 0 : nameRegion.hashCode());
		long temp;
		temp = Double.doubleToLongBits(square);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Region other = (Region) obj;
		if (districts == null) {
			if (other.districts != null)
				return false;
		} else if (!districts.equals(other.districts))
			return false;
		if (nameRegion == null) {
			if (other.nameRegion != null)
				return false;
		} else if (!nameRegion.equals(other.nameRegion))
			return false;
		if (Double.doubleToLongBits(square) != Double.doubleToLongBits(other.square))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Region [nameRegion=" + nameRegion + ", districts=" + districts + ", square=" + square + "]";
	}

}
