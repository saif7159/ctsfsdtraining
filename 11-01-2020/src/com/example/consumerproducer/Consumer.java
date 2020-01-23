package com.example.consumerproducer;

public class Consumer extends Thread {
	int productionsize;
	CubbyHole ch;

	public Consumer(int productionsize) {
		super();
		this.productionsize = productionsize;
		ch = new CubbyHole(productionsize);
	}
	@Override
	public void run()
	{
		for (int i=0;i<productionsize;i++)
		{
			ch.consume();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
