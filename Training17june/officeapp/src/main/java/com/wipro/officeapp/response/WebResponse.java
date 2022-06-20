package com.wipro.officeapp.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class WebResponse 
{
	private boolean status;
	private Object data;
}
