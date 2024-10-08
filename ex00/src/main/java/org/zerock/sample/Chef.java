package org.zerock.sample;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Chef {
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;
}
