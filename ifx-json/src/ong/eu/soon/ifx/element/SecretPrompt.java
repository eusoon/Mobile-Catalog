package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class SecretPrompt extends IFXObject {

	SecretIdent secretIdent;	 //	NC-36	 Required	 The ID of this secret. The client must return the ID along with the secret itself in .
	Prompt prompt;	 //	C-20	 Required	 Prompt. The short prompt to be displayed to the user, explaining the value to be returned in for this secret.
	Memo memo;	 //	C-255	 Optional	 Memo. This is a longer description of the meaning of above. This may be displayed to the user if the user requests more information regarding the intended meaning of .
	SecretOptional secretOptional;	 //	Boolean	 Optional	 If True, the secret does not need to be provided in the sent to the server in order for the server to process the requested message. If False or omitted, the secret does need to be provided in the sent to the server in order for the server to process the requested message.
	SecretFormat secretFormat;	 //	NC-1024	 Optional	 Secret Format.Regular expression describing the secret format. The definition and behavior of "Regular Expression" is per IEEE Std 1003.2-1992 (POSIX.2). General definition may be found at http://www.ciser.cornell.edu/info/regex.html
	SecretMask secretMask;	 //	NC-80	 Optional	 Secret Mask. Edit Mask for the user input for in . EditMask, in Section 3.1.1,specifies the format for .
	public SecretIdent getSecretIdent() {
		return secretIdent;
	}
	public void setSecretIdent(SecretIdent secretIdent) {
		this.secretIdent = secretIdent;
	}
	public Prompt getPrompt() {
		return prompt;
	}
	public void setPrompt(Prompt prompt) {
		this.prompt = prompt;
	}
	public Memo getMemo() {
		return memo;
	}
	public void setMemo(Memo memo) {
		this.memo = memo;
	}
	public SecretOptional getSecretOptional() {
		return secretOptional;
	}
	public void setSecretOptional(SecretOptional secretOptional) {
		this.secretOptional = secretOptional;
	}
	public SecretFormat getSecretFormat() {
		return secretFormat;
	}
	public void setSecretFormat(SecretFormat secretFormat) {
		this.secretFormat = secretFormat;
	}
	public SecretMask getSecretMask() {
		return secretMask;
	}
	public void setSecretMask(SecretMask secretMask) {
		this.secretMask = secretMask;
	}
	
}
