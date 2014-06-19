package com.facebook.presto.cli.sparql2sql;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.hp.hpl.jena.graph.Triple;
import com.hp.hpl.jena.sparql.syntax.Element;
import com.hp.hpl.jena.sparql.syntax.ElementMinus;
import com.hp.hpl.jena.sparql.syntax.ElementTriplesBlock;
import com.hp.hpl.jena.sparql.syntax.ElementVisitor;
import com.hp.hpl.jena.sparql.syntax.ElementVisitorBase;
import com.hp.hpl.jena.sparql.syntax.ElementWalker;

public class TriplePattern {
	
	public static List<Triple> pipes(Element element) { return pipes(new ArrayList<Triple>(), element) ; }

    public static List<Triple> pipes(List<Triple> s, Element element){
    	 
        ElementVisitor v = new PatternVarsVisitor(s) ;
        ElementWalker.Walker walker = new WalkerSkipMinus(v) ;
        ElementWalker.walk(element, walker, v) ;
        return s ;
    }
    
    static class WalkerSkipMinus extends ElementWalker.Walker{

        protected WalkerSkipMinus(ElementVisitor visitor) {
            super(visitor) ;	           
        }
        
        @Override
        public void visit(ElementMinus el){
            proc.visit(el) ;
        }
    }

    static class PatternVarsVisitor extends ElementVisitorBase {
        private List<Triple> acc ;
        
        private PatternVarsVisitor(List<Triple> s){ 
        	acc = s ;        
        }  
        public void visit(ElementTriplesBlock el){
            for (Iterator<Triple> iter = el.patternElts() ; iter.hasNext() ; ){
                Triple t = iter.next() ;               
                acc.add(t);
            }
        }
    }		
}
