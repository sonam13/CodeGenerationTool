package com.tcs.codeGeneration.Service;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.tcs.codeGeneration.Request.Request;
@Service
public class CodeGenerationServiceImpl implements CodeGenerationService{
	@Inject
	private RestTemplate restTemplate;
	@Value("${restCodeUrl}")
	private String restCodeUrl;
	@Value("${soapCodeUrl}")
	private String soapCodeUrl;
@Override
public Object message(Request request) {
	Object object;
		if("REST".equals(request.getServiceType()))
			 object = restTemplate.postForObject(restCodeUrl,request, Object.class );
		else
			 object = restTemplate.postForObject(soapCodeUrl,request, Object.class );	
		
return object;
}
}
