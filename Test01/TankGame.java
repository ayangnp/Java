package Test01;

public class TankGame {
	public static void main (String [] args) {
		final int WINDOW_WIDTH = 800;
		final int WINDOW_HEIGHT= 800;
		final float PI = 3.1415926F;
		int x = 0;
		int y = 0;
		int w = 50; int h = 50;
		int speed = 10;
		boolean isLive = true;
		float direction = PI/4;
		int bulletSpeed = speed*2;
		System.out.println("̹�˵�ǰλ�ã�x=" +x+"y="+y);
		System.out.println("̹�����Һ����˶�һ֡");
		x=x+speed;
		System.out.println("̹�˵�ǰλ�ã�x1=" +x+" y1=" +y);
		System.out.println("̹�����������˶�һ֡");
		y+=speed;
		System.out.println("̹�˵�ǰλ��: x2=" +x+" y2=" +y);
		System.out.println("̹��б��45���˶�һ֡");
		x+=speed; Math.cos(direction);
		System.out.println("̹�˵�ǰλ�ã�x3=" +x+" y3=" +y);
	}

}
