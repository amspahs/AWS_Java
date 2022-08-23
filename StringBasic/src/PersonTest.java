
public class PersonTest {

	public static void main(String[] args) {

		Person person = new Person(100, "psu");
		Person person2 = new Person(100, "psu");

		System.out.println(person == person2);
		
		System.out.println(person.equals(person2));
	}
}
