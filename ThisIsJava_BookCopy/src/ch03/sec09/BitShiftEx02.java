package ch03.sec09;

public class BitShiftEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 772;
		//우측으로 3byte(24bit) 이동하고 끝 1바이트만 읽기
		byte byte1 = (byte)(value >>> 24);
		int int1 = byte1 & 255;
		System.out.println(int1);
		
		//우측으로 2byte(16bit) 이동하고 끝 1바이트만 읽기
		byte1 = (byte)(value >>> 16);
		int1 = Byte.toUnsignedInt(byte1);
		System.out.println(int1);
		
		//우측으로 1byte(8bit) 이동하고 끝 1바이트만 읽기
		byte1 = (byte)(value >>> 8);
		int1 = Byte.toUnsignedInt(byte1);
		System.out.println(int1);
		
		//끝 1byte만 읽기
		byte1 = (byte)value;
		int1 = Byte.toUnsignedInt(byte1);
		System.out.println(int1);

	}

}
