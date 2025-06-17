package d250617.web_structure.dao;

import d250617.web_structure.dao.*;
import d250617.web_structure.dto._10Member;

import java.util.List;

public interface _9DAO_Interface {
    // 1) 전체 조회
    // List 부모 타입, ArrayList 자식 타입, 다형성으로 받을수 있음.
    List<_10Member> findAll();

    // 2) 한명 회원 조회
    _10Member findById(int id);

    // 3) 회원 추가
    boolean insert(_10Member member);

    // 4) 회원 수정
    boolean update(_10Member member);

    // 5) 회원 삭제
    boolean delete(int id);

    // 6) 회원 검색
    _10Member findByName(String name);

}
