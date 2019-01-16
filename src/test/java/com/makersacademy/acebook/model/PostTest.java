package com.makersacademy.acebook.model;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class PostTest {

	private Post post = new Post("First Post", "Hello Worlds!");

	@Test
	public void postHasContent() {
		assertThat(post.getContent(), containsString("Hello Worlds!"));
	}

}
