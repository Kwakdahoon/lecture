package webkdh.poker포커;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private String name;
	private List<Card> playersCards;
	
	public Player(String name) {
		this.name = name;
		this.playersCards = new ArrayList<Card>();
	}
	
	public String getName() {
		return name;
	}
	
	public void getCardFromDealer(Dealer dealer) {
		playersCards.add(dealer.pickCard());
	}
	
	public void showPlatersCards() {
		playersCards.sort(null);
		System.out.println(name + "플레이어" + playersCards);
	}
	
	public int calCardSum() {
		int sum = 0;
		for (Card card : playersCards) {
			sum += card.getNum();
		}
		return sum;
	}

}
