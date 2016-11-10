import java.util.*;




public class Deck {
	public int nUsed;
	
	private ArrayList<Card> cards;
	//TODO: Please implement the constructor
	public Deck(int nDeck){
		cards=new ArrayList<Card>();
		
		for(int i=1;i<nDeck+1;i++)
		{
			for(Card.Suit s : Card.Suit.values())
			{
				for(int k=1;k<14;k++)
				{
					Card card= new Card(s,k);
					cards.add(card);
					}
				}
			}
		shuffle();
		}
	
	public void printDeck(){
	
		for(Card c : cards){
			c.printCard();
		}

	}
	public ArrayList<Card> getAllCards(){
		return cards;
	}
	public  ArrayList<Card> shuffle(){
		nUsed=0;
		for (int cardnum=0;cardnum<cards.size();cardnum++){
		Random r = new Random();
		int nr=r.nextInt(cards.size());
		Card Temp=cards.get(cardnum);
		cards.set(cardnum, cards.get(nr));
		cards.set(nr, Temp);
		//Collections.swap(cards, nr,cardnum);
		}
		return cards;
		
	}

	public Card getOneCard(){
		nUsed=nUsed+1;
		

		if (nUsed>cards.size()-1){
			shuffle();System.out.println(nUsed);
			return cards.get(nUsed);
			
		}
		
		
		else return cards.get(nUsed);
		
	}
	
}