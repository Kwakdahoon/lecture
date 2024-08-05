package webkdh.poker포커;

public class Kind implements Comparable<Kind>{
	public static final Kind SPADE  = new Kind("Spade", "♠", 0);
	public static final Kind HEART = new Kind("Heart", "♥", 1);;
	public static final Kind DIAMOND = new Kind("Diamond", "◆", 2);;
	public static final Kind CLUB = new Kind("Club", "♣", 3);;
	
	private static final Kind[] VALUES = {SPADE, HEART, DIAMOND, CLUB};
	private final String name;
	private final String symbol;
	private final int order;

	private Kind(String name, String symbol, int order) {
		this.name = name;
		this.symbol = symbol;
		this.order = order;
	}


	public String getName() {
		return name;
	}

	public String getSymbol() {
		return symbol;
	}

	public int getOrder() {
		return order;
	}

	public static Kind[] values() {
		return VALUES.clone();
	}

	@Override
	public String toString() {
		return "[" + symbol + "]";
	}


	@Override
	public int compareTo(Kind o) {
		return Integer.compare(this.order, o.order);
	}
}
