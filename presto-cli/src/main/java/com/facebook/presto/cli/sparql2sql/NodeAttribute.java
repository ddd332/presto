package com.facebook.presto.cli.sparql2sql;

public class NodeAttribute {

	private int tripleID;
	private boolean isSubject;
	
	public NodeAttribute(int tripleID, boolean isSubject){
		this.tripleID = tripleID;
		this.isSubject = isSubject;
	}
	
	public boolean isSubject(){
		return this.isSubject;
	}
	
	public int getTripleID(){
		return tripleID;
	}
}
