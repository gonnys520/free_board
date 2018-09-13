package org.gonnys.domain;

import lombok.Data;
import org.gonnys.dao.BoardDAO;

import java.util.List;


@Data
public class PageVO {
    private int startPage, endPage;
    private int pageSize;
    private int cal;

    public PageVO(List<BoardVO> boardVOList){
        BoardDAO dao = new BoardDAO();
        boardVOList = dao.pagelist();
        pageSize = (int) Math.ceil((float)boardVOList.size()/10);
    }


    public int getendPage(int page){

        endPage = ((page-1)/10)*10+10;

        if (endPage >= pageSize){
            endPage = pageSize;
        }

        return endPage;
    }

    public int getstartPage(int page){

        startPage = ((page-1)/10)*10+1;
        return startPage;
    }

    public int getBeforePage(int page){
        int beforePage = ((page-11)/10)*10+1;
        if (beforePage <= 0){
            beforePage = 1;
        }
        return beforePage;
    }

    public int getAfterPage(int page){
        int afterPage = ((page+9)/10)*10+1;
        if (afterPage > pageSize){
            afterPage = pageSize;
        }
        return afterPage;
    }

}