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
import { MajorDetailComponent } from './view/major/major-detail/major-detail.component';
import { CreateMajorComponent } from './view/major/create-major/create-major.component';

const routes: Routes = [
  {path: '', redirectTo: 'student',pathMatch:'full'},
  {path: 'home', component: HomeComponent},
  {path: 'student', component: StudentComponent},
  {path: 'login', component: LoginComponent},
  {path: 'detail', component: DetailComponent},
  {path: 'major', component: MajorComponent},
  {path: 'major/detail/:id', component: MajorDetailComponent},
  {path: 'major/add', component: CreateMajorComponent},
  {path: 'profile', component: ProfileComponent},
  {path: 'school', component: SchoolComponent},
  {path: 'setting', component: SettingComponent},
  {path: 'subject', component: SubjectComponent},
  {path: 'details/:id', component: StudentDetailsComponent},
  {path: 'student/add', component: CreateStudentComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
