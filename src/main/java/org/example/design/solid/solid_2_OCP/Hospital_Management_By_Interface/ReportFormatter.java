package org.example.design.solid.solid_2_OCP.Hospital_Management_By_Interface;

public class ReportFormatter {
	
	String op;
	
	public ReportFormatter(Object e,FormatType format) {
		switch(format) {

			case XML:
				op= printXml(e, format);
				break;
			case CSV:
				op=printCsv(e, format);
				break;
		}
		
	}
	
	public static String printXml(Object e,FormatType format) {
		return "<title> "+e+" </title>";
	}
	public static String printCsv(Object e,FormatType format) {
		return 	",,, "+e+" ,,,";	
	}
	
	protected String getFormattedValue() {
		return op;
	}
}
