package org.microapp.ui.books;

import java.util.List;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.repeater.Item;
import org.apache.wicket.markup.repeater.data.DataView;
import org.apache.wicket.markup.repeater.data.ListDataProvider;
import org.apache.wicket.spring.injection.annot.SpringBean;
import org.microapp.books.generic.service.GenericManager;
import org.microapp.books.model.Book;
import org.microapp.books.service.OwnedManager;
import org.microapp.ui.base.GenericPage;

public class BooksPage extends GenericPage {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@SpringBean
	private OwnedManager ownedManager;
	
	@SpringBean(name="bookManager")
	private GenericManager<Book, Long> bookManager;
	
	@Override
	public void inic() {
		// TODO Auto-generated method stub
		super.inic();
		setTitle("Wicket - books");
		setHeader("Books");
	}
	
	@Override
	public void addComponents() {
		// TODO Auto-generated method stub
		super.addComponents();
		showBooksTable("booksTable");
	}
	
	private void showBooksTable(String tableID) {
		
		List<Book> books = bookManager.getAll();
		
		final DataView dataViewv = new DataView(tableID,new ListDataProvider(books)) {

			@Override
			protected void populateItem(Item item) {
				// TODO Auto-generated method stub
				final Book book = (Book) item.getModelObject();
				
				item.add(new Label("bookId",book.getId()));
				item.add(new Label("bookName",book.getName()));
				item.add(new Label("bookYear",book.getYear()));
			}
			
		};
		
		add(dataViewv);
	}

}
