package org.scoula.board.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BoardVO {
    private Long no;
    private String title;
    private String name;
    private String sex;
    private String content;
    private String writer;
    private LocalDateTime regDate;
    private LocalDateTime updateDate;
}
