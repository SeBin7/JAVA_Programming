package day_15;

import java.io.Serializable;
import java.util.Objects;

public class PhoneInfo implements Comparable<PhoneInfo>, Serializable{
	String name;
	//transient String phoneNumber;
	 String phoneNumber;
	
	public PhoneInfo() {
		super();
	}
	public PhoneInfo(String name, String phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "PhoneInfo [name=" + name + ", phoneNumber=" + phoneNumber + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(name,phoneNumber);
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhoneInfo other = (PhoneInfo) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		return true;
	}
	@Override
	public int compareTo(PhoneInfo o) {
		return phoneNumber.compareTo(o.phoneNumber);
	}
}
