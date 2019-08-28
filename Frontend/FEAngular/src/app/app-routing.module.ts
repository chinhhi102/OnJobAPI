import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
//Component
import { HomeComponent } from './view/home/home.component';
import { StudentComponent} from './view/student/student.component';
import { LoginComponent} from './view/login/login.component';
import { DetailComponent} from './view/detail/detail.component';
import { MajorComponent} from './view/major/major.component';
import { ProfileComponent} from './view/profile/profile.component';
import { SchoolComponent} from './view/school/school.component';
import { SettingComponent} from './view/setting/setting.component';
import { SubjectComponent} from './view/subject/subject.component';
import { CourseComponent} from './view/course/course.component';
import { StudentDetailsComponent } from './view/student/student-details/student-details.component';
import { CreateStudentComponent } from './view/student/create-student/create-student.component';
import { SubjectDetailsComponent } from './view/subject/subject-details/subject-details.component';
import { CreateSubjectComponent } from './view/subject/create-subject/create-subject.component'

const routes: Routes = [
  {path: '', redirectTo: 'student',pathMatch:'full'},
  {path: 'home', component: HomeComponent},
  {path: 'student', component: StudentComponent},
  {path: 'login', component: LoginComponent},
  {path: 'detail', component: DetailComponent},
  {path: 'major', component: MajorComponent},
  {path: 'profile', component: ProfileComponent},
  {path: 'school', component: SchoolComponent},
  {path: 'setting', component: SettingComponent},
  {path: 'subject', component: SubjectComponent},
  {path: 'student/details/:id', component: StudentDetailsComponent},
  {path: 'student/add', component: CreateStudentComponent},
  {path: 'subject/details/:id', component: SubjectDetailsComponent},
  {path: 'subject/add', component: CreateSubjectComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
