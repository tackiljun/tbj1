package org.bootex.tbj1.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class TodoDTO {

    private Long tno;
    private String title;
    private String writer;
    private String content;
    private boolean complete;
    private String duedate;


    
}
