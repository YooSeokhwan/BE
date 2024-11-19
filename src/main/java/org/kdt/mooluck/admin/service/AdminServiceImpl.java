package org.kdt.mooluck.admin.service;

import lombok.RequiredArgsConstructor;
import org.kdt.mooluck.admin.dto.AdminTableDTO;
import org.kdt.mooluck.admin.mapper.AdminTableMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService {

    private final AdminTableMapper adminTableMapper;

    @Override
    public AdminTableDTO getMemberById(Long elderId) {
        // DTO 생성 및 매퍼 호출
        AdminTableDTO queryDto = new AdminTableDTO();
        queryDto.setElderId(elderId);

        AdminTableDTO result = adminTableMapper.getMemberByMemberId(queryDto); // DTO를 전달
        if (result == null) {
            throw new IllegalArgumentException("No data found for Interaction ID: " + elderId);
        }
        return result;
    }
}
