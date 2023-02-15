package mission12;

import java.util.List;
import java.util.stream.Stream;

public class Mission_12 {
    public static void main(String[] args) {

        // 1-1
        //String 타입의 List 객체를 생성합니다.
        List<String> names = List.of("홍길동", "배장화", "임꺽정", "연흥부", "김선달", "황진이");

        // 1-2
        //names 객체를 스트림으로 생성합니다.
        Stream n = names.stream();
        //원소를 정렬하지 않은 상태에서 필터링만 이용하여 '이'씨보다 앞에 있는 모든 사람을 출력합니다.
        n.filter(x -> ((String) x).charAt(0) < '이').forEach(x -> System.out.print(x +" "));
        System.out.println(); // 엔터

        // 1-3
        // names 객체를 다시 스트림으로 생성합니다.
        n = names.stream();
        //  이번에는 원소를 모두 정렬한 후 모든 원소를 출력합니다.
        n.sorted().forEach(x -> System.out.print(x + " ")); // sorted 정렬.
        System.out.println(); // 엔터

        // 1-4
        // names 객체를 다시 스트림으로 생성합니다.
        n = names.stream();
        // 첫 번째 원소를 있는 그대로 출력합니다.
        System.out.println(n.findFirst()); // findFirst : 스트림의 첫번째 요소를 찾아서 Optional 타입으로 리턴.
        // names 객체를 다시 스트림으로 생성합니다.
        n = names.stream();
        // Optional을 벗겨서도 출력합니다.
        System.out.println(n.findFirst().get());

        // 1-5
        // names 객체를 다시 스트림으로 생성합니다.
        n = names.stream();
        // 전체 원소 개수를 출력합니다.
        System.out.println(n.count());

    }
}