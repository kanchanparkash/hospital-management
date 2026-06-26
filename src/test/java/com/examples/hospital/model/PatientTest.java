package com.examples.hospital.model;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class PatientTest {

	@Test
	public void testToString() {
		Patient patient = new Patient("1", "Mario Rossi");

		assertThat(patient)
			.hasToString("Patient [id=1, name=Mario Rossi]");
	}

	@Test
	public void testEquals() {
		Patient patient = new Patient("1", "Mario Rossi");
		Patient samePatient = new Patient("1", "Mario Rossi");

		assertThat(patient)
			.isEqualTo(samePatient);
	}

	@Test
	public void testHashCode() {
		Patient patient = new Patient("1", "Mario Rossi");
		Patient samePatient = new Patient("1", "Mario Rossi");

		assertThat(patient)
			.hasSameHashCodeAs(samePatient);
	}
}
