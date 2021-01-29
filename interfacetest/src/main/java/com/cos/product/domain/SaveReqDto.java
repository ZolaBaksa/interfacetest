package com.cos.product.domain;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class SaveReqDto {
	@NotEmpty // NotNull(키값이없는것), NotBlank(공백)
	private String name;
	@NotNull
	private Integer price;
	@NotNull
	private Integer type; 
}
