

public class Card {
	
		public enum Suit
		{
			Club,Diamond,Heart,Spade
		}
		
		private Suit suits;
	
		private int suit; //Definition: 1~4, Clubs=1, Diamonds=2, Hearts=3, Spades=4
		private int rank; //1~13
		/**
		 * @param s suit
		 * @param r rank
		 */
		public Card(int s,int r){
			suit=s;
			rank=r;
		}
		
		public Card(Suit s , int value)
		{
			suits = s;
			rank = value;
		}
		
		//TODO: 1. Please implement the printCard method (20 points, 10 for suit, 10 for rank)
		public void printCard(){
			String[] suitStr = {"Clubs","Diamonds","Hearts","Spades"};
			String[] rankStr = {"Ace","two","three","four",
					"five","six","seven","eight","nine","ten","jack","queen","king"}; 
			//Hint: print (System.out.println) card as suit,rank, for example: print 1,1 as Clubs Ace
			
			//System.out.println(suitStr[getSuit()-1] +" " + rankStr[getRank()-1]);
			System.out.println(getSuits()+" " + getRank());
			
		}
		public Suit getSuits()
		{
			return suits;
		}
		
		public int getSuit(){
			return suit;
		}
		public int getRank(){
			return rank;
		}
	
}
