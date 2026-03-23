package picstory.backend.web.dto;

//입력시 규칙을 정하는 용도이기 떄문에 record
public record SignupRequest (
        String name,
        String email,
        String password,
        String passwordConfirm,
        String phone
){
}
