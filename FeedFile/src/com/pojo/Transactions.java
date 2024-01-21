package com.pojo;

import java.util.Date;

public class Transactions {
		long transRef;
			Date val_date;
			String payerName;
			String payerAcc;
			String PayeeName;
			String payeeAcc;
			long amount;
			public Transactions(long transRef, Date val_date, String payerName, String payerAcc, String payeeName,
					String payeeAcc, long amount) {
				//super();
				this.transRef = transRef;
				this.val_date = val_date;
				this.payerName = payerName;
				this.payerAcc = payerAcc;
				PayeeName = payeeName;
				this.payeeAcc = payeeAcc;
				this.amount = amount;
			}
		
}
