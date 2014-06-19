package com.facebook.presto.cli.sparql2sql;

import java.util.List;
import java.util.ArrayList;

import com.hp.hpl.jena.graph.Triple;
import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryFactory;

public class Sparql {

	private String query;
	private List<Triple> triples;
	
	public Sparql()
	{
		query = null;
		triples = new ArrayList<Triple>();		
	}
	
	// parse the sparql query, put triples in the list
	public Sparql(String query){
		setQuery(query);
		triples = new ArrayList<Triple>();
		
	}
	
	public void parse(){

		Query parsed = QueryFactory.create(query);
		triples = TriplePattern.pipes(parsed.getQueryPattern());
	}
	
	public String getQuery(){
		return query;
	}
	
	public void setQuery(String query){
		this.query = query;
	}
	
	public int getEdgeNum(){
		return triples.size();
	}
	
	public List<Triple> getTriples(){
		return triples;
	}
	
}
