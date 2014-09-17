package br.com.carlosgomes.util;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.FacesContext;

public class Mensagem {

	public static void addMessage(Severity severity, String mensagem) {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(severity, null, mensagem));		
	}
}
