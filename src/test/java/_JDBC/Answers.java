package _JDBC;

import org.testng.annotations.Test;

import java.sql.*;

public class Answers  extends JDPCPARENT2 {


    @Test
    public void Test1() throws SQLException {


        String url = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com/employees";
        String username = "root";
        String password = "'\"-LhCB'.%k[4S]z";
        Connection baglanti = DriverManager.getConnection(url, username, password);


        Statement sorguEkrani = baglanti.createStatement();
        ResultSet rs = sorguEkrani.executeQuery("SELECT * FROM employees INNER JOIN dept_emp ON employees.emp_no = dept_emp.emp_no WHERE dept_no = 'D001'");


        while (rs.next()) {

            int empNo = rs.getInt("emp_no");
            String firstName = rs.getString("first_name");
            String lastName = rs.getString("last_name");
            String deptNo = rs.getString("dept_no");

            System.out.println("Employee Number: " + empNo + ", First Name: " + firstName + ", Last Name: " + lastName + ", Dept No: " + deptNo);
        }

    }

    @Test
    public void Test3() throws SQLException {


        String url = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com/employees";
        String username = "root";
        String password = "'\"-LhCB'.%k[4S]z";
        Connection baglanti = DriverManager.getConnection(url, username, password);


        Statement sorguEkrani = baglanti.createStatement();
        ResultSet rs = sorguEkrani.executeQuery("SELECT AVG(salary) AS average_salary FROM salaries");


        if (rs.next()) {
            double averageSalary = rs.getDouble("average_salary");
            System.out.println("Average Salary: " + averageSalary);
        }

    }

    @Test
    public void Test4() throws SQLException {


        String url = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com/employees";
        String username = "root";
        String password = "'\"-LhCB'.%k[4S]z";
        Connection baglanti = DriverManager.getConnection(url, username, password);


        Statement sorguEkrani = baglanti.createStatement();
        ResultSet rs = sorguEkrani.executeQuery("SELECT AVG(s.salary) AS average_salary FROM employees INNER JOIN salaries s ON e.emp_no = s.emp_no WHERE e.gender = 'F'");

        if (rs.next()) {
            double averageSalary = rs.getDouble("average_salary");
            System.out.println("Average Salary for Female Employees: " + averageSalary);
        } else {
            System.out.println("No data found.");
        }


    }

    @Test
    public void Test6() throws SQLException {


        String url = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com/employees";
        String username = "root";
        String password = "'\"-LhCB'.%k[4S]z";
        Connection baglanti = DriverManager.getConnection(url, username, password);

        Statement sorguEkrani = baglanti.createStatement();
        ResultSet rs = sorguEkrani.executeQuery("SELECT e.*, s.salary FROM employees JOIN dept_emp de ON e.emp_no = de.emp_no JOIN departments d ON de.dept_no = d.dept_no JOIN salaries s ON e.emp_no = s.emp_no WHERE d.dept_name = 'Sales' AND s.salary > 70000;");

        while (rs.next()) {
            int empNo = rs.getInt("emp_no");
            String birthDate = rs.getString("birth_date");
            String firstName = rs.getString("first_name");
            String lastName = rs.getString("last_name");
            String gender = rs.getString("gender");
            Date hireDate = rs.getDate("hire_date");
            double salary = rs.getDouble("salary");

            System.out.println("Employee No: " + empNo +
                    ", Birth Date: " + birthDate +
                    ", First Name: " + firstName +
                    ", Last Name: " + lastName +
                    ", Gender: " + gender +
                    ", Hire Date: " + hireDate +
                    ", Salary: " + salary);
        }


    }

    @Test
    public void Test11() throws SQLException {


        String url = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com/employees";
        String username = "root";
        String password = "'\"-LhCB'.%k[4S]z";
        Connection baglanti = DriverManager.getConnection(url, username, password);

        Statement sorguEkrani = baglanti.createStatement();
        ResultSet rs = sorguEkrani.executeQuery("SELECT emp_no, salary, to_date\n" +
                "FROM salaries\n" +
                "WHERE emp_no = '10102'\n" +
                "ORDER BY to_date;");


        while (rs.next()) {
            int empNo = rs.getInt("emp_no");
            double salary = rs.getDouble("salary");
            String toDate = rs.getString("to_date");

            System.out.println("Employee_No: " + empNo + ", Salary: " + salary + ", To_date: " + toDate);
        }


    }

    @Test
    public void Test14() throws SQLException {


        String url = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com/employees";
        String username = "root";
        String password = "'\"-LhCB'.%k[4S]z";
        Connection baglanti = DriverManager.getConnection(url, username, password);

        Statement sorguEkrani = baglanti.createStatement();
        ResultSet rs = sorguEkrani.executeQuery("SELECT e.first_name, e.last_name, MAX(s.salary) AS highest_salary\n" +
                "FROM employees e\n" +
                "INNER JOIN dept_emp de ON e.emp_no = de.emp_no\n" +
                "INNER JOIN departments d ON de.dept_no = d.dept_no\n" +
                "INNER JOIN salaries s ON e.emp_no = s.emp_no\n" +
                "WHERE d.dept_name = 'Sales'\n" +
                "GROUP BY e.first_name, e.last_name\n" +
                "ORDER BY highest_salary DESC\n" +
                "LIMIT 1;");
        if (rs.next()) {
            String firstName = rs.getString("first_name");
            String lastName = rs.getString("last_name");
            double highestSalary = rs.getDouble("highest_salary");

            System.out.println("Employee with Highest Salary in Sales Department:");
            System.out.println("First Name: " + firstName);
            System.out.println("Last Name: " + lastName);
            System.out.println("Highest Salary: " + highestSalary);
        } else {
            System.out.println("No data found.");
        }
    }

    @Test
    public void Test18() throws SQLException {


        String url = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com/employees";
        String username = "root";
        String password = "'\"-LhCB'.%k[4S]z";
        Connection baglanti = DriverManager.getConnection(url, username, password);

        Statement sorguEkrani = baglanti.createStatement();
        ResultSet rs = sorguEkrani.executeQuery("SELECT first_name, last_name, hire_date\n" +
                "FROM employees\n" +
                "WHERE hire_date < '1990-01-01'\n" +
                "ORDER BY first_name ASC, last_name ASC;");

        while (rs.next()) {
            String firstName = rs.getString("first_name");
            String lastName = rs.getString("last_name");
            Date hireDate = rs.getDate("hire_date");

            System.out.println("First Name: " + firstName +
                    ", Last Name: " + lastName +
                    ", Hire Date: " + hireDate);
        }
    }

    @Test
    public void Test26() throws SQLException {


        String url = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com/employees";
        String username = "root";
        String password = "'\"-LhCB'.%k[4S]z";
        Connection baglanti = DriverManager.getConnection(url, username, password);

        Statement sorguEkrani = baglanti.createStatement();
        ResultSet rs = sorguEkrani.executeQuery("SELECT *\n" +
                "FROM employees e\n" +
                "INNER JOIN salaries s ON e.emp_no = s.emp_no\n" +
                "INNER JOIN titles t ON e.emp_no = t.emp_no\n" +
                "WHERE e.first_name = 'Annemarie' AND e.last_name = 'Redmiles';");
        while (rs.next()) {
            String firstName = rs.getString("first_name");
            String lastName = rs.getString("last_name");
            double salary = rs.getDouble("salary");
            String title = rs.getString("title");

            System.out.println("First Name: " + firstName +
                    ", Last Name: " + lastName +
                    ", Salary: " + salary +
                    ", Title: " + title);
        }

    }

    @Test
    public void Test29() throws SQLException {


        String url = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com/employees";
        String username = "root";
        String password = "'\"-LhCB'.%k[4S]z";
        Connection baglanti = DriverManager.getConnection(url, username, password);

        Statement sorguEkrani = baglanti.createStatement();
        ResultSet rs = sorguEkrani.executeQuery("SELECT e.emp_no, e.first_name, e.last_name, e.birth_date, e.gender, e.hire_date\n" +
                "FROM employees e\n" +
                "JOIN dept_manager dm ON e.emp_no = dm.emp_no\n" +
                "JOIN departments d ON dm.dept_no = d.dept_no\n" +
                "JOIN titles t ON e.emp_no = t.emp_no\n" +
                "WHERE d.dept_name = 'Sales' AND t.title = 'Manager';");
        while (rs.next()) {
            int empNo = rs.getInt("emp_no");
            String firstName = rs.getString("first_name");
            String lastName = rs.getString("last_name");
            Date birthDate = rs.getDate("birth_date");
            String gender = rs.getString("gender");
            Date hireDate = rs.getDate("hire_date");

            System.out.println("Employee No: " + empNo +
                    ", First Name: " + firstName +
                    ", Last Name: " + lastName +
                    ", Birth Date: " + birthDate +
                    ", Gender: " + gender +
                    ", Hire Date: " + hireDate);
        }

    }

    @Test
    public void Test31() throws SQLException {


        String url = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com/employees";
        String username = "root";
        String password = "'\"-LhCB'.%k[4S]z";
        Connection baglanti = DriverManager.getConnection(url, username, password);

        Statement sorguEkrani = baglanti.createStatement();
        ResultSet rs = sorguEkrani.executeQuery("SELECT employees.first_name, employees.last_name, MAX(salaries.salary) AS max_salary\n" +
                "FROM employees\n" +
                "JOIN salaries ON employees.emp_no = salaries.emp_no\n" +
                "JOIN dept_emp ON employees.emp_no = dept_emp.emp_no\n" +
                "WHERE dept_emp.dept_no = 'D004';");
        while (rs.next()) {
            String firstName = rs.getString("first_name");
            String lastName = rs.getString("last_name");
            double maxSalary = rs.getDouble("max_salary");

            System.out.println("First Name: " + firstName +
                    ", Last Name: " + lastName +
                    ", Max Salary: " + maxSalary);
        }

    }

    @Test
    public void Test33() throws SQLException {


        String url = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com/employees";
        String username = "root";
        String password = "'\"-LhCB'.%k[4S]z";
        Connection baglanti = DriverManager.getConnection(url, username, password);

        Statement sorguEkrani = baglanti.createStatement();
        ResultSet rs = sorguEkrani.executeQuery("SELECT AVG(DATEDIFF(CURRENT_DATE, birth_date) / 365) AS avg_age FROM employees;");
        if (rs.next()) {
            double avgAge = rs.getDouble("avg_age");

            System.out.println("Average Age: " + avgAge);
        }

    }

    @Test
    public void Test34() throws SQLException {


        String url = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com/employees";
        String username = "root";
        String password = "'\"-LhCB'.%k[4S]z";
        Connection baglanti = DriverManager.getConnection(url, username, password);

        Statement sorguEkrani = baglanti.createStatement();
        ResultSet rs = sorguEkrani.executeQuery("SELECT dept_no, COUNT(*) AS employee_count\n" +
                "FROM dept_emp\n" +
                "GROUP BY dept_no;");
        while (rs.next()) {
            String deptNo = rs.getString("dept_no");
            int employeeCount = rs.getInt("employee_count");

            System.out.println("Department No: " + deptNo +
                    ", Employee Count: " + employeeCount);
        }

    }

    @Test
    public void Test38() throws SQLException {


        String url = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com/employees";
        String username = "root";
        String password = "'\"-LhCB'.%k[4S]z";
        Connection baglanti = DriverManager.getConnection(url, username, password);

        Statement sorguEkrani = baglanti.createStatement();
        ResultSet rs = sorguEkrani.executeQuery("SELECT dept_no, COUNT(*) AS employee_count\n" +
                "FROM dept_emp\n" +
                "GROUP BY dept_no;");

        while (rs.next()) {
            String firstName = rs.getString("first_name");
            String lastName = rs.getString("last_name");

            System.out.println("First Name: " + firstName +
                    ", Last Name: " + lastName);
        }
    }
}