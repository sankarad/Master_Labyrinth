package tests;

import java.awt.Color;

import code.Player;
//@author Sankara Daly
// Creates a Pawn Object designed as a simple black square for Stage1
public class Pawns  {
	private Color _pcolor;
	
	public Pawns(){
		set_pcolor(Color.BLACK);
		Pawns p= new Pawns();
		p.set_pcolor(_pcolor);
		Player lb= new Player(p,_pcolor);
	}

	public Color get_pcolor() {
		return _pcolor;
	}

	public void set_pcolor(Color _pcolor) {
		this._pcolor = _pcolor;
	}
	
	

	}