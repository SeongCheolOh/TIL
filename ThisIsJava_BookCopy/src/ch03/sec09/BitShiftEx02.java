package ch03.sec09;

public class BitShiftEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 772;
		//�������� 3byte(24bit) �̵��ϰ� �� 1����Ʈ�� �б�
		byte byte1 = (byte)(value >>> 24);
		int int1 = byte1 & 255;
		System.out.println(int1);
		
		//�������� 2byte(16bit) �̵��ϰ� �� 1����Ʈ�� �б�
		byte1 = (byte)(value >>> 16);
		int1 = Byte.toUnsignedInt(byte1);
		System.out.println(int1);
		
		//�������� 1byte(8bit) �̵��ϰ� �� 1����Ʈ�� �б�
		byte1 = (byte)(value >>> 8);
		int1 = Byte.toUnsignedInt(byte1);
		System.out.println(int1);
		
		//�� 1byte�� �б�
		byte1 = (byte)value;
		int1 = Byte.toUnsignedInt(byte1);
		System.out.println(int1);

	}

}
