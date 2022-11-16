package io.openjob.server.admin.request.notify;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author inhere
 * @date 2022-11-14 20:21:17
 * @since 1.0.0
 */
@Data
@ApiModel(value = "NotifyContactDeleteRequest", description = "NotifyContact delete request")
public class NotifyContactDeleteRequest {

    @Min(1)
    @NotNull()
    @ApiModelProperty(value = "PK")
    private Long id;

}
