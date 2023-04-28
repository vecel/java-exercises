package pl.edu.pw.mini.karandysm.podrozny;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Random;
import java.util.Set;

import pl.edu.pw.mini.karandysm.towary.Towar;

public abstract class Podrozny {
	
	private static int nextId = 1;
	protected static Random random = new Random();
	
	private int id;
	private int wiek;
	private Set<Towar> towary = new LinkedHashSet<>();
	
	public Podrozny() {
		id = nextId++;
		generujTowary();
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Podrozny other = (Podrozny) obj;
		return id == other.id;
	}
	
	protected void losujWiek(int min, int max) {
		wiek = random.nextInt(min, max + 1);
	}
	
	protected abstract void generujTowary();
	
	protected void dodajTowar(Towar towar) {
		towary.add(towar);
	}

	@Override
	public String toString() {
		return "Podrozny [id=" + id + "]";
	}

	public int getWiek() {
		return wiek;
	}

	public Set<Towar> getTowary() {
		return towary;
	}
	
	
}
