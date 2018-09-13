package org.gonnys.domain;

import lombok.Data;

import java.sql.Date;

@Data
public class MemberVO {
    private int mno;
    private String mid, mpw, mname;
    private Date regdate;


}

