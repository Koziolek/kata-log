package pl.koziolekweb;

/**
 * TODO write JAVADOC!!!
 * User: koziolek
 */
public class TooYoungClientException extends RuntimeException {
	private final Client client;

	public TooYoungClientException(Client client) {
		this.client = client;
	}

	@Override
	public String getMessage() {
		return String.format("Client %s is too young", client);
	}
}
