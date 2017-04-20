package creditcard.transaction;

import creditcard.model.CreditCardAccount;
import financialcore.general.MyOwnException;

public class TranWithdraw implements TranCommand {

	CreditCardAccount account = null;
	TransactionTemplate tranTemplate;

	public TranWithdraw(TransactionTemplate pTranTemplate) {
		tranTemplate = pTranTemplate;
		account = null;// TODO
	}

	@Override
	public void execute() throws MyOwnException {
		account.cashWidthdraw(tranTemplate.amount, tranTemplate.description);
	}

}