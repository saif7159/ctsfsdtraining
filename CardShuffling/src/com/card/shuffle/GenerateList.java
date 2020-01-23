package com.card.shuffle;

import java.util.ArrayList;
import java.util.List;

public class GenerateList {
List<Card> carddeck;
{
 carddeck = new ArrayList<Card>();	
}

public List<Card> generateDeck()
{	
	createSuite("Clubs");
	createSuite("Diamonds");
	createSuite("Hearts");
	createSuite("Spades");
	return carddeck;
}
public void createSuite(String suite)
{
	for(int i=2;i<=10;i++)
	{
		carddeck.add(new Card(suite, null, i));
	}
	carddeck.add(new Card(suite,"Ace",0));
	carddeck.add(new Card(suite,"Jack",0));
	carddeck.add(new Card(suite,"Queen",0));
	carddeck.add(new Card(suite,"King",0));
	
}
}
