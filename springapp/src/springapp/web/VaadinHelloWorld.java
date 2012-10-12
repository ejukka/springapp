package springapp.web;

import com.vaadin.Application;
import com.vaadin.ui.Form;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.Table;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;

public class VaadinHelloWorld extends Application {

	private static final long serialVersionUID = 1L;
	private Table contactList = new Table();
	private Form contactEditor = new Form();
	private HorizontalLayout bottomLeftCorner = new HorizontalLayout();
	
	@Override
	public void init() {
		initLayout();
//		Window mainWindow = new Window("Hello world Vaadin!");
//		Label label = new Label("Hello Vaadin user");
//
//		mainWindow.addComponent(label);
//		setMainWindow(mainWindow);
	}

    private void initLayout() {
        HorizontalSplitPanel splitPanel = new HorizontalSplitPanel();
        setMainWindow(new Window("Address Book", splitPanel));
        VerticalLayout left = new VerticalLayout();
        left.setSizeFull();
        left.addComponent(contactList);
        contactList.setSizeFull();
        left.setExpandRatio(contactList, 1);
        splitPanel.addComponent(left);
        splitPanel.addComponent(contactEditor);
        contactEditor.setCaption("Contact details editor");
        contactEditor.setSizeFull();
        contactEditor.getLayout().setMargin(true);
        contactEditor.setImmediate(true);
        bottomLeftCorner.setWidth("100%");
        left.addComponent(bottomLeftCorner);
    }
}
