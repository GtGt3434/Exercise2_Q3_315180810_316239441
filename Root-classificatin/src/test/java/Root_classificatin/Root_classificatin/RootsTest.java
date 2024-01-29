package Root_classificatin.Root_classificatin;

import static org.junit.Assert.*;

import org.junit.Test;

public class RootsTest {
	Roots root;

	/**
	 * a test that checks if the run was completed successfully when when entering
	 * invalid/out of range values
	 */
	@Test
	public void testPartion1() {
		// (0,1,2)
		Roots.calculate_roots(-2, 1, 2);

		String root_expected = Root_Types.ERROR.toString();

		assertEquals(root_expected, Roots.root_types().toString());
	}

	/**
	 * a test that checks if the run was completed successfully when 'a' has a
	 * minimal value
	 */
	@Test
	public void BVA_A_MIN() {

		Roots.calculate_roots(0, 4, 2);

		String root_expected = Root_Types.Not_quadratic.toString();

		assertEquals(root_expected, Roots.root_types().toString());
	}

	/**
	 * a test that checks if the run was completed successfully when 'a' has a
	 * minimal value +1
	 */
	@Test
	public void BVA_A_MIN_PLUS_1() {

		Roots.calculate_roots(1, 2, 10);

		String root_expected = Root_Types.No_roots.toString();

		assertEquals(root_expected, Roots.root_types().toString());
	}

	/**
	 * a test that checks if the run was completed successfully when 'a' has a
	 * numeric value
	 */
	@Test
	public void BVA_A_Numeric() {

		Roots.calculate_roots(2, 8, 2);

		String root_expected = Root_Types.Two_roots.toString();

		assertEquals(root_expected, Roots.root_types().toString());
	}

	/**
	 * a test that checks if the run was completed successfully when 'a' has a
	 * maximum value -1
	 */
	@Test
	public void BVA_A_MAX_MINUS_1() {

		Roots.calculate_roots(99, 5, 5);

		String root_expected = Root_Types.No_roots.toString();

		assertEquals(root_expected, Roots.root_types().toString());
	}

	/**
	 * a test that checks if the run was completed successfully when 'a' has a
	 * maximum value
	 */
	@Test
	public void BVA_A_MAX() {

		Roots.calculate_roots(100, 20, 1);

		String root_expected = Root_Types.Equal_roots.toString();

		assertEquals(root_expected, Roots.root_types().toString());
	}
}
