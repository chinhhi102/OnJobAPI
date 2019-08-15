import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

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

const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'home', component: HomeComponent},
  {path: 'student', component: StudentComponent},
  {path: 'login', component: LoginComponent},
  {path: 'detail', component: DetailComponent},
  {path: 'major', component: MajorComponent},
  {path: 'profile', component: ProfileComponent},
  {path: 'school', component: SchoolComponent},
  {path: 'setting', component: SettingComponent},
  {path: 'subject', component: SubjectComponent},
  {path: 'course', component: CourseComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
