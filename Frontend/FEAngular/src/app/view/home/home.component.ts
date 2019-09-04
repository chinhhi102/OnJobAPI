import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { CourseService } from 'src/app/services/course.service';
import { Router } from '@angular/router';
import { Course } from 'src/app/models/course';
import { SubjectService } from 'src/app/services/subject.service';
import { StudentService } from 'src/app/services/student.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {
  courses: Observable<Course[]>;
  numOfCourses: number;
  numOfSubject: number;
  numOfStudent: number;
  
  constructor(private courseService: CourseService,
    private subjectService : SubjectService,
    private studentService : StudentService,
    private router: Router) {}

  ngOnInit() {
    this.reloadData();
  }

  reloadData() {
    this.courses = this.courseService.getCourseList();
    this.subjectService.getSubjectList().subscribe(data => this.numOfSubject = data.length);
    this.studentService.getStudentList().subscribe(data => this.numOfStudent = data.length);
    this.courses.subscribe(data => this.numOfCourses = data.length);
  }

  deleteCourse(id: number) {
    this.courseService.deleteCourse(id)
      .subscribe(
        data => {
          console.log(data);
          this.reloadData();
        },
        error => console.log(error));
  }

  courseDetails(id: number){
    this.router.navigate(['course', id]);
  }
}