package com.cytrogene.user.service.userVo;

import com.cytrogene.user.service.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDepartmentVo {
    private User user ;
    private Department department;

}
