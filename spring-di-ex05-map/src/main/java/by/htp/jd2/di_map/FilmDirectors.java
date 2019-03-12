package by.htp.jd2.di_map;

import java.util.Map;

public class FilmDirectors {

	private Map<Integer, String> directorMap;

	public Map<Integer, String> getDirectorMapt() {
		return directorMap;
	}

	public void setDirectorMap(Map<Integer, String> directorMap) {
		this.directorMap = directorMap;
	}

	public void pringDirectors() {
		System.out.println(this.directorMap);
	}
} 
