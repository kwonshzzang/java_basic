package kr.co.kwonshzzang.javabasic.chapter05.ch13;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Member implements Comparable<Member> {
    private int memberId;
    private String memberName;

    @Override
    public String toString() {
        return memberName + " 회원님의 아이디는 " + memberId + "입니다.";
    }

    @Override
    public int hashCode() {
        return memberId;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            Member member = (Member) obj;
            if (this.memberId == member.getMemberId()) {
                return true;
            } else
                return false;
        }
        return false;
    }

    @Override
    public int compareTo(Member member) {
//        if (this.memberId > member.memberId) {
//            return 1;
//        } else if(this.memberId < member.memberId) {
//            return -1;
//        } else
//            return 0;

        //        return this.memberId - member.getMemberId();           //오름 차순
        return (this.memberId - member.getMemberId()) * (-1);   //내림 차순
    }
}
