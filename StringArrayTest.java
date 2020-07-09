package trivera.storage;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class StringArrayTest {

	@BeforeAll
	public static void log() {
		System.out.println("Exercise: DynamicArray");
		System.out.println("Type: solution-code");
		System.out.println("Java: " + System.getProperty("java.version"));
	}

	//CODE7:create unit test to test the StringArray() implementation
    @Test
    public void testSize() {
        StringArray array = new StringArray();
        int size = array.size();
        assertEquals(0, size);
    }

    @Test
    public void testSize1() {
        StringArray array = new StringArray();
        array.add("A");
        int size = array.size();

        assertEquals(1, size);
    }

    @Test
    public void testSizeAfterRemove() {
        StringArray array = new StringArray();
        array.add("A");
        array.remove("A");
        int size = array.size();

        assertEquals(0, size);
    }

    @Test
    public void testAdd() {
        StringArray array = new StringArray();
        for (int i = 0; i < 100; i++) {
            array.add("A");
        }
        int size = array.size();

        assertEquals(100, size);
    }

    @Test
    public void testGet() {
        StringArray array = new StringArray();
        array.add("A");
        array.add("B");
        Object object0 = array.get(0);
        Object object1 = array.get(1);

        assertEquals(object0, "A");
        assertEquals(object1, "B");
    }

    @Test
    public void testRemove() {
        StringArray array = new StringArray();
        array.add("A");
        array.add("B");
        array.add("B");
        array.add("C");
        array.remove("B");
        int size = array.size();

        assertEquals(2, size);
        assertEquals("A", array.get(0));
        assertEquals("C", array.get(1));
    }

    @Test
    public void testClear() {
        StringArray array = new StringArray();
        array.add("A");
        array.add("B");
        array.clear();
        int size = array.size();

        assertEquals(0, size);
    }

    @Test
    public void testArrayReuse() {
        StringArray array = new StringArray();
        array.add("A");
        array.add("B");
        array.clear();
        array.add("C");

        assertEquals("C", array.get(0));
    }

