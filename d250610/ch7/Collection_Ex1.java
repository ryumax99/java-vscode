package d250610.ch7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Collection_Ex1 {
    // 기본 개념
    // Collection 프레임 워크 :
    // 데이터를 효율적으로 저장, 검색, 수정, 삭제 할 수 있게 해주는 표준화된 클래스 집합.
    // 인터페이스 : Collection, list, set, map
    // 구현 클래스 : ArrayList, HashSet, HashMap 등
    // List : 순서 O, 중복 O, 예) ArrayList
    // Set : 순서 X, 중복 X, 예) HashSet
    // Map : 데이터 형태 , 키-값 형태 , 키 중복 X, 예) HashMap

    public static void main(String[] args) {
        // List 예시
        ArrayList<String> list = new ArrayList<>(); // <> 다이아몬드 연산자, 제너릭으로 표현
        list.add("사과");
        list.add("바나나");
        // 리스트에 하나씩 조회
        System.out.println("첫 번 째 요소 : " + list.get(0));
        System.out.println("두 번 째 요소 : " + list.get(1));
        // 반복문으로 전체 조회
        for (String string : list) {
            System.out.println("List 요소 전체 반복문으로 출력 해보기 : " + string);
        }
        System.out.println("======================================================");
        // 자주 사용하는 옵션
        // add(E e) : 요소 추가 , list.add("apple")
        // get(int index) : 인덱스 위치의 요소 반환 , list.get(0)
        // set(int index, E e) : 인덱스 위치의 요소 변경, 설정. , list(1,"banana"),
        // remove(int index) : 인덱스 위치의 요소를 삭제 , list.remove(0), 또는 list.remove("apple")
        // size() : 요소 개수 반환 , list.size()
        // contains(Object o) : 포함 여부 확인, list.contains("apple")
        // isEmpty() : 비어 있는지 확인, list.Empty();


        // 2
        // HashSet
        HashSet<Integer> set = new HashSet<>(); // 생성
        // 추가
        set.add(1); // 기본형으로 1을 추가 -> 기본형 -> 참조형 : 오토박싱.
        set.add(2);
        set.add(1);
        set.add(3);
        // 하나 조회, 존재 여부 확인.
        System.out.println("하나 조회 : " + set.contains(1));
        // 전체 조회
        for (Integer integer : set) {
            System.out.println("반복문을 이용해서 집합에 담아져 있는 값을 출력해보기 : " + set);
        }
        System.out.println("======================================================");
        // 자주 사용하는 옵션
        // add(E e) : 요소 추가 , set.add("apple")
        // remove(int index) : 인덱스 위치의 요소를 삭제 , set.remove(0), 또는 set.remove("apple")
        // size() : 요소 개수 반환 , set.size()
        // contains(Object o) : 포함 여부 확인, set.contains("apple")
        // isEmpty() : 비어 있는지 확인, list.Empty();
        // clear() : 모든 요소 삭제, set.clear();
        // iterator 반복자 패턴 , 전체 탐색용으로 사용함.
        // Iterator<String> it = set.iterator();
        // while (it.hasNext()) {
        // String s = it.next();
        // System.out.println("출력 확인 : " + s)
        // }


        // 3
        // HashMap
        // 생성
        HashMap<String, Integer> map = new HashMap<>();
        // 추가
        map.put("a", 100);
        map.put("b", 200);
        map.put("c", 300);
        // 하나 조회
        System.out.println("키가 a인 요소의 값을 조회 : " + map.get("a"));
        // 반복물을 이용해서 전체 조회,
        for (String key : map.keySet()) {
            System.out.println(" 반복문 이용해서 전체조회 : " + map.get(key));
        }
        // entrySet(), 키와 값을 같이 구하는 형식.
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(" 키의 값 : " + entry.getKey() + ", value의 값: " + entry.getValue());

        }
        System.out.println("======================================================");
        // 자주 사용하는 옵션
        // put (K key, V value) : 키-값 형태로 추가 , map.put("a", 100)
        // get(Object key) : 키에 해당하는 값 반환 형태.
        // remove(Object key) : 키-값 쌍 삭제 , map.remove("a")

        // size() : 요소 개수 반환 , map.size()
        // containsKey(Object key) : 키 존재 여부, map.containsKey("name")
        // containsValue(Object value) : 키 존재 여부, map.containsValue("value")
        // isEmpty() : 비어 있는지 확인, map.Empty();
        // clear() : 모든 요소 삭제, map.clear();
        // keySet() : 모든 키 set 반환
        // values() : 모든 값 collection 으로 반환 ,
        //
        // entrySet() : 키와 값을 모두 조회 가능한 ,
        // for (Map.Entry<String,String>entry : map.entrySet()) {
        // System.out.println(" 키의 값 : " + entry.getKey() + ", value의 값: " +
        // entry.getValue());
        // }



    }
}
