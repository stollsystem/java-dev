package br.com.carlosgomes.util;

import java.util.Locale;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.apache.velocity.exception.ResourceNotFoundException;

@ManagedBean
@SessionScoped
public class Layout {
	
	private Locale locale = Locale.getDefault();
	private String templateNameLocal;
	private String templateNameDefault;
	private String template;
		
	private String getTemplate() {

		TemplateManager tm = new TemplateManager();

		try {
			template = tm.getTemplate(templateNameLocal);
		} catch (ResourceNotFoundException rnfe) {
			try {
				template = tm.getTemplate(templateNameDefault);
			} catch (Exception e) {
				template = null;
			}
		
		} catch (Exception e) {
			template = null;
		}

		return template;
	}
	
	public String getHeader() {
		templateNameLocal = "br/com/carlosgomes/template/header_" + locale.getLanguage() + ".vm";
		templateNameDefault = "br/com/carlosgomes/template/header.vm";

		return getTemplate();
	}

	public String getFooter() {
		templateNameLocal = "br/com/carlosgomes/template/footer_" + locale.getLanguage() + ".vm";
		templateNameDefault = "br/com/carlosgomes/template/footer.vm";

		return getTemplate();
	}
	
	public String getPageHeader() {
		templateNameLocal = "br/com/carlosgomes/template/pageHeader_" + locale.getLanguage() + ".vm";
		templateNameDefault = "br/com/carlosgomes/template/pageHeader.vm";

		return getTemplate();
	}


}
