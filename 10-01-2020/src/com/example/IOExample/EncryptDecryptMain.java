package com.example.IOExample;

import java.io.IOException;

public class EncryptDecryptMain {
public static void main(String [] args) throws IOException
{
	Rot13Encryption r13 = new Rot13Encryption();
	Decryptor d = new Decryptor();
	r13.encrypt("Normal", "Encrypted");
	d.decrypt("Encrypted", "Decrypted");

}
}
