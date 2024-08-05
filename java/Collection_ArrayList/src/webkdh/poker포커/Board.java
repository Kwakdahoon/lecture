package webkdh.poker포커;

import java.util.Iterator;

public class Board {
	public static void main(String[] args) {
		
		Dealer dealer = new Dealer();
		Player player1 = new Player("임요환 ");
		Player player2 = new Player("곽다훈 ");
		
		for (int i = 0; i < 5; i++) {
			player1.getCardFromDealer(dealer);
			player2.getCardFromDealer(dealer);
		}
		
		player1.showPlatersCards();
		player2.showPlatersCards();
		
		Player winner = getWinner(player1, player2);
		if (winner != null) {
			System.out.println(winner.getName());
		} else {
			System.out.println("무슴부");
		}
	}
		

	private static Player getWinner(Player player1, Player player2) {
		int p1 = player1.calCardSum();
		int p2 = player2.calCardSum();
		
		if (p1 > p2) {
			return player1;
		} else if (p1 == p2) {
			return null;
		} else {
			return player2;
		}
	}
}
