package com.ankita.user.service.VO;

import com.ankita.user.service.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseVO {
	private User user;
	private Department department;

}
