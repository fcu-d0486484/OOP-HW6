package fcu.iecs.oop.pokemon;

public class Player {
	private String playerName;
	private int level;
	private Pokemon save[];

	public Player(String playerName) {
		super();
		this.playerName = playerName;
		level=1;
	}

	public String getPlayerName() {
		String playerName = this.playerName;
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public Pokemon[] getPokemons() {
		return save;
	}

	public void setPokemons(Pokemon[] save) {
		this.save = save;
	}

}
