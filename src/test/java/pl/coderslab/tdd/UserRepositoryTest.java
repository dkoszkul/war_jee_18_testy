package pl.coderslab.tdd;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class UserRepositoryTest {

    // Tworzenie użytkownika.
    @Test
    public void shouldCreateUser() {
        // given


        // when
        User result = new UserRepository().create("Ala");

        //then
        assertNotNull(result);
        assertThat(result.getName(), is("Ala"));
        assertNotNull(result.getId());
    }

    @Test
    public void shouldEditExistingUser() {
        // given
        UserRepository userRepository = new UserRepository();
        User user = userRepository.create("Ala"); // tworzymy nowego usera

        user.setName("Bela");
        // when
        userRepository.update(user);

        // then
        User result = userRepository.getUser(user.getId());
        assertThat(result.getName(), is("Bela"));
        assertThat(result.getId(), is(user.getId()));
    }

    @Test
    public void shouldRemoveUser() {
        // given
        UserRepository userRepository = new UserRepository();
        User user = userRepository.create("Ala"); // tworzymy nowego usera

        // when
        userRepository.remove(user);

        // then
        User result = userRepository.getUser(user.getId());
        assertNull(result);
    }

}