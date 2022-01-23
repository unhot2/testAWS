package com.yg.aws.repository;


import org.apache.ibatis.annotations.Mapper;

import com.yg.aws.model.Me;

@Mapper
public interface MainRepository {

	/* 장바구니 목록 */
	Me testAWS();

}
