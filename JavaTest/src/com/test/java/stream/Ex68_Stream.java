package com.test.java.stream;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.test.data.Data;
import com.test.data.Item;
import com.test.data.User;
import com.test.java.collection.Member;
import com.test.util.MyUtil;

public class Ex68_Stream {
	public static void main(String[] args) {
		
//		m1();
//		m2();
//		m3();
//		m4();
//		m5();
//		m6();
//		m7();
//		m8();
//		m9();
		m10();
	}

	private static void m10() {
		List<Integer> nums = Data.getIntList();
		
		//Optional<Integer>
		System.out.println(nums.stream().max((o1, o2) -> o1-o2));
		
		System.out.println(nums.stream().max((o1, o2) -> o1-o2).get());
		
//		nums.clear();
		
		Optional<Integer> result = nums.stream().max((o1, o2) -> o1-o2);
		System.out.println(result);
		
		
		Optional<User> user = Data.getUserList()
				.stream()
				.max((user1,user2)->user1.getHeight() - user2.getHeight());
		System.out.println(user.get());
		
		Optional<User> user3 = Data.getUserList()
				.stream()
				.min((user1,user2)->user1.getHeight() - user2.getHeight());
		System.out.println(user3.get());
		
		
		//IntStream == nums.stream().mapToInt(n->n)
		System.out.println(nums.stream().mapToInt(n -> n).sum());
		
		//OptionalDouble 반환
		System.out.println(nums.stream().mapToInt(n -> n).average().getAsDouble());
		
		
		//남자 평균 키?
		double height = Data.getUserList()
							.stream()
							.filter(u -> u.getGender() == 1)
							.mapToInt(u -> u.getHeight())
							.average()
							.getAsDouble();
		System.out.println(height);
		
		
	}

	private static void m9() {
		int[] nums = {2,4,6,8,10};
		
		//요구사항] 현재 배열 안에 짝수만 있는지 검사
		boolean result = false;
		for(int n:nums) {
			if(n%2==1) {
				result = true;
				break;
			}
		}
		
		if(!result) {
			System.out.println("짝수만 존재");
		}else {
			System.out.println("홀수가 발견");
		}
		
		result = Arrays.stream(nums).allMatch(n -> n%2==0);
		System.out.println(result);
		
		result = Data.getUserList().stream()
									.filter(user -> user.getHeight() >=178)
									.allMatch(user -> user.getGender() == 1);
		System.out.println(result);
		
		
		//nums 배열에 홀수가 존재하는지
		Arrays.stream(nums).anyMatch(n -> n%2==1);
		System.out.println(result);
		
		result = Data.getUserList().stream()
									.filter(user -> user.getHeight() >=178)
									.anyMatch(user-> user.getGender()==2);
		System.out.println(result);
	}

	private static void m8() {
		//기본 오름차순
		Data.getIntList(10).stream().sorted().forEach(n -> System.out.println(n));
		System.out.println();
		
		//내림차순 Comparator 람다식으로 구현
		Data.getIntList(10).stream()
							.sorted((a,b) -> b-a)
							.forEach(n -> System.out.println(n));
		
		//내림차순 Comparator 라이브러리 사용
		Data.getIntList(10).stream()
							.sorted(Comparator.naturalOrder())  //오름차순
							.sorted(Comparator.reverseOrder())	//내림차순
							.forEach(n -> System.out.println(n));
		
		Data.getIntList().stream()
							.distinct()
							.filter(n -> n %2 ==0)
							.sorted()
							.forEach(n -> System.out.println(n));
		System.out.println();
	}

	private static void m7() {
		List<String> list = Data.getStringList(10);
		System.out.println(list);
		System.out.println();
		
		list.stream()
			.map(word -> word.length() >=5 ? "긴단어":"짧은단어")
			.forEach(word->System.out.println(word));
		System.out.println();
		
		Data.getUserList().stream()
//							.map(user -> user.getAge()-10)
							.map(user -> user.getGender() == 1 ? "남자": "여자")
							.forEach(temp -> System.out.println(temp));
		System.out.println();
		
		String[] names = {"홍길동", "아무개", "이순신" ,"하하하", "호호호"};
		Arrays.stream(names).map(name -> new Member(name, 20))
							.forEach(temp -> System.out.println(temp));
		System.out.println();
		
		
		Data.getUserList().stream()
						.map(user -> new Member(user.getName(), user.getAge()))
						.forEach(m -> System.out.println(m));
		
	}

	private static void m6() {
		List<Integer> list = Data.getIntList();
		System.out.println(list);
		//위의 집합에서 중복값을 제거하시오 >> set
		//Case 1.
		Set<Integer> set = new HashSet<Integer>();
		for(int n : list) {
			set.add(n);
		}
		System.out.println(set);
		
		//Case 2.
		Set<Integer> set2 = new HashSet<Integer>(list);
		System.out.println(set2.size());
		
		//Case 3.
		System.out.println(list.stream().count());
		System.out.println(list.stream().distinct().count());
		
		
		Data.getStringList().stream()
							.filter(word -> word.length() >= 5)
							.distinct()
							.forEach(word -> System.out.println(word));
		
		ArrayList<Member> mlist = new ArrayList<>();
		mlist.add(new Member("홍길동",20));
		mlist.add(new Member("아무개",25));
		mlist.add(new Member("강아지",5));
		mlist.add(new Member("고양이",3));
		mlist.add(new Member("홍길동",20));
		
		System.out.println(mlist);
		mlist.stream().distinct().forEach(n -> System.out.println(n));
		
	}

	private static void m5() {
		Data.getStringList().stream()
							.filter(word -> word.length() >= 5)
							.forEach(word -> System.out.println(word));
		System.out.println();
		
		
		Data.getUserList().stream()
						  .filter(user -> user.getGender() == 1)
						  .forEach(user->System.out.println(user));
		System.out.println();
		
	}

	private static void m4() {
		
		List<Integer> list = Data.getIntList(20);
		System.out.println(list);
		
		//짝수만 출력
		//1. for문
		for(int i=0; i<list.size(); i++) {
			if(list.get(i) %2 ==0)
				System.out.printf("%4d",list.get(i));
		}
		System.out.println();
		
		//2. for
		for(int n : list) {
			if(n%2 == 0)
				System.out.printf("%4d", n);
		}
		System.out.println();
		
		//3. stream
		list.stream().forEach(n -> {
			if(n%2==0)
				System.out.printf("%4d", n);
		});
		System.out.println();
		
		list.stream().filter(n -> {
			if(n%2 ==0)
				return true;
			else
				return false;
		}).forEach(n -> System.out.printf("%4d",n));
		System.out.println();
		
		list.stream()
			.filter(n -> n%2==0)
			.filter(n -> n >= 50)
			.forEach(n -> System.out.printf("%4d",n));
		System.out.println();
	}

	private static void m3() {
		//1. 배열로부터
		int[] nums1 = {10,20,30,40,50};
		Arrays.stream(nums1).forEach(num -> System.out.println(num));
		
		//2. 컬렉션으로부터
		ArrayList<Integer> nums2 = new ArrayList<>();
		nums2.add(100);
		nums2.add(200);
		nums2.add(300);
		nums2.stream().forEach(num -> System.out.println(num));
		
		LinkedList<Integer> nums3 = new LinkedList<Integer>();
		nums3.add(300);
		nums3.add(200);
		nums3.add(100);
		nums3.stream().forEach(num -> System.out.println(num));
		
		HashSet<Integer> nums4 = new HashSet<Integer>();
		nums4.add(100);
		nums4.add(200);
		nums4.add(300);
		nums4.stream().forEach(num -> System.out.println(num));
		
		
		//3. 
		//Stream<Integer>
		IntStream.range(1, 11).forEach(num -> System.out.println(num));
		System.out.println();
		
		//4. 파일로부터
		try {
			Path path = Paths.get("dat\\score.txt");
			Files.lines(path).forEach(str -> System.out.println(str));
			
			//5.디렉토리
			Path dir = Paths.get("C:\\class\\dev\\eclipse");
			Files.list(dir).forEach(p -> {
				System.out.println(p.getFileName());
			});
			
		} catch (Exception e) {
			System.out.println("Ex68_Stream.m3");
			e.printStackTrace();
		}
		
		
	}

	private static void m2() {
		// 배열(컬렉션) 탐색
		List<String> list = Data.getStringList(10);
		System.out.println(list);
		
		for(int i=0; i<list.size(); i++) {
			System.out.printf("%s\t", list.get(i));
		}
		System.out.println();
		System.out.println();
		
		//2. 향상된 for문
		for(String item: list) {
			System.out.printf("%s\t", item);
		}
		System.out.println();
		System.out.println();
		
		//3. iterator
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.printf("%s\t",iter.next());
		}
		
		//4. stream
		
		//4.1 list.stream() > ArrayList로부터 스트림 객체를 생성해라
		//4.2 stream객체 > ArrayList를 참조
		//4.3 forEach 실행
		// - stream을 통해서 ArrayList 요소를 접근(하니씩 + 순서대로)
		Stream<String> stream = list.stream();
		
		stream.forEach(word -> System.out.println(word));
		
		
		List<Integer> nums = Data.getIntList(10);
		System.out.println(nums);
		
		Stream<Integer> stream2 = nums.stream();
		stream2.forEach(num -> System.out.println(num));
//		stream2.forEach(num -> System.out.println(num));
		
		nums.stream().forEach(num->System.out.println(num));
		System.out.println();
		
		
		Data.getUserList().stream().forEach(user-> {
			System.out.println(user.getName());
			System.out.println(user.getAge());
			System.out.println();
		});
	}

	private static void m1() {
		
		int[] nums1 = Data.getIntArray();
		System.out.println(Arrays.toString(nums1));
		
		int[] nums2 = Data.getIntArray(10);
		System.out.println(Arrays.toString(nums2));
		
		List<Integer> nums3 = Data.getIntList();
		System.out.println(nums3);
		
		List<Integer> nums4 = Data.getIntList(10);
		System.out.println(nums4);
		
		String[] txt1 = Data.getStringArray(5);
		System.out.println(Arrays.toString(txt1));
		
		User[] ulist = Data.getUserArray();
		System.out.println(Arrays.toString(ulist));
		
		Item[] ilist = Data.getItemArray();
		System.out.println(Arrays.toString(ilist));
		
		MyUtil util = new MyUtil();
		System.out.println(util.sum(10, 200));
	}
}
