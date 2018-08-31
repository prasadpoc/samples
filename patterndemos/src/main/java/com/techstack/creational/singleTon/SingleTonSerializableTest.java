package com.techstack.creational.singleTon;

/**
 * This is to test serializable SingleTon if not use readResolve
 * @author prasadt
 * 
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 * The Class Test.
 * 
 * @author prasadt
 * @version 1.0
 * 
 */
public class SingleTonSerializableTest {

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String... args) {
		SingleTonSerializable singleTon1 = SingleTonSerializable.getInstance();
		SingleTonSerializable singleTon2 = SingleTonSerializable.getInstance();
		ObjectOutput output = null;
		ObjectInput input = null;
		try {
			output = new ObjectOutputStream(new FileOutputStream("sample.json"));
			output.writeObject(singleTon1);
			output.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			input = new ObjectInputStream(new FileInputStream("sample.json"));
			singleTon2 = (SingleTonSerializable) input.readObject();
			input.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// See if both hash is equal or not
		System.out.println(singleTon1);
		System.out.println(singleTon2);

	}
}
