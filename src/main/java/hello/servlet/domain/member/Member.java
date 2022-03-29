package hello.servlet.domain.member;

import lombok.*;
import org.springframework.stereotype.Repository;

@Getter @Setter
public class Member {

    private Long id;
    private String username;
    private int age;

    public Member() {

    }

    public Member(String username, int age){
        this.username = username;
        this.age = age;
    }

}
