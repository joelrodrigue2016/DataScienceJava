package dataformat;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Joel
 *
 */
public class DataFormatting {

	static class Person {
		public final Integer id;
		public final String name;
		public final boolean likesPizza;

		public Person(Integer id, String name, boolean likesPizza) {
			this.id = id;
			this.name = name;
			this.likesPizza = likesPizza;
		}
	}

	static class PersonUtils {
		public static String getFirstName(Person person) {
			return person.name.split(" ")[0];

		}
	}

	/**
	 * 
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// univariate arrays

		String[] names = { "John Doe", "James degale", "Bill Smith", "Betsy Garcia" };
		Integer[] ids = { 123, 234, 568, 456 };
		boolean[] likesPizza = { false, true, true, false };

		/// multivariable arrays
		Integer[] person1 = { 123, 0, 1994, 4, 3 };
		Integer[] person2 = { 234, 1, 1948, 8, 4 };

		// Matrices

		double[][] peopleData = { { 123, 0, 1994, 4, 3 }, { 234, 1, 1948, 8, 4 },

		};

		/// would need to download the real matrix library to use teh code below
		/// RealMatrix matrix=new Array2DRowRealMatrix(peopleData);
		Person myPerson = new Person(123, "John doe", false);
		String firstName = PersonUtils.getFirstName(myPerson);

		List<Person> peopleList = new ArrayList<>();
		peopleList.add(new Person(123, "John doe", false));
		peopleList.add(new Person(234, "Jane Jones", true));
	}

}
