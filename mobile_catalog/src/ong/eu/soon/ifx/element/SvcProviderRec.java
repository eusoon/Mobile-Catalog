package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;
import ong.eu.soon.ifx.element.SvcIdent;
import ong.eu.soon.ifx.element.SvcProviderId;
import ong.eu.soon.ifx.element.SvcProviderInfo;

public class SvcProviderRec extends IFXObject {
	SvcIdent svcIdent;//Aggregate	Optional Service Identifier
	SvcProviderId svcProviderId;//Identifier	Required Service Provider Identifier
	SvcProviderInfo svcProviderInfo;//Aggregate	Required Service Provider Information Aggregate
	SvcProviderEnvr svcProviderEnvr;//Aggregate	Optional Service Provider Environment Aggregate
	SvcProviderStatus svcProviderStatus;//Aggregate	Required Service Provider Status Aggregate

}
