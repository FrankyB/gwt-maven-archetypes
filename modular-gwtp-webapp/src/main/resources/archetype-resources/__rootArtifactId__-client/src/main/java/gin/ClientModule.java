package ${package}.gin;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;

import ${package}.place.ClientPlaceManager;
import ${package}.place.DefaultPlace;
import ${package}.place.NameTokens;

public class ClientModule extends AbstractPresenterModule {

	@Override
	protected void configure() {
		install(new DefaultModule(ClientPlaceManager.class));
	}
}
