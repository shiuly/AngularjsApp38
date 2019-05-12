/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/simple")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class Service {

    StudentService simpleService = new StudentService();

    @GET
    public List<Student> getAllStudent() {
        
        return simpleService.getAllStudent();
    }

    
    @POST
    public Student addStudent(Student s){
        
        return simpleService.addStudent(s);
    }
    
    @PUT
    @Path("/up/{studentId}")
    public Student updateStudent(@PathParam("studentId") int id, Student stu){
        stu.setId(id);
        return simpleService.updateStudent(stu);
    }
    
    @DELETE
    @Path("/del/{studentId}")
    public void deleteStudent(@PathParam("studentId") int id){
        simpleService.removeStudent(id);
    }
    
    @GET
    @Path("/{studentId}")
    public Student getStudentById(@PathParam("studentId") int id) {
        
      return simpleService.findStudentById(id);
    }

}
