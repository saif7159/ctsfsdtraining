package com.example.SetTest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
//Data type class
public class Customer {
private Integer cust_id;
private String first_name;
private String last_name;
private String email;
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((cust_id == null) ? 0 : cust_id.hashCode());
	result = prime * result + ((email == null) ? 0 : email.hashCode());
	result = prime * result + ((first_name == null) ? 0 : first_name.hashCode());
	result = prime * result + ((last_name == null) ? 0 : last_name.hashCode());
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
	Customer other = (Customer) obj;
	if (cust_id == null) {
		if (other.cust_id != null)
			return false;
	} else if (!cust_id.equals(other.cust_id))
		return false;
	if (email == null) {
		if (other.email != null)
			return false;
	} else if (!email.equals(other.email))
		return false;
	if (first_name == null) {
		if (other.first_name != null)
			return false;
	} else if (!first_name.equals(other.first_name))
		return false;
	if (last_name == null) {
		if (other.last_name != null)
			return false;
	} else if (!last_name.equals(other.last_name))
		return false;
	return true;
}


}
