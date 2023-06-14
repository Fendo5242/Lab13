package com.tecsup.petclinic.webs;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;

public class OwnerControllerTest {

	@Test
	public void testFindOwnerOK() throws Exception {
		String FIRSTNAME_OWNER = "Leonardo";}
		String LASTNAME_OWNER = "Ortega";
		String ADDRESS_OWNER = "Santa anita";
		String CITY_OWNER = "Lima";
		String TELEPHONE_OWNER = "98635214";
		
		mockMvc.perform(get("owners/1"))
				.andExpect(status().isOk())
				.andExpect("$.id", is(1))
				.andExpect("$.firstname", is(FIRSTNAME_OWNER ))
				.andExpect("$.lastname", is(LASTNAME_OWNER))
				.andExpect("$.address", is(ADDRESS_OWNER))
				.andExpect("$.city", is(CITY_OWNER))
				.andExpect("$.thelephone", is(TELEPHONE_OWNER));		
	}
}
