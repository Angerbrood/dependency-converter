package edu.elte.dependencyconverter.backend.form.view;

import edu.elte.dependencyconverter.backend.dto.GradleResult;
import edu.elte.dependencyconverter.backend.dto.MavenDto;

public class MavenFormView {
	private MavenDto mavenDto;
	private GradleResult gradleResult;
	
	
	public MavenFormView() {
		mavenDto = new MavenDto();
		gradleResult = new GradleResult();
	}


	public MavenDto getMavenDto() {
		return mavenDto;
	}


	public void setMavenDto(MavenDto mavenDto) {
		this.mavenDto = mavenDto;
	}


	public GradleResult getGradleResult() {
		return gradleResult;
	}


	public void setGradleResult(GradleResult gradleResult) {
		this.gradleResult = gradleResult;
	}
	
	
	
}
