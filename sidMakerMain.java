import java.util.UUID;

class sidMakerMain{

	public static void main(String[] args){
	
	System.out.println("ID RANDOM:");
	sidMaker();
	}

	public static void sidMaker(){
	for(int i=0; i<10; i++ ){	
		String uuid = UUID.randomUUID().toString();
		System.out.println("id = " + uuid);
		}
	}	
}
