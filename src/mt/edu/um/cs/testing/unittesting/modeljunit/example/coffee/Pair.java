package mt.edu.um.cs.testing.unittesting.modeljunit.example.coffee;

public class Pair<T1, T2> {
	
	T1 firstObject;
	T2 secondObject;
	
	public Pair(T1 t1, T2 t2) {
		super();
		this.firstObject = t1;
		this.secondObject = t2;
	}

	public T1 getFirstObject() {
		return firstObject;
	}

	public void setFirstObject(T1 firstObject) {
		this.firstObject = firstObject;
	}

	public T2 getSecondObject() {
		return secondObject;
	}

	public void setSecondObject(T2 secondObject) {
		this.secondObject = secondObject;
	}

}
