package org.kdt.mooluck.admin.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.kdt.mooluck.admin.dto.AdminTableDTO;
import org.kdt.mooluck.admin.service.AdminService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
@RequiredArgsConstructor
@Tag(name = "Admin Controller", description = "API about admin Service")
public class AdminController {

    private final AdminService adminService;

    @GetMapping("/table")
    public ResponseEntity<AdminTableDTO> getMemberById(@RequestParam Long elderId) {
        AdminTableDTO responseDto = adminService.getMemberById(elderId); // 수정된 메서드 호출
        return ResponseEntity.ok(responseDto);
    }
}
