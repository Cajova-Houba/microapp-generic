package org.microapp.ui.base;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.microapp.ui.HomePage;


/**
 * Base page for displaying tables from database.
 * It will set the title of the page and header of the page (typicaly name of the table).
 * 
 * The button back to homepage is also set.
 * 
 * To change default just override:
 * getTitle() - title
 * getHeader() - header
 * @author Zdenda
 *
 */
public class BaseTablePage extends WebPage {

	private static final long serialVersionUID = 1L;
	
	
	private static final String defTitle = "Wicket - base page"; 
	
	private static final String defHeader = "Name of the table";
	
	private String title;
	
	private String header;
	
	public BaseTablePage(PageParameters parameters) {
		this(parameters, defTitle, defHeader);
	}
	
	public BaseTablePage(PageParameters parameters, String title, String header) {
		super(parameters);
		// TODO Auto-generated constructor stub
		setTitle(title);
		setHeader(header);
		init();
	}

	/**
	 * Sets the title, errorMsg and header. This method must be called.
	 */
	
	public void init() {
		addLabel("title", getTitle());
		addLabel("header", getHeader());
		
		add(new Link("homepageBtn"){

			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				setResponsePage(HomePage.class);
			}
			
		});
	}
	
	/**
	 * Adds a new text label.
	 * @param id
	 * @param text
	 */
	public void addLabel(String id, String text) {
		add(new Label(id, text));
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
