package swaggerui.uitest.swaggerui;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import org.springframework.web.bind.annotation.*;

/**
 * 접속 경로 : http://localhost:8080/swagger-ui/
 */

@Api(tags = {"API 정보를 제공하는 Controller"})  //클래스를 스웨거 리소스로 표시 (제목 부여 어노테이션)
@RestController
@RequestMapping("/api")
public class UserController {

    @GetMapping
    public String hello() {
        return "hello";
    }

    @GetMapping("/plus/{x}")
    public int plus(@ApiParam(value = "페이지")  //오퍼레이션 파라미터에 메타 데이터 설명  (제목 부여 어노테이션)
                    @PathVariable int page,
                    @ApiParam(value = "콘텐츠 항목 수")
                    @RequestParam int size) {
        return page+size;
    }

    @ApiResponse(code = 502, message = "사용자의 나이가 10살 이하일 때")  //오류에 대한 제목을 달아주는 어노테이션
    @ApiOperation(value = "사용자의 이름과 나이를 리턴하는 메소드")  //특정 경로의 오퍼레이션 HTTP 메소드 설명 (제목 부여 어노테이션)
    @GetMapping("/user")
    public ResDto user1(ReqDto reqDto) {
        return new ResDto(reqDto.getName(), reqDto.getAge());
    }

    @PostMapping("/user")
    public ResDto user2(@RequestBody ReqDto reqDto) {
        return new ResDto(reqDto.getName(), reqDto.getAge());
    }
}
