package org.victor.hugo.api.service;

import io.quarkus.cache.CacheResult;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AlticciSequenceService {

	@CacheResult(cacheName = "alticci")
	public int alticci(int index) {
		switch (index) {
		case 0:
			return 0;
		case 1:
			case 2:
				return 1;
		default:
			return alticci(index - 3) + alticci(index - 2);
		}
	}
}
