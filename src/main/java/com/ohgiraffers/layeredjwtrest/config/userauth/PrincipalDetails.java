package com.ohgiraffers.layeredjwtrest.config.userauth;

import com.ohgiraffers.layeredjwtrest.member.Member;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;

public class PrincipalDetails implements UserDetails {

    private Member member;

    public PrincipalDetails() {
    }

    public PrincipalDetails(Member member) {
        this.member = member;
    }

    //회원 정보 반환
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Collection<GrantedAuthority> authorities = new ArrayList<>();

        member.getRoleList().forEach( r -> authorities.add(() -> r));

        System.out.println("authorities test : " + authorities.iterator().next().getAuthority());

        return authorities;
    }

    @Override
    public String getPassword() {
        return member.getPassword();
    }

    @Override
    public String getUsername() {

        return member.getMemberId();
    }

    // 확인필요
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    //확인필요
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    //확인필요
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    //확인필요
    @Override
    public boolean isEnabled() {
        return true;
    }
}
