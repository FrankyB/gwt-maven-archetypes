package it.pkg;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.gwtplatform.mvp.client.DelayedBindRegistry;

import it.pkg.gin.ClientGinjector;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class BasicGwtp implements EntryPoint {
	private final ClientGinjector ginjector = GWT.create(ClientGinjector.class);
	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		Window.alert("Huhu!");

		// This is required for Gwt-Platform proxy's generator	
		DelayedBindRegistry.bind(ginjector);
	
		ginjector.getPlaceManager().revealCurrentPlace();
	}
}
