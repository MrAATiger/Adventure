package engine.ConsoleEngine;

public class HtmlFormatter {

	private static final String newLine = "<br>";
	private static final  String tableft = "<div style=\"margin-left: 20px\">";
	private static final  String tabRight = "</div>";
	
	public static String convertJavaToHtml(String text){
		
		int lastIndex = 0;
		int count =0;

		while(lastIndex != -1){

		       lastIndex = text.indexOf("\t",lastIndex);

		       if( lastIndex != -1){
		             count ++;
		             lastIndex+="\t".length();
		      }
		}
		
		
		text = text.replace("\n", newLine);
		text = text.replace("\t", tableft);
		
		while(count != 0){
			
			text+= tabRight;
			
			count--;
		}
		
		
		return text;
	}

	public static String convertASCIIToHtml(String text){
		
		String html = text;
		
		
		html = "<pre style=\"font-size:5px; font-style:normal; line-height:6px; font-family: \"Courier New\", Courier, mono;\">" + html + "</pre>";
		
		return html;
	}
	
}
