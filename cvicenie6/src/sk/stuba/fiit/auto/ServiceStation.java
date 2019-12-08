package sk.stuba.fiit.auto;

import java.util.ArrayList;

public class ServiceStation {
	private ArrayList<Motor> usedEngines;
	
	public void acceptUsedEngine(Auto starySrot) {
		usedEngines.add(starySrot.getMotro());
	}
	
	public Motor provideUsedEngine(Auto naOpravu) {
		return usedEngines.get(1);
	}
	
	
	
}
