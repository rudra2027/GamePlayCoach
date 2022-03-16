import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("Upon initalizing MinMaxFinderTest, ")
class assignment_test {

	MINMAXFINDER minMaxFinder;
	static List<Integer> list;
	
	@BeforeEach
	void Init() {
		minMaxFinder = new MINMAXFINDER(0, 0);
		list = new ArrayList<Integer>();
		list.add(10);
		list.add(50);
		list.add(20);
		list.add(60);
		list.add(30);
		list.add(1);
	}
	
	@Nested
	class TestingSeperately {
		@Test
		@DisplayName("Tests if length is 2")
		void testSize() {
			assertEquals(2, minMaxFinder.findminmax(list).size(),"returns the right size");
		}
		
		@Test
		@DisplayName("Tests if min max, match")
		void testMinMax() {
			assertAll(
					() -> assertEquals(1, minMaxFinder.findminmax(list).get(0) ,"returns the right minimum value"),
					() -> assertEquals(60, minMaxFinder.findminmax(list).get(1),"returns the right maximum value")
				);
		}
		
		@Test
		@DisplayName("Tests object generated for min, max")
		void testObject() {
			
			minMaxFinder = new MINMAXFINDER(minMaxFinder.findminmax(list).get(0), minMaxFinder.findminmax(list).get(1));
			
			assertAll(
					() -> assertEquals(1, minMaxFinder.getMin() ,"returns the right minimum value"),
					() -> assertEquals(60, minMaxFinder.getMax(),"returns the right maximum value")
				);
		}
	}
	}
