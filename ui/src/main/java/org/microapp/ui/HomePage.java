package org.microapp.ui;

import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.spring.injection.annot.SpringBean;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.WebPage;
import org.microapp.ui.books.BooksPage;
import org.microapp.ui.membership.MembershipPage;

import com.yoso.dev.membernet.membership.service.MembershipManager;

public class HomePage extends WebPage {
	private static final long serialVersionUID = 1L;
	
	public HomePage(final PageParameters parameters) {
		super(parameters);

		add(new Label("version", getApplication().getFrameworkSettings().getVersion()));

		// TODO Add your page's components here
		
		add(new Link("membership") {

			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				setResponsePage(MembershipPage.class);
			}
			
		});
		
		add(new Link("books") {

			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				setResponsePage(BooksPage.class);
			}
			
		});
    }
}
