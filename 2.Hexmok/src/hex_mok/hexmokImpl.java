package hex_mok;

public class hexmokImpl implements hexmokInterface {
	int[][] omok = new int[19][19];

	@Override
	public void viewhexmok() {		
		int numY = 0;				
		
		int numX = 96;				
		
		for(int[] i : omok) {
			numY++;
			
			System.out.print(numY < 10 ? numY + " " : numY);

			for(int j : i) {
				if(j == 1) {
					System.out.print(" ¡Ü");	
					// Èæµ¹ 
				} else if(j == 2) {
					System.out.print(" ¡Û"); 
					// ¹éµ¹ 
				} else if(j == 3) {
					System.out.print(" ¢Â");
					// Ã»µ¹ 
				} else {
					System.out.print(" ¤ý"); 
				}
			}
			System.out.print("\n");
		}
		
		System.out.print("  ");
		
		for(int[] i : omok) {
			numX++;
			System.out.print("¤Ó"+(char)numX);
		}
		
		System.out.print("\n");
	}	
	@Override

	public int hexmokAction(char x, int y, int turn) {
		int chX = ((int) x) - 97;

		int chY = --y;
		
		int count = 0;
		
		int _x,_y = 0;
		
		String name = new String();

		if (turn == 1)
			name = "Èæµ¹";
		else if (turn ==2)
			name = "¹éµ¹";
		else
			name = "Ã»µ¹";
		
		if( omok[chY][chX] != 0 ) {
			System.out.println("ÀÌ¹Ì µ¹ÀÌ ¼³Ä¡µÇ¾î ÀÖ½À´Ï´Ù.");
			return 0;
		} else {
			omok[chY][chX] = turn;
		}
		
		_x = chX;
		_y = chY;
		count = 0;
		while(omok[_y][_x] == turn && _x > 0) {
			_x--;
		}
		while(omok[_y][++_x] == turn && _x <= 10) {
			count++;
		}
		if(count == 6) {
			System.out.println(name + "½Â¸®");
			return 1;
		}
		
		_x = chX;
		_y = chY;
		count = 0;
		while(omok[_y][_x] == turn && _y > 0) {
			_y--;
		}
		while(omok[++_y][_x] == turn && _y <= 10) {
			count++;
		}
		if(count == 6) {
			System.out.println(name + "½Â¸®");
			return 1;
		}
		
		_x = chX;
		_y = chY;
		count = 0;
		while(omok[_y][_x] == turn && _y > 0 && _x > 0) {
			_y--;
			_x--;
		}
		while(omok[++_y][++_x] == turn && _y <= 10 && _x <= 10) {
			count++;
		}
		if(count == 6) {
			System.out.println(name + "½Â¸®");
			return 1;
		}
		
		_x = chX;
		_y = chY;
		count = 0;
		while(omok[_y][_x] == turn && _y > 0 && _x > 0) {
			_y++;
			_x--;
		}
		while(omok[--_y < 0 ? 0 : _y][++_x] == turn && _y <= 16 && _x <= 16) {

			count++;
		}
		if(count == 6) {
			System.out.println(name + "½Â¸®");
			return 1;
		}
		
		return 0;
	}
}