package swaggerui.uitest.swaggerui;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResDto {
    @ApiModelProperty(value = "사용자 이름", example = "김주원", required = true)
    private String name;
    @ApiModelProperty(value = "사용자 나이", example = "10", required = true)
    private int age;
}
