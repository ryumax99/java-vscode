package d250609.ch4;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("류성원", "이메일", "1234");
        Member member2 = new Member("류성원1", "이메일1", "1234");
        Member member3 = new Member("류성원2", "이메일2", "1234");
        member.showInfo();
        member2.showInfo();
        member3.showInfo();
        member.changeNameEmailPassword("홍길동", "이메일 수정", "4321");
        member2.changeNameEmailPassword("이순신", "이메일 수정2", "1111");
        member3.changeNameEmailPassword("이재용", "이메일 수정3", "2222");
        member.showInfo();
        member2.showInfo();
        member3.showInfo();
    }
}
