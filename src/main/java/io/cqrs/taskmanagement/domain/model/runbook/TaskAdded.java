package io.cqrs.taskmanagement.domain.model.runbook;

import io.cqrs.taskmanagement.domain.model.DomainEvent;
import lombok.Value;

@Value
public class TaskAdded implements DomainEvent {
    String taskId;
    String name;
    String description;
    String userId;
}
