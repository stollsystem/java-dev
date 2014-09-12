package br.com.carlosgomes.util;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

public class TemplateManager {

	public String getTemplate(String templateName) throws Exception {

		Map<String, String> parameters = new HashMap<String, String>();
		return this.getTemplate(templateName, parameters);
	}

	public String getTemplate(String templateName, Map<String, String> parameters) throws Exception {

		VelocityEngine ve = new VelocityEngine();
		ve.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
		ve.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
		ve.init();

		Template template = ve.getTemplate(templateName);

		VelocityContext context = new VelocityContext();
		Iterator<Entry<String, String>> iterator = parameters.entrySet().iterator();
		
		while (iterator.hasNext()) {
			Entry<String, String> entry = iterator.next();
			context.put(entry.getKey(), entry.getValue());			
		}

		StringWriter writer = new StringWriter();
		template.merge(context, writer);
		
		return writer.toString();
	}

}
