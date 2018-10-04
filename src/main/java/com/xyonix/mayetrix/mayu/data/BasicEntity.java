package com.xyonix.mayetrix.mayu.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class BasicEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String textName = null;
	private String displayName = null;
	private List<String> paths = new ArrayList<String>();
	private int occurrenceCount = -1;

	public BasicEntity(String textName, String displayName, int count, List<String> paths) {
		this.textName=textName;
		this.displayName=displayName;
		this.occurrenceCount=count;
		this.paths=paths;
	}
	
	/**
	 * Returns entity name. If found within text, this is the form found in the text.
	 */
	public String getTextName() {
		return this.textName;
	}

	/**
	 * Returns name to display to users.
	 */
	public String getDisplayName() {
		return displayName;
	}

	public List<String> getPaths() {
		return paths;
	}

	/**
	 * Returns occurrences in source text.
	 */
	public int getOccurrenceCount() {
		return occurrenceCount;
	}
}

