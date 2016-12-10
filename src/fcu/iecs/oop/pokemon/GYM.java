package fcu.iecs.oop.pokemon;



public class GYM 
{
	public static Player fight(Player p1,Player p2)
	{
		Pokemon[] p1poke=p1.getPokemons();
		Pokemon[] p2poke=p2.getPokemons();
		Player winner;
		int p1win=0,p2win=0,typeint,rnum,winlev;
		for(int i=0;i<3;i++)
		{
			typeint=Typewin.fight(p1poke[i].getType(),p2poke[i].getType());
			if(typeint==1)
			{
				p1win++;
				continue;
			}
			else if(typeint==2)
			{
				p2win++;
				continue;
			}
			if(p1poke[i].getCp()>p2poke[i].getCp())
			{
				p1win++;
				continue;
			}
			else if(p1poke[i].getCp()<p2poke[i].getCp())
			{
				p2win++;
				continue;
			}
			
			rnum=(int)(Math.random()*10);
			
			if(rnum%2==0)
			{
				p1win++;
			}
			else
			{
				p2win++;
			}
		}
		if(p1win>p2win)
			winner=p1;
		else
			winner=p2;
		winlev=winner.getLevel()+1;
		winner.setLevel(winlev);
		System.out.println("Winner is "+winner.getPlayerName()+", and his/her level becomes "+winlev+".");
		return winner;
	}
}