package cryptography;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class AESEncrypt {

	//very Simple Example of AES implementation
	//needs code refinement in future 
	public static void main(String[] args) throws Exception {
		
		//encryption
		byte[] x = encrypt("0123456789abcdef");	//length must be multiple of 16 
		System.out.println("Encrypted Message :");
		System.out.println("-------------------");
		System.out.println(x.toString());
		
		System.out.println();
		
		//decryption
		String s = decrypt(x);		
		System.out.println("Decrypted Message :");
		System.out.println("-------------------");
		System.out.println(s);
		
	}

	

	private static byte[] encrypt(String str) throws Exception {
		String mykey =  "0123456789abcdef";	//multiple of 16 //get the Key as method parameter //need completion
		Cipher cp = Cipher.getInstance("AES");
		cp.init(Cipher.ENCRYPT_MODE , new SecretKeySpec(mykey.getBytes(),"AES"));		
		return cp.doFinal(str.getBytes());
		
	}
	
	private static String decrypt(byte[] x) throws Exception {
		String mykey =  "0123456789abcdef";	//get key from user
		Cipher cp = Cipher.getInstance("AES");
		cp.init(Cipher.DECRYPT_MODE , new SecretKeySpec(mykey.getBytes(),"AES"));		
		return new String(cp.doFinal(x));
	}






	
	
}
