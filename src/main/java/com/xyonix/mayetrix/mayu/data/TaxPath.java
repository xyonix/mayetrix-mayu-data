package com.xyonix.mayetrix.mayu.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TaxPath implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    public TaxPath(String name) {
        this.name=name;
    }

    public void append(String childPath) {
        name=name+"/"+childPath;
    }

    public String getName() {
        return this.name;
    }

    public String getLeaf() {
        String[] types = getNodes();
        if(types.length<1) return null;

        return types[types.length-1].trim();
    }

    public boolean hasNode(String type) {
        for(String t:getNodes()) {
            if(t.equals(type)) {
                return true;
            }
        }
        return false;
    }

    public String getRoot() {
    	String[] nodes = getNodes();
    	if(nodes==null||nodes.length<1)
    		return null;
    	return nodes[0];
    }
    
    public static List<TaxPath> filterPaths(List<TaxPath> paths, String type) {
        List<TaxPath> outPaths = new ArrayList<TaxPath>();
        for(TaxPath tp:paths) {
            if(tp.hasNode(type))
                outPaths.add(tp);
        }
        return outPaths;
    }

    /**
     * Returns nodes in a path.
     */
    public String[] getNodes() {
    	return name.split("/");
    }
    
    public boolean equals(Object o) {
        return this.getName().equals(((TaxPath)o).getName());
    }
    
    public String toString() {
    	return getName();
    }
}
