//interface that states contract for clearing and adding students
//obviously the student class will implement this interface
package datamanagement;

/**
 * @author jtulip
 */

public interface IStudentLister {

    public void clearStudents();
    public void addStudent(IStudent student);
}
