package com.lss.me;

import java.sql.Date;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;

public class F {
   public static void main(String[] args) {
	System.out.println("sfsd");
	DateFormat date =new DateFormat() {
		
		@Override
		public java.util.Date parse(String source, ParsePosition pos) {
			return null;
		}
		
		@Override
		public StringBuffer format(java.util.Date date, StringBuffer toAppendTo,
				FieldPosition fieldPosition) {
			return null;
		}
	};
}
}
