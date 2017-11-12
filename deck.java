

import java.util.ArrayList;
import java.util.Random;

public class Deck {
	
		private ArrayList<Card> cards;
		private ArrayList<Card> usedCard = new ArrayList<Card>();
		public int nUsed;
		
		
		
		
		//TODO: Please implement the constructor (30 points)
		public Deck(int nDeck){
			cards=new ArrayList<Card>();
			//1 Deck have 52 cards, https://en.wikipedia.org/wiki/Poker
			//Hint: Use new Card(x,y) and 3 for loops to add card into deck
			//Sample code start
			//Card card=new Card(1,1); ->means new card as clubs ace
			//cards.add(card);
			//Sample code end
			
			for(int q = 0 ; q < nDeck; q++)
			{
//				for(int x = 1; x <= 4 ; x++)
//				{
//					for(int y = 1 ; y <= 13 ; y ++)
//					{
//						Card card=new Card(x,y); 
//						cards.add(card);
//					}
//				}
				
				for(Card.Suit s: Card.Suit.values())//for(int s=0;s<4;s++)花色
				{
					for(int y = 1 ; y <= 13 ; y ++)
						{
							Card card=new Card(s,y); //存入每一張牌
							cards.add(card);
						}
				}
				
			}
			
			shuffle();

		}	
		
		
		public void shuffle()
		{
			
		Random rmd = new Random();//隨機選一張牌
			for(int a = 0 ; a < 52;a ++)
			{
				int j = rmd.nextInt(52-a);
				
				Card temp = cards.get(j);//temp當作暫存空間
				cards.set(j, cards.get(a));//牌兩兩交換
				cards.set(a, temp);
				
			}
		
			
			
			nUsed = 0;
			usedCard.clear();
		}
		
		public Card getOneCard()
		{
			
			if(nUsed==51)//當發出去52張牌時就洗牌
			{ 
				shuffle();
				return cards.get(nUsed);//nused重回0
			}
			else
			{
				usedCard.add(cards.get(nUsed));//記錄發出去的牌到usedcard
				nUsed ++;//多發一張卡
				return cards.get(nUsed-1);//把nUsed+1的誤差減回來
			}
			
			
		}
		
		//TODO: Please implement the method to print all cards on screen (10 points)
		public void printDeck(){
			//Hint: print all items in ArrayList<Card> cards, 
			//TODO: please implement and reuse printCard method in Card class (5 points)
			for(int k = 0 ; k < cards.size();k++)
			{
				cards.get(k).printCard();
			}
		}
		public ArrayList<Card> getAllCards(){
			return cards;
		}
	
}
