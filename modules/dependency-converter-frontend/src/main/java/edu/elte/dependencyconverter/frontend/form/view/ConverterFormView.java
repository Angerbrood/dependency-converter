package edu.elte.dependencyconverter.frontend.form.view;

public class ConverterFormView {
	private String rawInputLines;
	private String rawConversationResult;
	private String requestedFileType;
	private String errorMessage;

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

	public String getRequestedFileType() {
		return requestedFileType;
	}

	public void setRequestedFileType(String requestedFileType) {
		this.requestedFileType = requestedFileType;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
