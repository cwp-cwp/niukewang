package com.cwp.面向对象2;

//创建两个子线程，让其中一个输出1-100之间的偶数，另一个输出1-100之间的奇数。
class SubThread11 extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

class SubThread12 extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

public class _19多线程 {
    public static void main(String[] args) {
        SubThread11 st1 = new SubThread11();
        SubThread12 st2 = new SubThread12();
        st1.start();
        st2.start();
        //继承于Thread类的匿名类的对象
//		new Thread(){
//			public void run(){
//				for(int i = 1;i <= 100;i++){
//					if(i % 2 == 0){
//						System.out.println(Thread.currentThread().getName() + ":" + i);
//					}
//				}
//			}
//		}.start();
//		
//		new Thread(){
//			public void run(){
//				for(int i = 1;i <= 100;i++){
//					if(i % 2 != 0){
//						System.out.println(Thread.currentThread().getName() + ":" + i);
//					}
//				}
//			}
//		}.start();

    }
}
