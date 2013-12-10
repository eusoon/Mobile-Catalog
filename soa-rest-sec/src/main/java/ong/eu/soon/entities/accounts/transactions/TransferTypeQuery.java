package ong.eu.soon.entities.accounts.transactions;

import ong.eu.soon.entities.accounts.AccountOwner;
import ong.eu.soon.entities.accounts.Currency;
import ong.eu.soon.services.transactions.TransactionContext;

public class TransferTypeQuery {
	private AccountOwner fromOwner;
	private Currency currency;
	private TransactionContext context;

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public TransactionContext getContext() {
		return context;
	}

	public void setContext(TransactionContext context) {
		this.context = context;
	}

	public AccountOwner getFromOwner() {
		return fromOwner;
	}

	public void setFromOwner(AccountOwner fromOwner) {
		this.fromOwner = fromOwner;
	}

}
