package com.hibernatecache.Hibernate_ReadVcardFile;

import java.util.Comparator;

public class NameComp implements Comparator<App> {

	@Override
	public int compare(App o1, App o2) {
		if (o1.name.charAt(0)>o2.name.charAt(0)) {
			return 1;
		}
		if (o1.name.charAt(0)<o2.name.charAt(0)) {
			return -1;
		}
		return 0;
	}

}
