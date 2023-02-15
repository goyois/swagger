package swaggerui.uitest.swaggerui;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReqDto {
    @ApiModelProperty(value = "사용자 이름", example = "김주원", required = true)  //모델의 속성 데이터를 설명 (제목 부여 어노테이션)
    private String name;
    @ApiModelProperty(value = "사용자 나이", example = "10", required = true)
    private int age;


}
