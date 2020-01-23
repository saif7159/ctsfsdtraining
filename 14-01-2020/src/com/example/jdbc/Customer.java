//Data Class
package com.example.jdbc;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Customer {
private String firstname;
private String lastname;
private String email;
@Override
public String toString() {
	return "firstname: " + firstname + "\nlastname: " + lastname + "\nemail: " + email;
}

}
