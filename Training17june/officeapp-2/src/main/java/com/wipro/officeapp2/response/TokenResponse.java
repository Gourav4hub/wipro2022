package com.wipro.officeapp2.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Data
@AllArgsConstructor
public class TokenResponse 
{
	private boolean isTokenFound;
	private boolean isTokenExpire;
	private String message;
}
