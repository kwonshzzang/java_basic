package kr.co.kwonshzzang.javabasic.chapter05.ch11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MemberArrayList {
    private List<Member> arrayList;  // ArayList 선언

    public MemberArrayList() {        //멤버로 선언한 ArrayList 생성
        arrayList = new ArrayList<>();
    }

    public MemberArrayList(int size) {
        arrayList = new ArrayList<>(size);
    }

    public void addMember(Member member) {  //ArrayList에 멤버 추가
        arrayList.add(member);
    }

    public boolean removeMember(int memberId) { //멤버 아이디를 매개변수로, 삭제 여부 반환
        Iterator<Member> it = arrayList.iterator();
        while (it.hasNext()) {
            Member member = it.next();
            int tempId = member.getMemberId();
            if (tempId == memberId) {
                arrayList.remove(member);
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 안습니다."); //for가 끝날때까지 return이 안된 경우
        return false;
    }

    public void showAllMember() {
        for (Member member : arrayList) {
            System.out.println(member);
        }
        System.out.println();
    }

}
