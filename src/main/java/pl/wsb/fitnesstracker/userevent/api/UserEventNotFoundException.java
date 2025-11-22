package pl.wsb.fitnesstracker.userevent.api;

import pl.wsb.fitnesstracker.exception.api.NotFoundException;

/**
 * Exception indicating that the {@link Training} was not found.
 */
@SuppressWarnings("squid:S110")
public class UserEventNotFoundException extends NotFoundException {

    private UserEventNotFoundException(String message) {
        super(message);
    }

    public UserEventNotFoundException(Long id) {
        this("UserEvent with ID=%s was not found".formatted(id));
    }

}
