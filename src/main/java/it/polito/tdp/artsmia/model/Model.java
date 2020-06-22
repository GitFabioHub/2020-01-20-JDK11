package it.polito.tdp.artsmia.model;

import java.util.LinkedList;
import java.util.List;

import it.polito.tdp.artsmia.db.ArtsmiaDAO;

public class Model {
	
	private ArtsmiaDAO dao;

	public Model() {
		this.dao = new ArtsmiaDAO();
	}
	public List<String> elencoRuoli(){
		
		List<String> l=new LinkedList<String>();
		l.addAll(dao.elencoRuoli());
		return l;

	}

}
