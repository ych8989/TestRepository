package ch14.exam08;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class LambdaExpressionExample {
	private static List<Student> list = Arrays.asList(
		new Student("ȫ�浿", 90, 96),
		new Student("���ڹ�", 95, 93)
	);
	
	public static void main(String[] args) {
		double englishAvg = avg( (s) -> { return s.getEnglishScore(); }  );
		System.out.println("���� ��� ����: " + englishAvg);
		
		double mathAvg = avg( (s) -> { return s.getMathScore(); }  );
		System.out.println("���� ��� ����: " + mathAvg);
	}
	
	public static double avg(ToIntFunction<Student> function) {
		int sum = 0;
		for(Student student : list) {
			sum += function.applyAsInt(student);
		}
		double avg = (double)sum / list.size();
		return avg;
	}
}
