package com.group.librarayapp.service.user


import com.group.libraryapp.domain.user.UserRepository
import com.group.libraryapp.dto.user.request.UserCreateRequest
import com.group.libraryapp.service.user.UserService
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class UserServiceTest @Autowired constructor(
    private val userRepository: UserRepository,
    private val userService: UserService
) {

    @Test
    fun save_user_test() {
        // given
        val request = UserCreateRequest("홍길동", 20)

        // when
        userService.saveUser(request)

        // then
        val user = userRepository.findByName("홍길동")

        assertThat(user)
            .isNotNull

        assertThat(user?.name).isEqualTo("홍길동")
    }
}