package org.kdt.mooluck.admin.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.kdt.mooluck.admin.dto.AdminTableDTO;

import java.util.List;

@Mapper
public interface AdminTableMapper {
    AdminTableDTO getMemberByMemberId(AdminTableDTO adminTableDTO); // DTO 타입을 받음
}
