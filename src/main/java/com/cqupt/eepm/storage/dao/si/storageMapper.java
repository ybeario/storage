package com.cqupt.eepm.storage.dao.si;

import org.apache.ibatis.annotations.Mapper;

import com.cqupt.eepm.storage.dao.storage;
import com.cqupt.eepm.storage.dao.storageWithBLOBs;

@Mapper
public interface storageMapper {
	int insert(storageWithBLOBs record);

	int insertSelective(storageWithBLOBs record);

	int insert(storage record);

	int insertSelective(storage record);
}