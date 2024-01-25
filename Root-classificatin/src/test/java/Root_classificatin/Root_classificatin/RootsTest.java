package Root_classificatin.Root_classificatin;

import static org.junit.Assert.*;

import org.junit.Test;

public class RootsTest {
	Roots root;

	@Test
	public void testPartion1() {
		// (0,1,2)
		Roots.calculate_roots(-2, 1, 2);

		String root_expected = Root_Types.ERROR.toString();

		assertEquals(root_expected, Roots.root_types().toString());
	}

	/**
	 * a test that checks if the run was completed successfully when there are no
	 * roots in the equation
	 */
	@Test
	public void testPartion2_No_roots() {
		// (0,1,2)
		Roots.calculate_roots(5, 1, 5);

		String root_expected = Root_Types.No_roots.toString();

		assertEquals(root_expected, Roots.root_types().toString());
	}

	/**
	 * a test that checks if the run was completed successfully when a=0 / the
	 * equation is not quadratic
	 */
	@Test
	public void testPartion3_Not_quadratic() {
		// (0,1,2)
		Roots.calculate_roots(0, 3, 4);

		String root_expected = Root_Types.Not_quadratic.toString();

		assertEquals(root_expected, Roots.root_types().toString());
	}

	/**
	 * a test that checks if the run was completed successfully when there is only 1
	 * root in the equation
	 */
	@Test
	public void testPartion4_Equal_roots() {
		// (0,1,2)
		Roots.calculate_roots(3, 6, 3);

		String root_expected = Root_Types.Equal_roots.toString();

		assertEquals(root_expected, Roots.root_types().toString());
	}

	/**
	 * a test that checks if the run was completed successfully when there are two
	 * roots in the equation
	 */
	@Test
	public void testPartion5_Two_roots() {
		// (0,1,2)
		Roots.calculate_roots(2, 9, 3);

		String root_expected = Root_Types.Two_roots.toString();

		assertEquals(root_expected, Roots.root_types().toString());
	}
}
