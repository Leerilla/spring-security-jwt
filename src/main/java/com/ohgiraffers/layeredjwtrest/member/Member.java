package com.ohgiraffers.layeredjwtrest.member;

import com.ohgiraffers.layeredjwtrest.common.vo.Role;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Member {

    private int memberNo;
    private String memberId;
    private String password;
    private Role role;


    public List<String> getRoleList() {
        if(this.role.getValue().length() > 0){
            return Arrays.asList(this.role.getValue().split(","));
        }

        return new ArrayList<>();
    }

    public Member() {
    }

    public Member(int memberNo, String memberId, String password, Role role) {
        this.memberNo = memberNo;
        this.memberId = memberId;
        this.password = password;
        this.role = role;
    }

    public int getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(int memberNo) {
        this.memberNo = memberNo;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberNo=" + memberNo +
                ", memberId='" + memberId + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                '}';
    }
}
