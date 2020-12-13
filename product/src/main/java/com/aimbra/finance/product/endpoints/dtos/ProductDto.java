package com.aimbra.finance.product.endpoints.dtos;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class ProductDto {
    private Long id;

    @NotNull
    @Size(min = 8, max = 128, message = "The field 'name' need length between 8 and 128")
    private String title;
}
