package cst135.MusicEmporium;

import java.util.*;

public class Storage {

	List<Piano> pianos = new ArrayList<Piano>();
	List<Guitar> guitars = new ArrayList<Guitar>();
	List<Drums> drums = new ArrayList<Drums>();

	public Storage() {
		getPianoArray();
		getGuitarArray();
		getDrumsArray();
	}

	Piano piano1 = new Piano("The Ol Grand. Phil Collins Edition", 20999.99, false, 'P', 1, 'L', 88, false);
	Piano piano2 = new Piano("Williams Rhapsody 2", 499.99, false, 'I', 3, 'M', 88, true);
	Piano piano3 = new Piano("Yamaha PSR-510", 199.99, true, 'B', 1, 'S', 72, true);
	Piano piano4 = new Piano("Nord Stage 3 88 Red", 4499.99, false, 'P', 1, 'M', 88, true);
	Piano piano5 = new Piano("Kawai Bbay Grand Piano KG-1C", 5399.99, true, 'I', 1, 'S', 88, false);
	Piano piano6 = new Piano("Petrof Parlor Grand Model 3", 11999.00, false, 'P', 1, 'L', 88, false);
	Piano piano7 = new Piano("Yamaha P-45 Weighted Key Digital Piano Black", 449.99, false, 'I', 4, 'S', 88, true);
	Piano piano8 = new Piano("Yamaha NP-12 Keyboard", 249.99, false, 'B', 6, 'S', 61, true);
	Piano piano9 = new Piano("Casio Privia PX-770", 699.99, false, 'I', 2, 'M', 88, true);
	Piano piano10 = new Piano("Nord E4lectro 5D 61", 2199.99, false, 'I', 2, 'M', 61, true);

	Guitar guitar1 = new Guitar("Gibson Les Paul Standard '60s", 2400.00, false, 'P', 3, 6, true);
	Guitar guitar2 = new Guitar("Yamaha F335  Guitar", 159.99, false, 'B', 2, 6, false);
	Guitar guitar3 = new Guitar("Epiphone Limited Edition Les Paul Custom", 679.00, true, 'P', 12, 7, true);
	Guitar guitar4 = new Guitar("Ibanez RGD71ALMS Axion Label Multi-Scale", 1099.99, false, 'P', 10, 6, true);
	Guitar guitar5 = new Guitar("Yamaha FG820-12 Dreadnought", 329.99, false, 'B', 8, 12, false);
	Guitar guitar6 = new Guitar("Agile Renaissance", 499.00, true, 'P', 4, 6, true);
	Guitar guitar7 = new Guitar("Godin Inuk Encore Steel", 1095.00, false, 'P', 3, 12, true);
	Guitar guitar8 = new Guitar("Gibson Phil Collins Special", 3100.00, false, 'P', 1, 12, true);

	Drums drums1 = new Drums("Rogue 5-Peice Drum Complete Drum Set Red", 299.99, false, 'B', 2, 5,
			"Cymbals\nKick Bass\nMounted Tom\nSnare\nHi-Hat\nFloor Tom");
	Drums drums2 = new Drums("Yamaha Stage", 649.99, false, 'I', 2, 5);
	Drums drums3 = new Drums("Ludwig LC175", 399.99, false, 'B', 2, 6);
	Drums drums4 = new Drums("1970's Hippy Banger!", 35.00, true, 'B', 39);
	Drums drums5 = new Drums("Roland TD-17KVX V-Drums Electronic Drum Set", 1699.99, false, 'P', 1, 10,
			"PDX-12 Dual Trigger Snare\nThree PDX-8 Dual Trigger Toms\nKD-10Kick TriggerPad"
					+ "\nTwo CY-12C crash V-Cymbals\nCY-13R three-way ride V-Cymbal\nVH-10 Hi-Hat\nDrum Stand");
	Drums drums6 = new Drums("SPL Unity 5-Piece Drum Set with Throne", 399.99, false, 'I', 1, 8,
			"Bass Drum\nBass Pedal\nTwo Toms\nFloor Tom\nSnare Drum\nTwo Cymbals\nHi-Hat Stand\nCrash Stand\nThrone");
	Drums drums7 = new Drums("Alesis Nitro Mesh 8-Piece Electronic Drum Set", 349.00, false, 'B', 2, 8,
			"Mesh Snare\nThree Toms\nKick Drum\nKick Pedal\nCrash Cymbal\nHiHat Cymbal\nHiHat Pedal\nAluminum Rack\n");

	public void getPianoArray() {

		pianos.add(piano1);
		pianos.add(piano2);
		pianos.add(piano3);
		pianos.add(piano4);
		pianos.add(piano5);
		pianos.add(piano6);
		pianos.add(piano7);
		pianos.add(piano8);
		pianos.add(piano9);
		pianos.add(piano10);

	}

	public void getGuitarArray() {
		guitars.add(guitar1);
		guitars.add(guitar2);
		guitars.add(guitar3);
		guitars.add(guitar4);
		guitars.add(guitar5);
		guitars.add(guitar6);
		guitars.add(guitar7);
		guitars.add(guitar8);

	}

	public void getDrumsArray() {
		drums.add(drums1);
		drums.add(drums2);
		drums.add(drums3);
		drums.add(drums4);
		drums.add(drums5);
		drums.add(drums6);
		drums.add(drums7);

	}
}
