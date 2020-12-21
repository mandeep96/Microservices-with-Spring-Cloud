package demo.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import demo.domain.Word;

@FeignClient("SUBJECT")
public interface SubjectClient {
	
	@RequestMapping(method=RequestMethod.GET, value="/")
	 public Word getWord();
	
}
