package org.example.expert.domain.user.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserChangePasswordRequest {

    @NotBlank(message = "기존 비밀번호를 입력해주세요.")
    private String oldPassword;

    @NotBlank(message = "새 비밀번호를 입력해주세요.")
    @Size(min = 8, message = "새 비밀번호는 8자 이상이어야 합니다.")
    @Pattern(reqexp = ".*\\d.*", message = "새 비밀번호에는 적어도 하나의 숫자가 포함되어야 합니다.")
    @Pattern(regexp = ".*[A-Z].*", message = "새 비밀번호에는 적어도 하나의 대문자가 포함되어야 합니다.")
    private String newPassword;
}
