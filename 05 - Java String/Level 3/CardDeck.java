import java.util.*;
public class CardDeck{
	static final String[] SUITS={"Hearts","Diamonds","Clubs","Spades"};
	static final String[] RANKS = {
        "2", "3", "4", "5", "6", "7", "8", "9", "10", 
        "Jack", "Queen", "King", "Ace"
    };
	static final int DECK_SIZE=SUITS.length*RANKS.length;
	public static String[] initializeDeck(){
		String[] deck=new String[DECK_SIZE];
		int index=0;
		for(String suit:SUITS){
			for(String rank:RANKS){
				deck[index++]=rank+" of "+suit;
			}
		}
		return deck;
	}
	public static void shuffleDeck(String[] deck){
		Random random=new Random();
		for(int i=deck.length-1;i>0;i--){
			int randomCard=random.nextInt(i+1);
			String temp=deck[i];
			deck[i]=deck[randomCard];
			deck[randomCard]=temp;
		}
	}
	public static String[][] distributeCards(String[] deck,int numCards,int numPlayers){
		if(numCards*numPlayers>DECK_SIZE){
			System.out.println("Not enough cards!");
			return null;
		}
		String[][] players=new String[numPlayers][numCards];
		int cardIndex=0;
		for(int i=0;i<numCards;i++){
			for(int j=0;j<numPlayers;j++){
				players[j][i]=deck[cardIndex++];
			}
		}
		return players;
	}
		public static void printCards(String[][] players){
			for(int i=0;i<players.length;i++){
				System.out.println("\nPlayer "+(i+1)+" has:");
				System.out.println("-------------------------");
				for(String card:players[i]){
					System.out.println(card);
				}
			}
		}
		public static void main(String[] args){
			int numPlayers,numCards;
			Scanner scanner = new Scanner(System.in);
			numPlayers = scanner.nextInt();
			numCards = scanner.nextInt();
			String[] deck=initializeDeck();
			shuffleDeck(deck);
			String[][] players=distributeCards(deck,numCards,numPlayers);
			if(players!=null){
				printCards(players);
		}
	}
}