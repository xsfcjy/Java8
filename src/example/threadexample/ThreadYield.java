package example.threadexample;

public class ThreadYield extends Thread {
	public ThreadYield(String name) {
		super(name);
	}

	@Override
	public void run() {
//		try {
//			if(this.getName().equals("张三"))
//				this.sleep(1000l);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		};
		if(this.getName().equals("张三")){
			System.out.println(this.getName()+" yield start");
			this.yield();
			System.out.println(this.getName()+" yield end");
		}
		for (int i = 1; i <= 50; i++) {
			System.out.println("" + this.getName() + "-----" + i);
			// 当i为30时，该线程就会把CPU时间让掉，让其他或者自己的线程执行（也就是谁先抢到谁执行）
			if (i == 30) {
			}
		}

	}

	public static void main(String[] args) {

		ThreadYield yt1 = new ThreadYield("张三");
		ThreadYield yt2 = new ThreadYield("李四");
		yt2.setPriority(MAX_PRIORITY);
		yt1.setPriority(MIN_PRIORITY);
		yt1.start();
		yt2.start();
	}

}