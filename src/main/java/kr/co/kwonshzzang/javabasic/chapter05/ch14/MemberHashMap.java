package kr.co.kwonshzzang.javabasic.chapter05.ch14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MemberHashMap {
    private Map<Integer, Member> hashMap;

    public MemberHashMap() {
        hashMap = new HashMap<>();
    }

    public void addMember(Member member) {
        hashMap.put(member.getMemberId(), member);
    }

    public boolean removeMember(int memberId) {
        if (hashMap.containsKey(memberId)) {
            hashMap.remove(memberId);
            return true;
        }

        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember() {
        Iterator<Integer> it = hashMap.keySet().iterator();

        while (it.hasNext()) {
            int key = it.next();
            Member member = hashMap.get(key);
            System.out.println(member);
        }
        System.out.println();
    }


}
