package br.com.dnsistemas;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class Greeting {
	
	private final long id;
	private final String content;

}
