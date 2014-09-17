package br.com.carlosgomes.util;

import javax.faces.context.FacesContext;

public class ObjetoUtil {
	
	public static void putFlash(String key, Object object) {
		FacesContext.getCurrentInstance().getExternalContext().getFlash().put(key, object);
	}
	
	public static Object getFlash(String key) {
		return FacesContext.getCurrentInstance().getExternalContext().getFlash().get(key);
	}
}
