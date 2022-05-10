package TestNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestXml {

	@Test
	@Parameters({ "file" })
	public void test1(String file) {
		System.out.println(file);
	}

	@Test
	@Parameters({ "a", "b" })

	public void test2(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}

	@Test
	public void atest3(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}

}
