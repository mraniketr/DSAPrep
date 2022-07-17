package StreamAPI;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.ArrayList;

public class StreamBasics {
	public static void main(String args[]) {
		List<Integer> l1 = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			l1.add(i);
		}
		System.out.println(l1);

		System.out.println("EVEN NUMS");
		List<Integer> l2 = l1.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println(l2);

		System.out.println("STREAM GENERATE");
		List<Integer> l3 = Stream.iterate(4, n -> n + 2).limit(50).filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println(l3);

		System.out.println("STREAM GENERATE INT,FLoat");
		Integer l4 = IntStream.range(1, 10).filter(x -> x % 2 == 0).sum();
		System.out.println(l4);

		OptionalInt Reduced = IntStream.range(1, 10).reduce((x, y) -> x + y);

		List<Studnet> sl = new ArrayList<>();
		sl.add(new Studnet(1, "A"));
		sl.add(new Studnet(2, "B"));
		sl.add(new Studnet(3, "C"));

		List<String> slnames = sl.stream().filter(x -> x.getId() > 2).map(Studnet::getName)
				.collect(Collectors.toList());
		System.out.println(slnames);

		List<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		// FILTER
		// Map<Integer, Integer> new1 = arr.stream().filter(x -> x % 2 !=
		// 0).collect(Collectors.toMap(x -> x, x -> x * x));
		// System.out.println(new1);

		// MAP
		// List<Integer> new1 = arr.stream().map(x -> x *
		// 3).collect(Collectors.toList());
		// System.out.println(new1);

		// Reduce
		Optional<Integer> new1 = arr.stream().reduce((x, y) -> x + y);
		System.out.println(new1.get());
	}
}

class Studnet {
	int id;
	String Name;

	public Studnet(int id, String name) {
		this.id = id;
		this.Name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

}
