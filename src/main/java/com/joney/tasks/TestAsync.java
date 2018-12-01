package com.joney.tasks;

import java.util.concurrent.Future;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

/**
 * @author Joney_wang
 * 注掉@Async后为同步执行时间，也就是顺序执行时间。
 */
@Component
public class TestAsync {

	@Async
	public Future<Boolean> doAsync1() throws Exception{
		long start = System.currentTimeMillis();
		Thread.sleep(1000);
		long end = System.currentTimeMillis();
		System.out.println("任务1执行时间是："+(end-start)+"毫秒");
		return new AsyncResult<Boolean>(true);
	}
	
	@Async
	public Future<Boolean> doAsync2() throws Exception{
		long start = System.currentTimeMillis();
		Thread.sleep(700);
		long end = System.currentTimeMillis();
		System.out.println("任务2执行时间是："+(end-start)+"毫秒");
		return new AsyncResult<Boolean>(true);
	}
	
	@Async
	public Future<Boolean> doAsync3() throws Exception{
		long start = System.currentTimeMillis();
		Thread.sleep(500);
		long end = System.currentTimeMillis();
		System.out.println("任务3执行时间是："+(end-start)+"毫秒");
		return new AsyncResult<Boolean>(true);
	}
}
