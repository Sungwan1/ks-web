package com.sungwan.app;

import com.sungwan.app.entity.*;
import com.sungwan.app.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppApplication implements CommandLineRunner {
	private final PersonRepository personRepository;
	private final SocialMediaRepository socialMediaRepository;
	private final InterestsRepository interestsRepository;
	private final SkillRepository skillRepository;
	private final WorkRepository workRepository;

	public AppApplication(PersonRepository personRepository, SocialMediaRepository socialMediaRepository, InterestsRepository interestsRepository, SkillRepository skillRepository, WorkRepository workRepository) {
		this.personRepository = personRepository;
		this.socialMediaRepository = socialMediaRepository;
		this.interestsRepository = interestsRepository;
		this.skillRepository = skillRepository;
		this.workRepository = workRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		personRepository.save(new Person("예승완", "프론트", "hello.test.com", "010-1234-5678"));
		socialMediaRepository.save(new SocialMedia("anonymous", "null", "null", "anonymous"));
		interestsRepository.save(new Interests("Game"));
		interestsRepository.save(new Interests("Exercise"));
		skillRepository.save(new Skill("A", 80));
		workRepository.save(new Work("front", "a", "1", "a"));
	}
}
