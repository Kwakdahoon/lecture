package webkdh.poker포커;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dealer {
	// 딜러가 카드를 가지고 있다
	private List<Card> cards = new ArrayList<>();
	
	public Dealer() {
		prepareCard();
		shuffle();
	}

	private void shuffle() {
		Collections.shuffle(cards);
	}

	private void prepareCard() {
		for (int i = 1; i <= 13; i++) {
			for(Kind kind : Kind.values()) {
				cards.add(new Card(i, kind));
			}
		}
	}
	
	public Card pickCard() {
		return cards.remove(0);
	}
}
