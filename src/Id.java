// 97, see inside
//Test git
import javax.swing.border.LineBorder;
import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Id312468929 extends JApplet {
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		JFrame frame = new JFrame("MovingBalls");
		Id312468929 applet = new Id312468929();
		frame.add(applet, BorderLayout.CENTER);
		frame.add(applet, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 1000);
		frame.setAlwaysOnTop(true);
		frame.setVisible(true);
	}


	public Id312468929() {
		add(new BallControlAAA());
	}
}

class BallControlAAA extends JPanel {
	private static final long serialVersionUID = 1L;
	private JButton jbtSuspendUpL = new JButton("Suspend");
	private JButton jbtResumeUpL = new JButton("Resume");
	private JButton jbtAddUpL = new JButton("+1");
	private JButton jbtSubtractUpL = new JButton("-1");
	private JButton jbtSuspendDownL = new JButton("Suspend");
	private JButton jbtResumeDownL = new JButton("Resume");
	private JButton jbtAddDownL = new JButton("+1");
	private JButton jbtSubtractDownL = new JButton("-1");
	private JButton jbtSuspendUpR = new JButton("Suspend");
	private JButton jbtResumeUpR = new JButton("Resume");
	private JButton jbtAddUpR = new JButton("+1");
	private JButton jbtSubtractUpR = new JButton("-1");
	private JButton jbtSuspendDownR = new JButton("Suspend");
	private JButton jbtResumeDownR = new JButton("Resume");
	private JButton jbtAddDownR = new JButton("+1");
	private JButton jbtSubtractDownR = new JButton("-1");
	private JTextField leftUpNumOfBalls = new JTextField();
	private JTextField rightUpNumOfBalls = new JTextField();
	private JTextField leftDownNumOfBalls = new JTextField();
	private JTextField rightDownNumOfBalls = new JTextField();
	private JScrollBar jsbdelayLRUpDown = new JScrollBar();
	private JLabel jlbDelay = new JLabel("Delay time (ms): ");
	private JTextField delayTime = new JTextField();
	private JLabel jlbRadius = new JLabel("Radius (pixels): ");
	private JTextField radiusLength = new JTextField();
	private BallPanelAAA ballPanel = new BallPanelAAA(leftUpNumOfBalls, rightUpNumOfBalls, leftDownNumOfBalls,
			rightDownNumOfBalls, delayTime, radiusLength);
	private JPanel managerPanel = new JPanel();
	private JPanel scrollBarPanel = new JPanel();
	private JPanel speedAndRadius = new JPanel();

	public BallControlAAA() {
		managerPanel.setLayout(new GridLayout(4, 7, 5, 5));
		managerPanel.add(new JLabel("Up Left Balls"));
		managerPanel.add(jbtSuspendUpL);
		managerPanel.add(jbtResumeUpL);
		managerPanel.add(jbtAddUpL);
		managerPanel.add(jbtSubtractUpL);
		managerPanel.add(new JLabel("number of Up Left Balls"));
		managerPanel.add(leftUpNumOfBalls);
		managerPanel.add(new JLabel("Up Right Balls"));
		managerPanel.add(jbtSuspendUpR);
		managerPanel.add(jbtResumeUpR);
		managerPanel.add(jbtAddUpR);
		managerPanel.add(jbtSubtractUpR);
		managerPanel.add(new JLabel("number of Up Right Balls"));
		managerPanel.add(rightUpNumOfBalls);
		managerPanel.add(new JLabel("Down Left Balls"));
		managerPanel.add(jbtSuspendDownL);
		managerPanel.add(jbtResumeDownL);
		managerPanel.add(jbtAddDownL);
		managerPanel.add(jbtSubtractDownL);
		managerPanel.add(new JLabel("number of Down Left Balls"));
		managerPanel.add(leftDownNumOfBalls);
		managerPanel.add(new JLabel("Down Right Balls"));
		managerPanel.add(jbtSuspendDownR);
		managerPanel.add(jbtResumeDownR);
		managerPanel.add(jbtAddDownR);
		managerPanel.add(jbtSubtractDownR);
		managerPanel.add(new JLabel("number of Down Right Balls"));
		managerPanel.add(rightDownNumOfBalls);

		ballPanel.setBorder(new LineBorder(Color.red));
		jsbdelayLRUpDown.setOrientation(JScrollBar.HORIZONTAL);
		ballPanel.setdelayLRUpDown(jsbdelayLRUpDown.getMaximum());
		speedAndRadius.setLayout(new GridLayout(1, 5, 5, 5));
		delayTime.setText("" + ballPanel.getdelayLRUpDown());
		radiusLength.setText("" + ballPanel.getRadius());
		speedAndRadius.add(jlbDelay);
		speedAndRadius.add(delayTime);
		speedAndRadius.add(new JLabel());
		speedAndRadius.add(jlbRadius);
		speedAndRadius.add(radiusLength);
		scrollBarPanel.setLayout(new GridLayout(3, 1, 5, 5));
		scrollBarPanel.add(new JLabel("Speed ScrollBar"));
		scrollBarPanel.add(jsbdelayLRUpDown);
		scrollBarPanel.add(speedAndRadius);
		setLayout(new BorderLayout());
		add(scrollBarPanel, BorderLayout.NORTH);
		add(ballPanel, BorderLayout.CENTER);
		add(managerPanel, BorderLayout.SOUTH);

		jbtAddUpL.addActionListener(new ActionListener() {// add up right ball

			@Override
			public void actionPerformed(ActionEvent e) {

				ballPanel.addUpLeft();

			}
		});
		jbtAddUpR.addActionListener(new ActionListener() {// add up right ball

			@Override
			public void actionPerformed(ActionEvent e) {

				ballPanel.addUpRight();

			}
		});
		jbtAddDownL.addActionListener(new ActionListener() {// add down left
															// ball

			@Override
			public void actionPerformed(ActionEvent e) {

				ballPanel.addDownLeft();

			}
		});
		jbtAddDownR.addActionListener(new ActionListener() {// add down right
															// ball

			@Override
			public void actionPerformed(ActionEvent e) {

				ballPanel.addDownRight();

			}
		});

		jbtSubtractUpL.addActionListener(new ActionListener() {// Subtract up
																// left ball

			@Override
			public void actionPerformed(ActionEvent e) {

				ballPanel.subtractUpLeft();

			}
		});
		jbtSubtractDownL.addActionListener(new ActionListener() {// Subtract
																	// down left
																	// ball

			@Override
			public void actionPerformed(ActionEvent e) {

				ballPanel.subtractDownLeft();

			}
		});
		jbtSubtractUpR.addActionListener(new ActionListener() {// Subtract up
																// right ball

			@Override
			public void actionPerformed(ActionEvent e) {

				ballPanel.subtractUpRight();

			}
		});
		jbtSubtractDownR.addActionListener(new ActionListener() {// Subtract
																	// down
																	// right

			@Override
			public void actionPerformed(ActionEvent e) {

				ballPanel.subtractDownRight();

			}
		});

		jbtSuspendUpL.addActionListener(new ActionListener() {// Suspend up left
																// ball

			@Override
			public void actionPerformed(ActionEvent e) {

				ballPanel.suspendUpLeft();

			}
		});
		jbtSuspendDownL.addActionListener(new ActionListener() {// Suspend down
																// left ball

			@Override
			public void actionPerformed(ActionEvent e) {

				ballPanel.suspendDownLeft();

			}
		});
		jbtSuspendUpR.addActionListener(new ActionListener() {// Suspend up
																// right ball

			@Override
			public void actionPerformed(ActionEvent e) {

				ballPanel.suspendUpRight();

			}
		});
		jbtSuspendDownR.addActionListener(new ActionListener() {// Suspend down
																// right ball

			@Override
			public void actionPerformed(ActionEvent e) {

				ballPanel.suspendDownRight();

			}
		});

		jbtResumeUpL.addActionListener(new ActionListener() {// Resume up left
																// ball

			@Override
			public void actionPerformed(ActionEvent e) {

				ballPanel.resumeUpLeft();

			}
		});
		jbtResumeDownL.addActionListener(new ActionListener() {// Resume down
																// left ball

			@Override
			public void actionPerformed(ActionEvent e) {

				ballPanel.resumeDownLeft();

			}
		});
		jbtResumeUpR.addActionListener(new ActionListener() {// Resume up right
																// ball

			@Override
			public void actionPerformed(ActionEvent e) {

				ballPanel.resumeUpRight();

			}
		});
		jbtResumeDownR.addActionListener(new ActionListener() {// Resume up left
																// ball

			@Override
			public void actionPerformed(ActionEvent e) {

				ballPanel.resumeDownRight();

			}
		});

		jsbdelayLRUpDown.addAdjustmentListener(new AdjustmentListener() {
			public void adjustmentValueChanged(AdjustmentEvent e) {
				ballPanel.setdelayLRUpDown(jsbdelayLRUpDown.getMaximum() - e.getValue());// set
																							// the
																							// delay
																							// according
																							// to
																							// the
																							// scroll
				delayTime.setText("" + ballPanel.getdelayLRUpDown()); // set the
																		// delay
																		// text
																		// fled
			}
		});

	}

}

class BallPanelAAA extends JPanel {
	private static final long serialVersionUID = 1L;
	final static int PageDownAndUpDoClick = 5;
	private JTextField numOfLeftUpBalls;
	private JTextField numOfRightUpBalls;
	private JTextField numOfLeftDownBalls;
	private JTextField numOfRightDownBalls;
	private JTextField radiusLength;
	private int delayLRUpDown = 100;
	private Timer timerUpL = new Timer(delayLRUpDown, new timerUpListenerLeft());
	private Timer timerUpR = new Timer(delayLRUpDown, new timerUpListenerRight());
	private Timer timerDownL = new Timer(delayLRUpDown, new timerDownListenerLeft());
	private Timer timerDownR = new Timer(delayLRUpDown, new timerDownListenerRight());
	private ArrayList<SingleBallLAAA> listUpL = new ArrayList<>();
	private ArrayList<SingleBallLAAA> listUpR = new ArrayList<>();
	private ArrayList<SingleBallLAAA> listDownL = new ArrayList<>();
	private ArrayList<SingleBallLAAA> listDownR = new ArrayList<>();
	private int radius = 5;

	public BallPanelAAA(JTextField numOfLeftUpBalls, JTextField numOfRightUpBalls, JTextField numOfLeftDownBalls,
			JTextField numOfRightDownBalls, JTextField delayTime, JTextField radiusLength) {
		this.numOfLeftUpBalls = numOfLeftUpBalls;
		this.numOfRightUpBalls = numOfRightUpBalls;
		this.numOfLeftDownBalls = numOfLeftDownBalls;
		this.numOfRightDownBalls = numOfRightDownBalls;
		this.radiusLength = radiusLength;
		timerUpL.start();
		timerUpR.start();
		timerDownL.start();
		timerDownR.start();

		addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_UP:
					addUpLeft();
					addDownLeft();
					addUpRight();
					addDownRight();
					break;

				case KeyEvent.VK_DOWN:
					subtractUpLeft();
					subtractDownLeft();
					subtractUpRight();
					subtractDownRight();

				}
			}
		});
		addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (e.getButton() == MouseEvent.BUTTON1) {

					setRadius(getRadius() + 1);

				}
				// -- else is missing do every time both checks -3
				if (e.getButton() == MouseEvent.BUTTON3) {

					setRadius(getRadius() - 1);

				}
			}
		});
	}

	public void addUpLeft() {

		listUpL.add(new SingleBallLAAA(0, 0, 2, 2));
		setTextNumberOfBalls();

	}

	public void addDownLeft() {
		listDownL.add(new SingleBallLAAA(0, getHeight(), 2, 2));
		setTextNumberOfBalls();
	}

	public void addUpRight() {
		listUpR.add(new SingleBallLAAA(getWidth(), 0, 2, 2));
		setTextNumberOfBalls();
	}

	public void addDownRight() {
		listDownR.add(new SingleBallLAAA(getWidth(), getHeight(), 2, 2));
		setTextNumberOfBalls();
	}

	public void subtractUpLeft() {
		if (listUpL.size() > 0)
			listUpL.remove(listUpL.size() - 1);
		setTextNumberOfBalls();
		repaint();
	}

	public void subtractDownLeft() {
		if (listDownL.size() > 0)
			listDownL.remove(listDownL.size() - 1);
		setTextNumberOfBalls();
		repaint();
	}

	public void subtractUpRight() {
		if (listUpR.size() > 0)
			listUpR.remove(listUpR.size() - 1);
		setTextNumberOfBalls();
		repaint();
	}

	public void subtractDownRight() {
		if (listDownR.size() > 0)
			listDownR.remove(listDownR.size() - 1);
		setTextNumberOfBalls();
		repaint();
	}

	private void setTextNumberOfBalls() {
		if (listUpL != null)
			numOfLeftUpBalls.setText("" + listUpL.size());
		if (listUpR != null)
			numOfRightUpBalls.setText("" + listUpR.size());
		if (listDownL != null)
			numOfLeftDownBalls.setText("" + listDownL.size());
		if (listDownR != null)
			numOfRightDownBalls.setText("" + listDownR.size());
		setANDrequestFocus();
	}

	private void setTextRadius() {
		radiusLength.setText("" + getRadius());
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (int i = 0; i < listUpL.size(); i++) {
			SingleBallLAAA ball = (SingleBallLAAA) listUpL.get(i);
			g.setColor(ball.color);
			if (timerUpL.isRunning())
				setXandY(ball);
			drawBall(g, ball);
		}
		for (int i = 0; i < listUpR.size(); i++) {
			SingleBallLAAA ball = (SingleBallLAAA) listUpR.get(i);
			g.setColor(ball.color);
			if (timerUpR.isRunning())
				setXandY(ball);
			drawBall(g, ball);
		}
		for (int i = 0; i < listDownL.size(); i++) {
			SingleBallLAAA ball = (SingleBallLAAA) listDownL.get(i);
			g.setColor(ball.color);
			if (timerDownL.isRunning())
				setXandY(ball);
			drawBall(g, ball);
		}
		for (int i = 0; i < listDownR.size(); i++) {
			SingleBallLAAA ball = (SingleBallLAAA) listDownR.get(i);
			g.setColor(ball.color);
			if (timerDownR.isRunning())
				setXandY(ball);
			drawBall(g, ball);
		}
		setANDrequestFocus();
	}

	private void setXandY(SingleBallLAAA ball) {
		if (ball.x < radius)
			ball.dx = Math.abs(ball.dx);
		if (ball.x > getWidth() - radius)
			ball.dx = -Math.abs(ball.dx);
		if (ball.y < radius)
			ball.dy = Math.abs(ball.dy);
		if (ball.y > getHeight() - radius)
			ball.dy = -Math.abs(ball.dy);
		ball.x += ball.dx;
		ball.y += ball.dy;
	}

	private void drawBall(Graphics g, SingleBallLAAA ball) {
		g.fillOval(ball.x - radius, ball.y - radius, radius * 2, radius * 2);
	}

	public void suspendUpLeft() {
		timerUpL.stop();
	}

	public void resumeUpLeft() {
		timerUpL.start();
	}

	public void suspendUpRight() {
		timerUpR.stop();
	}

	public void resumeUpRight() {
		timerUpR.start();
	}

	public void suspendDownLeft() {
		timerDownL.stop();
	}

	public void resumeDownLeft() {
		timerDownL.start();
	}

	public void suspendDownRight() {
		timerDownR.stop();
	}

	public void resumeDownRight() {
		timerDownR.start();
	}

	public void setdelayLRUpDown(int delayLRUpDown) {
		this.delayLRUpDown = delayLRUpDown;
		timerUpL.setDelay(delayLRUpDown);
		timerUpR.setDelay(delayLRUpDown);
		timerDownL.setDelay(delayLRUpDown);
		timerDownR.setDelay(delayLRUpDown);
	}

	public int getdelayLRUpDown() {
		return delayLRUpDown;
	}

	public void setRadius(int radius) {
		if (radius < 0)
			radius = 0;
		this.radius = radius;
		setTextRadius();
		setANDrequestFocus();
	}

	public int getRadius() {
		return radius;
	}

	private void setANDrequestFocus() {
		setFocusable(true);
		requestFocusInWindow();
	}

	private class timerUpListenerLeft implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			repaint();
		}
	}

	private class timerUpListenerRight implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			repaint();
		}
	}

	private class timerDownListenerLeft implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			repaint();
		}
	}

	private class timerDownListenerRight implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			repaint();
		}
	}
}

class SingleBallLAAA {
	int x;
	int y;
	int dx;
	int dy;
	Color color = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));

	SingleBallLAAA(int x, int y, int dx, int dy) {
		this.x = x;
		this.y = y;
		this.dx = dx;
		this.dy = dy;
	}
}
