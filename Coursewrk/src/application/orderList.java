package application;

/*
 * In this class I declare the setters and getters for the entries of table main.Orders3
 * 
 */

public class orderList {

	//Column1
		
		public orderList(String Time, String Date, String DataTableNumber, String QuStarter1, String QuStarter2, String QuStarter3, String QuMain1, String QuMain2, String QuMain3, String QuPudding1, String QuPudding2, String QuPudding3, String DataSpecialRequest, String DataEmployee) {
			super();
			this.Time=Time;
			this.Date=Date;
			this.DataTableNumber=DataTableNumber;
			this.QuStarter1=QuStarter1;
			this.QuStarter2=QuStarter2;
			this.QuStarter3=QuStarter3;
			this.QuMain1=QuMain1;
			this.QuMain2=QuMain2;
			this.QuMain3=QuMain3;
			this.QuPudding1=QuPudding1;
			this.QuPudding2=QuPudding2;
			this.QuPudding3=QuPudding3;
			this.DataSpecialRequest=DataSpecialRequest;
			this.DataEmployee=DataEmployee;
		}
		
		//Date
		private String Date;
		public String getDate() {
			return Date;
		}

		public void SetDate(String Date) {
			this.Date=Date;
		}
				
		//Time
		private String Time;
		public String getTime() {
			return Time;
		}

		public void setTime(String Time) {
			this.Time=Time;
		}
		
		//TableNumber
		private String DataTableNumber;
		public String getDataTableNumber() {
			return DataTableNumber;
		}

		public void setDataTableNumber(String DataTableNumber) {
			this.DataTableNumber=DataTableNumber;
		}
		//QuStarter1
		private String QuStarter1;

		public String getQuStarter1() {
			return QuStarter1;
		}

		public void setQuStarter1(String QuStarter1) {
			this.QuStarter1=QuStarter1;
		}	//QuStarter2
		private String QuStarter2;

		public String getQuStarter2() {
			return QuStarter2;
		}

		public void setQuStarter2(String QuStarter2) {
			this.QuStarter2=QuStarter2;
		}	//QuStarter3
		private String QuStarter3;

		public String getQuStarter3() {
			return QuStarter3;
		}

		public void setQuStarter3(String QuStarter3) {
			this.QuStarter3=QuStarter3;
		}	//QuMain1
		private String QuMain1;

		public String getQuMain1() {
			return QuMain1;
		}

		public void setQuMain1(String QuMain1) {
			this.QuMain1=QuMain1;
		}	//QuMain2
		private String QuMain2;

		public String getQuMain2() {
			return QuMain2;
		}

		public void setQuMain2(String QuMain2) {
			this.QuMain2=QuMain2;
		}	//QuMain3
		private String QuMain3;

		public String getQuMain3() {
			return QuMain3;
		}

		public void setQuMain3(String QuMain3) {
			this.QuMain3=QuMain3;
		}	//QuPudding1
		private String QuPudding1;

		public String getQuPudding1() {
			return QuPudding1;
		}

		public void setQuPudding1(String QuPudding1) {
			this.QuPudding1=QuPudding1;
		}	//QuPudding2
		private String QuPudding2;

		public String getQuPudding2() {
			return QuPudding2;
		}

		public void setQuPudding2(String QuPudding2) {
			this.QuPudding2=QuPudding2;
		}	//QuPudding3
		private String QuPudding3;

		public String getQuPudding3() {
			return QuPudding3;
		}

		public void setQuPudding3(String QuPudding3) {
			this.QuPudding3=QuPudding3;
		}	//DataSpecialRequest
		private String DataSpecialRequest;

		public String getDataSpecialRequest() {
			return DataSpecialRequest;
		}

		public void setDataSpecialRequest(String DataSpecialRequest) {
			this.DataSpecialRequest=DataSpecialRequest;
		}	//DataEmployee
		private String DataEmployee;

		public String getDataEmployee() {
			return DataEmployee;
		}

		public void setDataEmployee(String DataEmployee) {
			this.DataEmployee=DataEmployee;
		}


	
	
}
