package com.example.retrofit.demo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.Optional;

@Data
@NoArgsConstructor
public class User {

    private String name;
    private Integer age;

    /**
     * 开始时间
     */
    private Optional<OffsetDateTime> startTime = Optional.empty();

    /**
     * 结束时间
     */
    private Optional<OffsetDateTime> endTime = Optional.empty();

}
