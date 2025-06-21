package com.postsmith.login.dto;

import java.util.Map;

public interface OAuth2Response {
	String getProvider();

	String getProviderId();

	String getEmail();

	String getNickName();

	Map<String, Object> getAttributes();
}
