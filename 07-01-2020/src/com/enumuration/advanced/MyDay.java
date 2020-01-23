package com.enumuration.advanced;

public enum MyDay {
SUN("Sunday","Today is a holiday"),
MON("Monday","First working day"),
TUE("Tuesday","Second working day"),
WED("Wednesday","Third working day"),
THU("Thursday","Fourth working day"),
FRI("Friday","Fifth working day"),
SAT("Saturday","Still a working day @alchemy");
final String day;
final String working;
	

private MyDay(String string1, String string2) {
	// TODO Auto-generated constructor stub
	day = string1;
	working = string2;
}


public String getDay() {
	return day;
}


public String getWorking() {
	return working;
}

}
