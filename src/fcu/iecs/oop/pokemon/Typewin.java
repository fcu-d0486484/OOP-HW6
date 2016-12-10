package fcu.iecs.oop.pokemon;

public class Typewin 
{
	public static int fight(PokemonType p1,PokemonType p2)
	{
		if(p1==p2)
			return 0;
		if(p1==PokemonType.FIRE)
		{
			if(p2==PokemonType.GRASS)
				return 1;
			else
				return 2;
		}
		if(p1==PokemonType.GRASS)
		{
			if(p2==PokemonType.WATER)
				return 1;
			else
				return 2;
		}
		if(p1==PokemonType.WATER)
		{
			if(p2==PokemonType.FIRE)
				return 1;
			else
				return 2;
		}
		return 3;
	}
}
