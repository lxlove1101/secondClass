package com.zw.admin.server.dto;

import java.util.List;

import com.zw.admin.server.model.User;
import lombok.Data;

@Data
public class UserDto extends User {

	private static final long serialVersionUID = -184009306207076712L;

	private List<Long> roleIds;


}
