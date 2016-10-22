package Problem7;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
public class LambdaLibrary {

	
	public static final Function<List<Employee>,List<String>>f1=(emps->
	{
		return emps.stream()
				   .filter(e->e.salary>100000 &&e.lastName.matches("^[N-Z].*$"))
				   .map(e->e.firstName+e.lastName).sorted().collect(Collectors.toList());
	}
	);
			
}
