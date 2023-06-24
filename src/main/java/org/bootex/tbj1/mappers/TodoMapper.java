package org.bootex.tbj1.mappers;

import java.util.List;

import org.bootex.tbj1.dto.PageRequestDTO;
import org.bootex.tbj1.dto.TodoDTO;

public interface TodoMapper {
    int insert(TodoDTO todoDTO); 

    //1376227
    TodoDTO selectOne(Long tno);
    
    List<TodoDTO> list(PageRequestDTO pageRequestDTO);
    
    long listCount(PageRequestDTO pageRequestDTO);



}
