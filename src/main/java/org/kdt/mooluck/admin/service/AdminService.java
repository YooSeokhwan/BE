package org.kdt.mooluck.admin.service;

import org.kdt.mooluck.admin.dto.AdminTableDTO;

public interface AdminService {
    AdminTableDTO getMemberById(Long elderId); // Long 타입을 받도록 수정
}

