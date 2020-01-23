package com.card.shuffle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShufflerDistributor {
List<Card> cards;
List<Card>[] cardarray;
public ShufflerDistributor(List<Card> cards) {
	super();
	this.cards = cards;
	Collections.shuffle(cards);
	//System.out.println(cards);
	
}
List<Card>[] distribute(int players)
{
	cardarray = new List[players];
	int distribution = 52/players;
	//int temp = 0;
	cardarray[0]= cards.subList(0, 52/players);
	for(int i=1;i<players;i++)
	{
		int toindex = (i+1)*(52/players);
		cardarray[i] = cards.subList(distribution,toindex );
		distribution = toindex;
		//System.out.println(distribution+" "+toindex);
	}
	return cardarray;
}
}
