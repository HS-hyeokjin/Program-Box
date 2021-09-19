package pensionReserve;

import java.util.Scanner;

public class Pension {

	 public static Scanner scanner = new Scanner(System.in);
	 private static String A[] ;
	 private static String B[] ;
	 private static String C[] ;
	
	Pension(){
		A = new String[3];
		B = new String[3];
		C = new String[3];
	    A[0] = "101ȣ"; A[1] = "102ȣ"; A[2] = "103ȣ";
	    B[0] = "101ȣ"; B[1] = "102ȣ"; B[2] = "103ȣ";
	    C[0] = "101ȣ"; C[1] = "102ȣ"; C[2] = "103ȣ";
	       }
	
	public static void printRoom(String room[]) {        //��� �� ��� �޼ҵ�
		      for(int i=0; i<room.length; i++) {
		         System.out.print(" "+room[i]+" " );
		      }
		      System.out.println();
		   }
	
	public static void indexReserve(String reserve) {    //������ ã�� �޼ҵ�
	      for(int i=0; i<2; i++) {
	    	  if (A[i].equals(reserve)) {
	    		  System.out.println("������ A��ǿ� " + (i+1) +  "��° ���� 10" + (i+1)+"ȣ�� �����ϼ̽��ϴ�. �����մϴ�.");
	    		  break;
	    	  }
	    	  else if (B[i].equals(reserve)) {
	    		  System.out.println("������ B��ǿ� " + (i+1) +  "��° ���� 10" + (i+1)+"ȣ�� �����ϼ̽��ϴ�. �����մϴ�.");
	    		  break;
	    	  }
	    	  else if (C[i].equals(reserve)) {
	    		  System.out.println("������ C��ǿ� " + (i+1) +  "��° ���� 10" + (i+1)+"ȣ�� �����ϼ̽��ϴ�. �����մϴ�.");
	    		  break;
	    	  }
	    	  else System.out.println("��ġ�ϴ� �����ڰ� �����ϴ�.");
	    	  break;
	      }
	      System.out.println();
	   }
	
	public static void indexCancel(String cancel) {      //���� ��� �޼ҵ�
		
		for(int i=0; i<2; i++) {
		  if (A[i].equals(cancel)) {
  		  System.out.println("������ A��ǿ� " + (i+1) +  "��° ���� 10" + (i+1)+"ȣ�� �����ϼ̽��ϴ�.");
  		  System.out.println("������ ����Ͻðڽ��ϱ�? (��/�ƴϿ�)");
  		  String yesorno = scanner.next();
  		  	
  		  	if (yesorno.equals("��")) {
  		  		A[i] = (String)("10"+i);
  			  System.out.println("������ ����Ͽ����ϴ�.");

  		  	}
  		  	else if (yesorno.equals("�ƴϿ�")) {
  			  break;
  		  	}
  		  	else {
  			  System.out.println("�ٽ� �Է����ּ���.");
  		  	}

  		  	break;
		  }
		  
		  else if (B[i].equals(cancel)) {
  		  System.out.println("������ B��ǿ� " + (i+1) +  "��° ���� 10" + (i+1)+"ȣ�� �����ϼ̽��ϴ�.");
  		  System.out.println("������ ����Ͻðڽ��ϱ�? (��/�ƴϿ�)");
  		  String yesorno = scanner.next();
  		  if (yesorno.equals("��")) {
  			A[i] = (String)("10"+i);
  			  System.out.println("������ ����Ͽ����ϴ�.");
  		  }
  		  else if (yesorno.equals("�ƴϿ�")) {
  			  break;
  		  }
  		  else {
  			  System.out.println("�ٽ� �Է����ּ���.");
  		  }
  		  break;
  	  }
		  
		  else if (C[i].equals(cancel)) {
  		  System.out.println("������ C��ǿ� " + (i+1) +  "��° ���� 10" + (i+1)+"ȣ�� �����ϼ̽��ϴ�.");
  		  System.out.println("������ ����Ͻðڽ��ϱ�? (��/�ƴϿ�)");
  		  String yesorno = scanner.next();
  		  if (yesorno.equals("��")) {
  			A[i] = (String)("10"+i);
  			  System.out.println("������ ����Ͽ����ϴ�.");
  		  }
  		  else if (yesorno.equals("�ƴϿ�")) {
  			  break;
  		  }
  		  else {
  			  System.out.println("�ٽ� �Է����ּ���.");
  		  }
  		  break;
  	  }
  	  else System.out.println("��ġ�ϴ� �����ڰ� �����ϴ�.");
  	  break;
    }
    System.out.println();
 }

	
	
	public static void selectPension() {              //��� ���� �޼ҵ�
	
        	System.out.println("�����ڸ��� �Է����ּ���."); 
			
        	String customerName = scanner.next();
			
        	System.out.println("����� �������ּ��� A,B,C");
        	
	        String select = scanner.next();
	         
	         switch(select) {
	         	
	         case ("A"):
	        	System.out.println("�����Ͻ� ������ �Է����ּ���");
	         	System.out.println("-----------------------------");
	        	System.out.print("���� : ");
	         	printRoom(Pension.A);
	         	System.out.println("-----------------------------");
		        String selectRoomA = scanner.next();
	         
		     switch(selectRoomA) {
	         case ("101ȣ"):
	        	 A[0] = customerName;
	        	System.out.println("������Ϸᤱ\n");
	         	break;
	         case ("102ȣ"):
	        	 A[1] = customerName;
	        	System.out.println("������Ϸᤱ\n");
	         	break;
	         case ("103ȣ"):
	        	 A[2] = customerName;
	        	System.out.println("������Ϸᤱ\n");
	         	break;
	         	default:
		            System.out.println("���� ���Դϴ�.");
	         }
	         break;
		         
		      case ("B"):
		        	System.out.println("�����Ͻ� ������ �Է����ּ���");
	         	System.out.println("-----------------------------");
	        	System.out.print("���� : ");
	         	printRoom(Pension.B);
	         	System.out.println("-----------------------------");
		        String selectRoomB = scanner.next();
		        
			     switch(selectRoomB) {
		         case ("101ȣ"):
		        	 B[0] = customerName;
		        	System.out.println("������Ϸᤱ\n");
		         	break;
		         case ("102ȣ"):
		        	 B[1] = customerName;
		        	System.out.println("������Ϸᤱ\n");
		         	break;
		         case ("103ȣ"):
		        	 B[2] = customerName;
		        	System.out.println("������Ϸᤱ\n");
		         	break;
		         	default:
			            System.out.println("���� ���Դϴ�.");
		         }
			     break;
	         case ("C"): 
		        System.out.println("�����Ͻ� ������ �Է����ּ���");
	         	System.out.println("-----------------------------");
	        	System.out.print("���� : ");
	         	printRoom(Pension.B);
	         	System.out.println("-----------------------------");
		        String selectRoomC = scanner.next();
		        
			     switch(selectRoomC) {
		         case ("101ȣ"):
		        	 C[0] = customerName;
		        	System.out.println("������Ϸᤱ\n");
		         	break;
		         case ("102ȣ"):
		        	 C[1] = customerName;
		        	System.out.println("������Ϸᤱ\n");
		         	break;
		         case ("103ȣ"):
		        	 C[2] = customerName;
		        	System.out.println("������Ϸᤱ\n");
		         	break;
		         default:
			            System.out.println("���� ���Դϴ�.");
		         }
			     break;
			     
	         default:
	            System.out.println("�ٽ� �Է��� �ּ���.");
	         }
	}
	
	
	public static void viewReserve() {
    	
		System.out.println("�����ڸ��� �Է����ּ���.");

		String customerName = scanner.next();

		indexReserve(customerName);    	
		}
	
	public static void cancelReserve() {

		System.out.println("����Ͻ� �����ڸ��� �Է����ּ���.");
		
		String customerName = scanner.next();
		
		indexCancel(customerName);

	}
}
