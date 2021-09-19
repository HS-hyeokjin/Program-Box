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
	    A[0] = "101호"; A[1] = "102호"; A[2] = "103호";
	    B[0] = "101호"; B[1] = "102호"; B[2] = "103호";
	    C[0] = "101호"; C[1] = "102호"; C[2] = "103호";
	       }
	
	public static void printRoom(String room[]) {        //펜션 방 출력 메소드
		      for(int i=0; i<room.length; i++) {
		         System.out.print(" "+room[i]+" " );
		      }
		      System.out.println();
		   }
	
	public static void indexReserve(String reserve) {    //예약자 찾는 메소드
	      for(int i=0; i<2; i++) {
	    	  if (A[i].equals(reserve)) {
	    		  System.out.println("고객님은 A펜션에 " + (i+1) +  "번째 방인 10" + (i+1)+"호에 예약하셨습니다. 감사합니다.");
	    		  break;
	    	  }
	    	  else if (B[i].equals(reserve)) {
	    		  System.out.println("고객님은 B펜션에 " + (i+1) +  "번째 방인 10" + (i+1)+"호에 예약하셨습니다. 감사합니다.");
	    		  break;
	    	  }
	    	  else if (C[i].equals(reserve)) {
	    		  System.out.println("고객님은 C펜션에 " + (i+1) +  "번째 방인 10" + (i+1)+"호에 예약하셨습니다. 감사합니다.");
	    		  break;
	    	  }
	    	  else System.out.println("일치하는 예약자가 없습니다.");
	    	  break;
	      }
	      System.out.println();
	   }
	
	public static void indexCancel(String cancel) {      //예약 취소 메소드
		
		for(int i=0; i<2; i++) {
		  if (A[i].equals(cancel)) {
  		  System.out.println("고객님은 A펜션에 " + (i+1) +  "번째 방인 10" + (i+1)+"호에 예약하셨습니다.");
  		  System.out.println("예약을 취소하시겠습니까? (네/아니오)");
  		  String yesorno = scanner.next();
  		  	
  		  	if (yesorno.equals("네")) {
  		  		A[i] = (String)("10"+i);
  			  System.out.println("예약을 취소하였습니다.");

  		  	}
  		  	else if (yesorno.equals("아니오")) {
  			  break;
  		  	}
  		  	else {
  			  System.out.println("다시 입력해주세요.");
  		  	}

  		  	break;
		  }
		  
		  else if (B[i].equals(cancel)) {
  		  System.out.println("고객님은 B펜션에 " + (i+1) +  "번째 방인 10" + (i+1)+"호에 예약하셨습니다.");
  		  System.out.println("예약을 취소하시겠습니까? (네/아니오)");
  		  String yesorno = scanner.next();
  		  if (yesorno.equals("네")) {
  			A[i] = (String)("10"+i);
  			  System.out.println("예약을 취소하였습니다.");
  		  }
  		  else if (yesorno.equals("아니오")) {
  			  break;
  		  }
  		  else {
  			  System.out.println("다시 입력해주세요.");
  		  }
  		  break;
  	  }
		  
		  else if (C[i].equals(cancel)) {
  		  System.out.println("고객님은 C펜션에 " + (i+1) +  "번째 방인 10" + (i+1)+"호에 예약하셨습니다.");
  		  System.out.println("예약을 취소하시겠습니까? (네/아니오)");
  		  String yesorno = scanner.next();
  		  if (yesorno.equals("네")) {
  			A[i] = (String)("10"+i);
  			  System.out.println("예약을 취소하였습니다.");
  		  }
  		  else if (yesorno.equals("아니오")) {
  			  break;
  		  }
  		  else {
  			  System.out.println("다시 입력해주세요.");
  		  }
  		  break;
  	  }
  	  else System.out.println("일치하는 예약자가 없습니다.");
  	  break;
    }
    System.out.println();
 }

	
	
	public static void selectPension() {              //펜션 예약 메소드
	
        	System.out.println("예약자명을 입력해주세요."); 
			
        	String customerName = scanner.next();
			
        	System.out.println("펜션을 선택해주세요 A,B,C");
        	
	        String select = scanner.next();
	         
	         switch(select) {
	         	
	         case ("A"):
	        	System.out.println("예약하실 객실을 입력해주세요");
	         	System.out.println("-----------------------------");
	        	System.out.print("객실 : ");
	         	printRoom(Pension.A);
	         	System.out.println("-----------------------------");
		        String selectRoomA = scanner.next();
	         
		     switch(selectRoomA) {
	         case ("101호"):
	        	 A[0] = customerName;
	        	System.out.println("ㅁ예약완료ㅁ\n");
	         	break;
	         case ("102호"):
	        	 A[1] = customerName;
	        	System.out.println("ㅁ예약완료ㅁ\n");
	         	break;
	         case ("103호"):
	        	 A[2] = customerName;
	        	System.out.println("ㅁ예약완료ㅁ\n");
	         	break;
	         	default:
		            System.out.println("없는 방입니다.");
	         }
	         break;
		         
		      case ("B"):
		        	System.out.println("예약하실 객실을 입력해주세요");
	         	System.out.println("-----------------------------");
	        	System.out.print("객실 : ");
	         	printRoom(Pension.B);
	         	System.out.println("-----------------------------");
		        String selectRoomB = scanner.next();
		        
			     switch(selectRoomB) {
		         case ("101호"):
		        	 B[0] = customerName;
		        	System.out.println("ㅁ예약완료ㅁ\n");
		         	break;
		         case ("102호"):
		        	 B[1] = customerName;
		        	System.out.println("ㅁ예약완료ㅁ\n");
		         	break;
		         case ("103호"):
		        	 B[2] = customerName;
		        	System.out.println("ㅁ예약완료ㅁ\n");
		         	break;
		         	default:
			            System.out.println("없는 방입니다.");
		         }
			     break;
	         case ("C"): 
		        System.out.println("예약하실 객실을 입력해주세요");
	         	System.out.println("-----------------------------");
	        	System.out.print("객실 : ");
	         	printRoom(Pension.B);
	         	System.out.println("-----------------------------");
		        String selectRoomC = scanner.next();
		        
			     switch(selectRoomC) {
		         case ("101호"):
		        	 C[0] = customerName;
		        	System.out.println("ㅁ예약완료ㅁ\n");
		         	break;
		         case ("102호"):
		        	 C[1] = customerName;
		        	System.out.println("ㅁ예약완료ㅁ\n");
		         	break;
		         case ("103호"):
		        	 C[2] = customerName;
		        	System.out.println("ㅁ예약완료ㅁ\n");
		         	break;
		         default:
			            System.out.println("없는 방입니다.");
		         }
			     break;
			     
	         default:
	            System.out.println("다시 입력해 주세요.");
	         }
	}
	
	
	public static void viewReserve() {
    	
		System.out.println("예약자명을 입력해주세요.");

		String customerName = scanner.next();

		indexReserve(customerName);    	
		}
	
	public static void cancelReserve() {

		System.out.println("취소하실 예약자명을 입력해주세요.");
		
		String customerName = scanner.next();
		
		indexCancel(customerName);

	}
}
