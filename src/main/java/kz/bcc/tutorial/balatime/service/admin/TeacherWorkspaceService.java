package kz.bcc.tutorial.balatime.service.admin;

import kz.bcc.tutorial.balatime.model.dto.teacher.WorkspaceRow;

import java.util.List;

public interface TeacherWorkspaceService {
     List<WorkspaceRow> getAll(String username);
}
