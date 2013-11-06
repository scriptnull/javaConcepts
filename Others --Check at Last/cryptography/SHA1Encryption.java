package cryptography;

import java.security.MessageDigest;

public class SHA1Encryption {
	// This kind of encryption is used to encrypt passwords and store in databases
	// This is not for encrypting and decrypting messages for communication purpose 
	// if you are searching for an encrypt n decrypt Algorithm for sending data over network
	// then make sure to check RSA and AES algorithms 
	// Reference : http://www.herongyang.com/Cryptography/SHA1-Message-Digest-in-Java.html
	
	public static void main(String[] args) throws Exception {		
		MessageDigest md = MessageDigest.getInstance("SHA1");
		 System.out.println("Message digest object info: ");
        System.out.println("   Algorithm = "+md.getAlgorithm());
        System.out.println("   Provider = "+md.getProvider());
        System.out.println("   toString = "+md.toString());
        
        String input = "abcdefghijklmnopqrstuvwxyz";
        md.update(input.getBytes());	//updates the input for md
        byte[] encryptedBytes = md.digest();
        String output = bytesToHexString(encryptedBytes);
        System.out.println(output);
        
        if(output.equalsIgnoreCase("32D10C7B8CF96570CA04CE37F2A19D84240D3A89"))	//already known Hash
        {
        	System.out.println("They are Equal");
        	
        }
        

		

	}

	private static String bytesToHexString(byte[] encryptedBytes) {
		char[] hex = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < encryptedBytes.length; i++) {
			sb.append(hex[(encryptedBytes[i] >> 4) & (0x0f)]);	// check :  http://stackoverflow.com/questions/12989969/what-does-0x0f-mean-and-what-does-this-code-mean
			sb.append(hex[encryptedBytes[i] & 0x0f]);			
		}
		return sb.toString();
		
	}

}
