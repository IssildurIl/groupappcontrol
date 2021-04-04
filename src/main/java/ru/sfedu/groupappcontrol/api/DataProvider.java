package ru.sfedu.groupappcontrol.api;


import lombok.NonNull;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.sfedu.groupappcontrol.Result;
import ru.sfedu.groupappcontrol.models.*;
import ru.sfedu.groupappcontrol.models.enums.TaskTypes;
import ru.sfedu.groupappcontrol.models.enums.TypeOfCompletion;
import ru.sfedu.groupappcontrol.models.enums.TypeOfEmployee;

import java.util.List;

/**
 * The interface Data provider.
 */
public interface DataProvider {
     /**
      * The constant log.
      */
     Logger log = LogManager.getLogger(DataProvider.class);

     /**
      * Init data source.
      */
     void initDataSource();


     /**
      * Get task by id.
      *
      * @param id the id
      * @return the task by id
      */
     Result<Task> getTaskById(long id);


     /**
      * Get developers task by id.
      *
      * @param id the id
      * @return the developers task by id
      */
     Result<DevelopersTask> getDevelopersTaskById(long id);


     /**
      * Get testers task by id.
      *
      * @param id the id
      * @return the testers task by id
      */
     Result<TestersTask> getTestersTaskById(long id);


     /**
      * Get employee by id.
      *
      * @param id the id
      * @return the employee by id
      */
     Result<Employee> getEmployeeById(long id);


     /**
      * Get developer by id.
      *
      * @param id the id
      * @return the developer by id
      */
     Result<Developer> getDeveloperById(long id);


     /**
      * Get tester by id.
      *
      * @param id the id
      * @return the tester by id
      */
     Result<Tester> getTesterById(long id);


     /**
      * Get project by id.
      *
      * @param id the id
      * @return the project by id
      */
     Result<Project> getProjectByID(long id);


     /**
      * Insert task.
      *
      * @param task the task
      * @return the result
      */
     Result<Void> insertTask(Task task);


     /**
      * Insert developers task.
      *
      * @param task the task
      * @return the result
      */
     Result<Void> insertDevelopersTask(DevelopersTask task);


     /**
      * Insert testers task.
      *
      * @param task the task
      * @return the result
      */
     Result<Void> insertTestersTask(TestersTask task);


     /**
      * Insert employee.
      *
      * @param employee the employee
      * @return the result
      */
     Result<Void> insertEmployee(Employee employee);


     /**
      * Insert developer.
      *
      * @param developer the developer
      * @return the result
      */
     Result<Void> insertDeveloper(Developer developer);


     /**
      * Insert tester.
      *
      * @param tester the tester
      * @return the result
      */
     Result<Void> insertTester(Tester tester);


     /**
      * Insert project.
      *
      * @param project the project
      * @return the result
      */
     Result<Project> insertProject(Project project);


     /**
      * Delete task.
      *
      * @param id the id
      * @return the result
      */
     Result<Void> deleteTask(long id);


     /**
      * Delete developers task.
      *
      * @param id the id
      * @return the result
      */
     Result<Void> deleteDevelopersTask(long id);


     /**
      * Delete testers task.
      *
      * @param id the id
      * @return the result
      */
     Result<Void> deleteTestersTask(long id);


     /**
      * Delete employee.
      *
      * @param id the id
      * @return the result
      */
     Result<Void> deleteEmployee(long id);


     /**
      * Delete developer.
      *
      * @param id the id
      * @return the result
      */
     Result<Void> deleteDeveloper(long id);


     /**
      * Delete tester.
      *
      * @param id the id
      * @return the result
      */
     Result<Void> deleteTester(long id);


     /**
      * Delete project.
      *
      * @param id the id
      * @return the result
      */
     Result<Void> deleteProject(long id);


     /**
      * Update task.
      *
      * @param task the task
      * @return the result
      */
     Result<Void> updateTask(Task task);


     /**
      * Update developers task.
      *
      * @param developersTask the developers task
      * @return the result
      */
     Result<Void> updateDevelopersTask(DevelopersTask developersTask);


     /**
      * Update testers task.
      *
      * @param testersTask the testers task
      * @return the result
      */
     Result<Void> updateTestersTask(TestersTask testersTask);


     /**
      * Update employee.
      *
      * @param employee the employee
      * @return the result
      */
     Result<Void> updateEmployee(Employee employee);


     /**
      * Update developer.
      *
      * @param developer the developer
      * @return the result
      */
     Result<Void> updateDeveloper(Developer developer);


     /**
      * Update tester.
      *
      * @param tester the tester
      * @return the result
      */
     Result<Void> updateTester(Tester tester);


     /**
      * Update project.
      *
      * @param project the project
      * @return the result
      */
     Result<Project> updateProject(Project project);


     /**
      * Create task.
      *
      * @param id              the id
      * @param taskDescription the task description
      * @param money           the money
      * @param scrumMaster     the scrum master
      * @param status          the status
      * @param team            the team
      * @param createdDate     the created date
      * @param deadline        the deadline
      * @param lastUpdate      the last update
      * @param taskType        the task type
      * @return the result
      */
     Result<Task> createTask(long id, @NonNull String taskDescription, @NonNull Double money,
                             @NonNull Employee scrumMaster, @NonNull TypeOfCompletion status,
                             @NonNull List<Employee> team, @NonNull String createdDate,
                             @NonNull String deadline, @NonNull String lastUpdate,
                             @NonNull TaskTypes taskType);

     /**
      * Get tasks.
      *
      * @param id the id
      * @return the tasks
      */
     Result<Task> getTasks(long id);


     /**
      * Get all task.
      *
      * @return the all task
      */
     List<Task> getAllTask();


     /**
      * Get tasks by user.
      *
      * @param userId the user id
      * @param taskId the task id
      * @return the tasks by user
      */
     Result<Task> getTasksByUser(long userId, long taskId);


     /**
      * Change task status.
      *
      * @param id     the id
      * @param status the status
      * @return the result
      */
     Result<Void> changeTaskStatus(long id, String status);


     /**
      * Calculate task cost.
      *
      * @param id the id
      * @return the result
      */
     Result<Double> calculateTaskCost(long id);


     /**
      * Write base task comment.
      *
      * @param id      the id
      * @param comment the comment
      * @return the result
      */
     Result<Void> writeBaseTaskComment(long id,String comment);


     /**
      * Write developers task comment.
      *
      * @param id      the id
      * @param comment the comment
      * @return the result
      */
     Result<Void> writeDevelopersTaskComment(long id,String comment);


     /**
      * Write testers task comment.
      *
      * @param id      the id
      * @param comment the comment
      * @return the result
      */
     Result<Void> writeTestersTaskComment(long id,String comment);


     /**
      * Gets task list by scrum master.
      *
      * @param id the id
      * @return the task list by scrum master
      */
     Result<List<Task>> getTaskListByScrumMaster(long id);


     /**
      * Gets developers task list by scrum master.
      *
      * @param id the id
      * @return the developers task list by scrum master
      */
     Result<List<DevelopersTask>> getDevelopersTaskListByScrumMaster(long id);


     /**
      * Gets testers task list by scrum master.
      *
      * @param id the id
      * @return the testers task list by scrum master
      */
     Result<List<TestersTask>> getTestersTaskListByScrumMaster(long id);


     /**
      * Create project.
      *
      * @param id                  the id
      * @param title               the title
      * @param takeIntoDevelopment the take into development
      * @param tasks               the tasks
      * @return the result
      */
     Result<Project> createProject(long id,@NonNull String title,@NonNull String takeIntoDevelopment,
                                   @NonNull List<Task> tasks);


     /**
      * Get project by id.
      *
      * @param empId     the emp id
      * @param projectId the project id
      * @return the project by id
      */
     Result<List<Project>> getProjectByScrumMasterId(long empId, long projectId);


     /**
      * Calculate project cost.
      *
      * @param id the id
      * @return the result
      */
     Result<Long> calculateProjectCost(long id);

     /**
      * Calculate project time.
      *
      * @param id the id
      * @return the result
      */
     Result<Long> calculateProjectTime(long id);


     /**
      * Create employee.
      *
      * @param id             the id
      * @param firstName      the first name
      * @param lastName       the last name
      * @param login          the login
      * @param password       the password
      * @param email          the email
      * @param token          the token
      * @param department     the department
      * @param typeOfEmployee the type of employee
      * @return the result
      */
     Result<Employee> createEmployee(long id,@NonNull String firstName,@NonNull String lastName,
                                            @NonNull String login,@NonNull String password,
                                            @NonNull String email,@NonNull String token,
                                            @NonNull String department,@NonNull TypeOfEmployee typeOfEmployee);


     /**
      * Get all employee.
      *
      * @return the all employee
      */
     List<Employee> getAllEmployee();


     /**
      * Get scrum master task list.
      *
      * @param userId    the user id
      * @param taskTypes the task types
      * @return the scrum master task list
      */
     Result<List<Task>> getScrumMasterTaskList(long userId, TaskTypes taskTypes);



}
