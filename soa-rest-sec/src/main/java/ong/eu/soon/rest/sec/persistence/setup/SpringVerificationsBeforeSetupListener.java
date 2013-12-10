package ong.eu.soon.rest.sec.persistence.setup;


import ong.eu.soon.rest.common.event.BeforeSetupEvent;
import ong.eu.soon.rest.sec.web.controller.AuthenticationController;
import ong.eu.soon.rest.sec.web.controller.MobileServiceController;
import ong.eu.soon.rest.sec.web.controller.PrivilegeController;
import ong.eu.soon.rest.sec.web.controller.RoleController;
import ong.eu.soon.rest.sec.web.controller.ServiceController;
import ong.eu.soon.rest.sec.web.controller.ServiceProviderController;
import ong.eu.soon.rest.sec.web.controller.StoreController;
import ong.eu.soon.rest.sec.web.controller.UserController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.google.common.base.Preconditions;

@Component
@Profile("production")
public final class SpringVerificationsBeforeSetupListener implements ApplicationListener<BeforeSetupEvent> {
	// private final Logger logger = LoggerFactory.getLogger(SpringVerificationsBeforeSetupListener.class);

	@Autowired
	ApplicationContext context;

	public SpringVerificationsBeforeSetupListener() {
		super();
	}

	// API

	@Override
	public final void onApplicationEvent(final BeforeSetupEvent event) {
		Preconditions.checkNotNull(context.getBean(PrivilegeController.class));
		Preconditions.checkNotNull(context.getBean(RoleController.class));
		Preconditions.checkNotNull(context.getBean(UserController.class));
		Preconditions.checkNotNull(context.getBean(AuthenticationController.class));
		Preconditions.checkNotNull(context.getBean(StoreController.class));
		Preconditions.checkNotNull(context.getBean(ServiceController.class));
		Preconditions.checkNotNull(context
				.getBean(ServiceProviderController.class));
		Preconditions.checkNotNull(context
				.getBean(MobileServiceController.class));
	}

}