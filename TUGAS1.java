public class TUGAS1 {
	public static void main(String[]args){
		//testing
		String pt = "AULIA SRI WAHYUNI UMAT";
		System.out.println("KALIMAT    :"+pt);
		 
		String ct = encript(pt);
		System.out.println("ENKRIPSI   :"+ct);
		
		String pt1 = decript(ct);
		System.out.println("DEKRIPSI   :"+pt1);
		
		
	}
	public static final String[] pt = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"," "};
	public static final String[] ct = {"D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","A","B","C"," "};
	
	
	public static String encript(String plaintext){
		String ciphertext = "";
		
		for(int i=0 ; i<plaintext.length(); i++){
			String s0 = plaintext.substring(i, i+1);
			String s1 = " ";							
			//
			for(int j=0; j<pt.length; j++){				
				if(s0.equals(pt[j])){					
					s1 = ct[j];
					break;
				}
			}
			ciphertext+=s1;
		}
				
		return ciphertext;
	}
	public static String decript(String ciphertext){
		String plaintext = "";
		//mencari sepanjang kata
				for(int i=0 ; i<ciphertext.length(); i++){
					String s0 = ciphertext.substring(i, i+1);
					String s1 = " ";							
			
					for(int j=0; j<ct.length; j++){				
						if(s0.equals(ct[j])){					
							s1 = pt[j];
							break;
						}
					}
					plaintext+=s1;
				}
		return plaintext;
	}
}
