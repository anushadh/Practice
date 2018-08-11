package problems.algorithms;

public class threads implements Runnable{
	
	private Thread t;
	private String name;
	
	public threads(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		threads a = new threads("A");
		threads b = new threads("B");
		
		b.start();
		a.start();
	}

	@Override
	public void run() {
		while(true) {
			System.out.println(this.name);
		}
	}
	
	public void start() {
		if(t == null) {
			t = new Thread(this, this.name);
		}
	}

}
