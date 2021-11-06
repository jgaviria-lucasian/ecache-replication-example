package com.test.cache;

import java.util.ArrayList;
import java.util.List;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;


public class CacheHelper {

	private String path;
	
	public CacheHelper() {
		this.path= System.getProperty("ecache-file");
		System.out.println("Cache file [" + this.path + "]");
	}
	
	public void addElement(ElementoVO elemento) {
		CacheManager manager= CacheManager.create(path).getInstance();
		Cache cache = manager.getCache("cache1");	    
		cache.put(new Element(elemento.getId(),elemento.getValor()));
	}
	
	public ArrayList<ElementoVO> getAll() {
		ArrayList<ElementoVO> elementos= new ArrayList<ElementoVO>();
		CacheManager manager= CacheManager.create(path).getInstance();
		Cache cache = manager.getCache("cache1");
		List keys= cache.getKeys();
		
		for (Object key : keys) {
			ElementoVO elementoVO= new ElementoVO();
			elementoVO.setId(key.toString());
			Element valueKey= cache.get(key);
			String valor= (valueKey == null ? null : valueKey.getObjectValue().toString());
			elementoVO.setValor(valor);
			elementos.add(elementoVO);
		}
		return elementos;
	}
	
	public void delete(String key) {
		CacheManager manager= CacheManager.create(path).getInstance();
		Cache cache = manager.getCache("cache1");
		cache.remove(key);
	}
}
