import java.util.Random;
public class MultiThreadOddEven {
	public static void main(String[] args) {
		NumberManager manager = new NumberManager();
		NumberGenerator generator = new NumberGenerator(manager);
		EvenPrinterThread evenprinterthread = new EvenPrinterThread(manager);
		OddPrinterThread oddprinterthread = new OddPrinterThread(manager);
		generator.start();
		evenprinterthread.start();
		oddprinterthread.start();
	}
}
class NumberManager {
	private int generatedNumber;
	private boolean numberGenerated=false;
	synchronized public void generateNumber() {
		generatedNumber = new Random().nextInt(9)+2;
		System.out.println("Random Generated Number:"+generatedNumber);
		numberGenerated=true;
		notifyAll();
	}
	synchronized public void printEvenNumbers() throws InterruptedException{
		while(!numberGenerated || generatedNumber%2!=0) {
			wait();
		}
		for(int i=2;i<=generatedNumber;i+=2) {
			System.out.print(i+" ");
		}
		System.out.println();
		numberGenerated=false;
	}
	synchronized public void printOddNumbers() throws InterruptedException{
		while(!numberGenerated || generatedNumber%2==0) {
			wait();
		}
		for(int i=1;i<=generatedNumber;i+=2) {
			System.out.println(i+" ");
		}
		System.out.println();
		numberGenerated=false;
	}
}
class NumberGenerator extends Thread {
	NumberManager numberManager;
	public NumberGenerator (NumberManager numberManager) {
		this.numberManager = numberManager;
	}
	public void run() {
		while (true) {
			numberManager.generateNumber();
			try {
				Thread.sleep(1000);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
class EvenPrinterThread extends Thread {
	NumberManager numbermanager;
	public EvenPrinterThread (NumberManager numberManager) {
		this.numbermanager = numberManager;
	}
	public void run() {
		while (true) {
			try {
				numbermanager.printEvenNumbers();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class OddPrinterThread extends Thread {
	NumberManager numbermanager;
	public OddPrinterThread (NumberManager numberManager) {
		this.numbermanager = numberManager;
	}
	public void run() {
		while (true) {
			try {
				numbermanager.printOddNumbers();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
