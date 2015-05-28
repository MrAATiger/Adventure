package engine.ConsoleEngine;

/**
 * Diese Klasse formatiert String in HTML
 * 
 * @author Ludwig
 *
 */
public class HtmlFormatter {

	private static final String newLine = "<br>";
	private static final String tableft = "&nbsp;&nbsp;&nbsp;";

	public static String convertJavaToHtml(String text) {

		text = text.replace("\n", newLine);
		text = text.replace("\t", tableft);

		text = decodeHtmlUmlaute(text);

		return text;
	}

	public static String decodeHtmlUmlaute(String text) {

		text = text.replace("ä", "&auml;");
		text = text.replace("Ä", "&Auml;");

		text = text.replace("ü", "&uuml;");
		text = text.replace("Ü", "&Uuml;");

		text = text.replace("ö", "&ouml;");
		text = text.replace("Ö", "&ouml;");

		text = text.replace("ß", "&szlig;");

		return text;
	}

	public static String encodeHtmlUmlaute(String text) {

		text = text.replace("&auml;", "ä");
		text = text.replace("&Auml;", "Ä");

		text = text.replace("&uuml;", "ü");
		text = text.replace("&Uuml;", "Ü");

		text = text.replace("&ouml;", "ö");
		text = text.replace("&ouml;", "Ö");

		text = text.replace("&szlig;", "ß");

		return text;
	}

	public static String convertASCIIToHtml(String text, int font_size) {

		String html = text;

		html = "<pre style=\"font-size:" + font_size + "px; font-style:normal; line-height:6px; font-family: \"Courier New\", Courier, mono;\">" + html + "</pre>";

		return html;
	}

}
