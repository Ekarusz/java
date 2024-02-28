package day3_02;

import javax.swing.JButton;
import javax.swing.JFrame;

// 전통적 의미의 상속은 '물려받아 확장한다'라는 개념이다

// JFrame : 프로그램의 외곽선?(만들어진 외곽선을 재사용하는 것이다)
class MyApp extends JFrame {
	public MyApp() {
		setSize(400, 300);
		// 종료버튼을 활성화
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new JButton("클릭"));
		setVisible(true);
	}
}

public class TestCopy {
	public static void main(String[] args) {
		new MyApp();
	}
}
