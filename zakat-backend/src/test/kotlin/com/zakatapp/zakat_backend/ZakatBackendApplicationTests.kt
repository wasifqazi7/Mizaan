package com.zakatapp.zakat_backend

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest(
	properties = [
		"spring.autoconfigure.exclude=org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration"
	]
)
class ZakatBackendApplicationTests {

	@Test
	fun contextLoads() {
	}
}
