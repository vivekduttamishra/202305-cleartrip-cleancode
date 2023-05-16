package demomt09.sharedresource;

import in.conceptarchitect.utils.ThreadUtils;

public class Manager {
	
	
	public void schedule(int workerCount, int itemsPerWorker,boolean useSameBasket) {
		
		Basket singleBasket=new Basket();
		
		Worker [] workers = new Worker[workerCount];
		
		
		for(var i=0;i<workerCount;i++) {
		
			var basket = useSameBasket? singleBasket: new Basket();
			
			var worker= new Worker(basket,itemsPerWorker);
			
			workers[i]=worker;
			
		}
		
		var start=System.currentTimeMillis();
		
		for(var worker:workers) {
			worker.start();
		}
		
		for(var worker:workers) {
			worker.waitFor();
		}
		
		var end=System.currentTimeMillis();
		
		long totalWorkDone=0;
		if(useSameBasket)
			totalWorkDone=singleBasket.getItems();
		else {
			for(var worker:workers)
				totalWorkDone+= worker.getBasket().getItems();
		}
		
		
		System.out.println("Total Items added by all worker "+totalWorkDone);
		System.out.println("Total Time taken is "+(end-start));
		
		
		
	}

}
