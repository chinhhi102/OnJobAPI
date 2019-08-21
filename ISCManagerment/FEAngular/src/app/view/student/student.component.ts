import { Component, OnInit } from '@angular/core';
import { Students } from '../../models/students'
import { hasLifecycleHook } from '@angular/compiler/src/lifecycle_reflector';
import { fakeStudents } from '../../models/fake-students'

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.scss']
})
export class StudentComponent implements OnInit {
   
  students = fakeStudents
  constructor() { }

  ngOnInit() {
  }

}
