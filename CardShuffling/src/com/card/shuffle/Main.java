package com.card.shuffle;

import java.util.List;

public class Main {
public static void main(String[] args)
{
	GenerateList gl = new GenerateList();
	List<Card> list = 	gl.generateDeck();
	System.out.println(list.size());
	ShufflerDistributor sd = new ShufflerDistributor(list);
	List<Card>[] distributed = sd.distribute(4);
	for(List<Card> l:distributed) {
	System.out.println(l);
	System.out.println(l.size());
	}
}
}
