package kz.bcc.tutorial.balatime.service.admin;

import kz.bcc.tutorial.balatime.model.dto.WorkspaceRow;

import java.util.List;

public interface TeacherWorkspaceService {
     List<WorkspaceRow> getAll(Integer teacherId);
}
