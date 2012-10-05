package springapp.web;

import com.vaadin.Application;
import com.vaadin.ui.Label;
import com.vaadin.ui.Window;

public class VaadinHelloWorld extends Application {

	private static final long serialVersionUID = 1L;

	@Override
	public void init() {
		Window mainWindow = new Window("Myproject Application");
		Label label = new Label("Hello Vaadin user");
		mainWindow.addComponent(label);
		setMainWindow(mainWindow);
	}
}