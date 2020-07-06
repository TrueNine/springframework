package com.truenine.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author TrueNine
 * @version 1.0
 * @date 2020/7/2
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    private Integer id;
    private String name;
    private String pwd;
}
