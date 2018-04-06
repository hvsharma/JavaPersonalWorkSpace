import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Arrays;

import sun.security.rsa.RSAPrivateCrtKeyImpl;

public class Cryptic {

	public static void main(String[] args) throws NoSuchAlgorithmException, IOException, InvalidKeySpecException {
		
		//RSAPublicKey publicKey = (RSAPublicKey)kp.getPublic();
		//RSAPrivateKey privateKey = (RSAPrivateKey)kp.getPrivate();
		
		byte[] keyBytes = Files.readAllBytes(Paths.get("D:/private_key.der"));
	    PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(keyBytes);
		KeyFactory kf = KeyFactory.getInstance("RSA");
		RSAPrivateKey privateKey = (RSAPrivateKey) kf.generatePrivate(spec);
		
		keyBytes = Files.readAllBytes(Paths.get("D:/public_key.der"));
	    spec = new PKCS8EncodedKeySpec(keyBytes);
		kf = KeyFactory.getInstance("RSA");
		RSAPublicKey publicKey = (RSAPublicKey) kf.generatePublic(spec);
		
		
		
	    System.getenv("XRX_CONF");
		
	    
		
	}
	

}
