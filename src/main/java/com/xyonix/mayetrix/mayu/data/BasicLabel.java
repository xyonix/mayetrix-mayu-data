package com.xyonix.mayetrix.mayu.data;

import java.io.Serializable;

public class BasicLabel implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private TaxPath type = null;
	private BasicEntity value = null;
	private float score = -1;

	public BasicLabel(TaxPath type, float score, BasicEntity value) {
		this.type=type;
		this.score=score;
		this.value=value;
	}

	public TaxPath getType() {
		return type;
	}
	
	public float getScore() {
		return score;
	}

	public BasicEntity getValue() {
		return value;
	}

}
