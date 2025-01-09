package com.winter.app.utils.collections.test;

import java.util.ArrayList;

public class TestMain {

	
	public static void main(String[] args) {
		
		Marine marine = new Marine();
		Marine marine2 = new Marine();
		Medic medic = new Medic();
		Wraith wraith = new Wraith();
		
		
		// <? extends GroundUnit>     GroundUnit과 그 자손들만 가능
		// <? super GroundUnit>      Groundunit과 그 조상들만 가능
		
		
		
		
		ArrayList<Marine> ar = new ArrayList<>();
		
		ar.add(marine);
		ar.add(marine2);
		
		
		ArrayList<GroundUnit> ar2 = new ArrayList<>();
		GroundUnit g = new GroundUnit();
		ar2.add(marine2);
		ar2.add(medic);
		
		
		UnitView view = new UnitView();
		view.view(ar);
		view.view2(ar2);
		
		
		
		
		
	}
}
