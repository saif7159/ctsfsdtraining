<<<<<<< HEAD
package com.cd.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
@NotNull(message = "Can't leave this blank")	
private String email;
@NotNull @Size(min = 5, max = 10, message = "Type a valid password")
private String password;
@Range(min = 18, message = "You must be 18")
private int age;

}
=======
package com.cd.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
@NotNull(message = "Can't leave this blank")	
private String email;
@NotNull @Size(min = 5, max = 10, message = "Type a valid password")
private String password;
@Range(min = 18, message = "You must be 18")
private int age;

}
>>>>>>> refs/remotes/origin/master
