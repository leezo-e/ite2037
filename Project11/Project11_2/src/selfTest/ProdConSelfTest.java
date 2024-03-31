package selfTest;

public class ProdConSelfTest {
	private Buffer buffer;
	private Producer producer;
	private Consumer consumer;
	
	public ProdConSelfTest() {
		buffer = new Buffer(15);
		producer = new Producer(buffer);
		consumer = new Consumer(buffer);
	}
	
	private class Producer extends Thread{
		private final Buffer buffer;
		public Producer(Buffer buffer) {
			/* your code */
			this.buffer = buffer;
		}
		
		public void produce() throws InterruptedException {
			/* your code */
			for (int i = 0; i < buffer.getSize(); i++) {
				buffer.add(Math.random() * 100);
			}
		}
		
		public void run() {
			try {
				/* your code */
				produce();
			} catch (InterruptedException e) {
				/* your code */
				e.printStackTrace();
			}
		}
	}
	
	private class Consumer extends Thread {
		private final Buffer buffer;
		public Consumer(Buffer buffer) {
			/* your code */
			this.buffer = buffer;
		}
		
		public void consume() throws InterruptedException {
			/* your code */
			for (int i = buffer.getSize();i>=0; i--) {
				buffer.remove();
			}
		}
		
		public void run() {
			try {
				/* your code */
				consume();
			} catch (InterruptedException e) {
				/* your code */
				e.printStackTrace();
			}
		}
	}
	
	public void startThread() {
		producer.run();
		consumer.run();
	}
}

/*
 * producer와 consumer class를 private inner class로 추가한다 응  했
 * producer와 consumer inner class는 스레드를 사용한다
 * produce와 consume의 쓰레드를 시작하도록 는 startThread() 메소드를 작성한다 */
 