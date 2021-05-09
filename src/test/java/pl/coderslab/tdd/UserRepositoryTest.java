package pl.coderslab.tdd;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class UserRepositoryTest {

    @Test
    public void shouldCreateNewUser() {
        // given
        User user = new User();
        user.setName("Name");

        UserRepository userRepository = new UserRepository();

        // when
        User result = userRepository.createUser(user);

        // then
        assertNotNull(result);
        assertThat(result.getId(), is(1));
        assertThat(result.getName(), is(user.getName()));

    }
}