package edu.elte.dependencyconverter.backend.form.view;

public class ConverterFormView {
	private String rawInputLines;
	private String rawConversationResult;

	public ConverterFormView() {}

	public String getRawInputLines() {
		return rawInputLines;
	}

	public void setRawInputLines(String rawInputLines) {
		this.rawInputLines = rawInputLines;
	}

	public String getRawConversationResult() {
		return rawConversationResult;
	}

	public void setRawConversationResult(String rawConversationResult) {
		this.rawConversationResult = rawConversationResult;
	}
}
