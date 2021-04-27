package projectDisc;

public class MemoryDaemon implements java.lang.Runnable{
	long MemmoryUsed;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Runtime rt = Runtime.getRuntime();
		long used;
		while(true) {
			used = rt.totalMemory() - rt.freeMemory();
			if(used != MemmoryUsed) {
				System.out.println("Memory used = " + used);
				MemmoryUsed = used;
			}
		}
	}

}