package org.gonnys.domain;

import lombok.Data;

import java.sql.Date;

@Data
public class BoardVO {

    private int bno;
    private String title, content, mname;
    private Date regdate, updatedate;

}
