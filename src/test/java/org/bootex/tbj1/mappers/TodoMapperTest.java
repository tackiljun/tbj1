package org.bootex.tbj1.mappers;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;
import org.bootex.tbj1.dto.PageRequestDTO;
import org.bootex.tbj1.dto.TodoDTO;
import org.bootex.tbj1.mappers.TodoMapper;

import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
public class TodoMapperTest {

    @Autowired(required = false)
    private TodoMapper todoMapper;

    @Transactional
    @Commit
    @Test
    public void tsetInsert() {
        
        Assertions.assertNotNull(todoMapper, "TodoMapper!!!!!");

        TodoDTO todoDTO = TodoDTO.builder()
        .title("TEST TODO!!!!!")
        .content("TEST CONTENT!!!!!")
        .writer("USER11!!!!!")
        .duedate("2023.06.11!!!!!")
        .build();

        int count = todoMapper.insert(todoDTO);

        Assertions.assertEquals(count, 1);

        log.info("====================");
        log.info(todoDTO.getTno());
        log.info("====================");
    }

    @Test
    public void testSelectOne() {

        log.info(todoMapper.selectOne(1376227L));
    }

    public void testList() {

        PageRequestDTO pageRequestDTO = PageRequestDTO.builder().build();
        List<TodoDTO> list = todoMapper.list(dto);

        list.forEach(todo -> log.info(todo));
    }

    @Test
    public void testListCount() {

        PageRequestDTO pageRequestDTO = PageRequestDTO.builder().build();
        long totalCount = todoMapper.listCount(dto);

        log.info("====================");
        log.info("====================");
        log.info(totalCount);
        log.info("====================");
        log.info("====================");
    }
    
}
