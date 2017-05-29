package day_16.thread;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Thread05 extends JFrame {
	Label lb1, lb2, lb3;
	TextField tx1, tx2, tx3;
	Button start = new Button("START");

	Thread05() {
		lb1 = new Label("È¦¼öÇÕ");
		lb2 = new Label("Â¦¼öÇÕ");
		lb3 = new Label("ÃÑ ÇÕ");
		tx1 = new TextField("", 40);
		tx2 = new TextField("", 40);
		tx3 = new TextField("", 40);
		Panel p1 = new Panel();
		p1.setLayout(new GridLayout(3, 2));
		p1.add(lb1);
		p1.add(tx1);
		p1.add(lb2);
		p1.add(tx2);
		p1.add(lb3);
		p1.add(tx3);
		this.add(p1, BorderLayout.NORTH);
		this.add(start, BorderLayout.SOUTH);

		start.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("start ¹öÆ° Å¬¸¯ µÊ");
				Job1 job1 = new Job1();
				Thread t1 = new Thread(job1);

				Job2 job2 = new Job2();
				Thread t2 = new Thread(job2);
				t1.start();
				t2.start();
				
				tx3.setText(job1.sum + job2.sum + "");
				
			}
		});

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 200);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		System.out.println("main Start");
		
		try {
			Thread.sleep(1000*10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Thread05 t = new Thread05();
		System.out.println("main End");
	}

	class Job1 implements Runnable {
		int sum = 0;

		@Override
		public void run() {
			
			for (int i = 1; i < 5000; i = i + 2) {
				sum += i;
				tx1.setText(" ~ " + i + " =" + sum);
				System.out.println("È¦¼öÇÕ ~ " + i + " =" + sum);
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	class Job2 implements Runnable {
		int sum = 0;

		@Override
		public void run() {
			for (int i = 0; i < 5000; i = i + 2) {
				sum += i;
				tx2.setText("~ " + i + " =" + sum);
				System.out.println("Â¦¼öÇÕ ~ " + i + " =" + sum);
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
