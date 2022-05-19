package kr.co.kwonshzzang.javabasic.chapter05.ch12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MemberHashSet {
    private Set<Member> hashSet;

    public MemberHashSet() {
        hashSet = new HashSet<>();
    }

    public void addMember(Member member) {
        hashSet.add(member);
    }

    public boolean removeMember(int memberId) {
        Iterator<Member> it = hashSet.iterator();
        while (it.hasNext()) {
            Member member = it.next();
            int tempId = member.getMemberId();
            if (tempId == memberId) {
                hashSet.remove(member);
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember() {
        for (Member member : hashSet) {
            System.out.println(member);
        }
        System.out.println();
    }

}
