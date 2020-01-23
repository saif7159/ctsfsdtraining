package com.injection.annotation.todo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Component
public class Task {
@Value("${task.name}")	
private String taskname;
@Value("${task.completion}")
boolean isCompleted;

}
