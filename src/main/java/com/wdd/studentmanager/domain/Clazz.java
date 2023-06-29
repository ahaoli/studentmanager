package com.wdd.studentmanager.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 班级实体类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Clazz {
	private Integer id;
	private String name;
	private String info;

}
