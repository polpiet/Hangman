package be.vdab.entities;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class Uitdaging {
	private Persoon uitdager = new Persoon();
	private Persoon uitgedaagde = new Persoon();
	private boolean aanvaard = false;
	private String woord = "";
	private int pogingen = 0;
	private Set<Character> letters = new CopyOnWriteArraySet<Character>();
	private boolean geraden = false;
	private String weergave = "";
	
	public String getWeergave() {
		return weergave;
	}

	public void setWeergave(String weergave) {
		this.weergave = weergave;
	}

	public boolean isGeraden() {
		return geraden;
	}

	public boolean getAanvaard(){
		return aanvaard;
	}
	
	public String getWoord() {
		return woord;
	}

	public int getPogingen() {
		return pogingen;
	}

	public Persoon getUitdager() {
		return uitdager;
	}
	public Persoon getUitgedaagde() {
		return uitgedaagde;
	}

	public void setUitdager(Persoon uitdager) {
		this.uitdager = uitdager;
	}

	public void setUitgedaagde(Persoon uitgedaagde) {
		this.uitgedaagde = uitgedaagde;
	}

	public void setAanvaard(boolean aanvaard) {
		this.aanvaard = aanvaard;
	}

	public void setWoord(String woord) {
		this.woord = woord;
	}

	public void setPogingen(int pogingen) {
		this.pogingen = pogingen;
	}

	public void setGeraden(boolean geraden) {
		this.geraden = geraden;
	}

	public Set<Character> getLetters() {
		return letters;
	}

	public void setLetters(Set<Character> letters) {
		this.letters = letters;
	}
}
