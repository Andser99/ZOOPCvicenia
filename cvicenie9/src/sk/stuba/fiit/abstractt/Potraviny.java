package sk.stuba.fiit.abstractt;

public abstract class Potraviny {
		String name;
		abstract void doplnVitaminy(Obyvatel o);
		
		void inaMetoda() {
		}
		
		public String toString() {
			return "Nazov potraviny: ";
		}
}
