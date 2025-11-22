package pl.wsb.fitnesstracker.userevent.api;

import java.util.Optional;

public interface UserEventProvider {

    /**
     * Retrieves a training based on their ID.
     * If the user with given ID is not found, then {@link Optional#empty()} will be returned.
     *
     * @param userEventId id of the user event table to be searched
     * @return An {@link Optional} containing the located Training, or {@link Optional#empty()} if not found
     */
    Optional<UserEvent> getUserEvent(Long userEventId);

}
