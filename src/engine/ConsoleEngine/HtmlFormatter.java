package engine.ConsoleEngine;

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

		text = text.replace("�", "&auml;");
		text = text.replace("�", "&Auml;");

		text = text.replace("�", "&uuml;");
		text = text.replace("�", "&Uuml;");

		text = text.replace("�", "&ouml;");
		text = text.replace("�", "&ouml;");

		text = text.replace("�", "&szlig;");

		return text;
	}

	public static String encodeHtmlUmlaute(String text) {

		text = text.replace("&auml;", "�");
		text = text.replace("&Auml;", "�");

		text = text.replace("&uuml;", "�");
		text = text.replace("&Uuml;", "�");

		text = text.replace("&ouml;", "�");
		text = text.replace("&ouml;", "�");

		text = text.replace("&szlig;", "�");

		return text;
	}

	public static String convertASCIIToHtml(String text) {

		String html = text;

		html = "<pre style=\"font-size:5px; font-style:normal; line-height:6px; font-family: \"Courier New\", Courier, mono;\">" + html + "</pre>";

		return html;
	}

}
