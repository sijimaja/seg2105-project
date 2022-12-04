package com.example.deliverable;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.pressKey;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.RootMatchers.withDecorView;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import static androidx.test.espresso.Espresso.*;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.*;

import static com.google.android.material.internal.ContextUtils.getActivity;

import androidx.test.espresso.ViewAction;
import androidx.test.espresso.ViewAssertion;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

import android.view.KeyEvent;
import android.widget.Toast;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class ExampleAndroidTest {

   @Rule
   public ActivityScenarioRule<MainActivity> activityRule =
           new ActivityScenarioRule<MainActivity>(MainActivity.class);

   @Test
   public void testCreateStudent() {
      onView(withId(R.id.Text_username)).perform(typeText("admin" + ""));
      onView(withId(R.id.Text_username)).perform(pressKey(KeyEvent.KEYCODE_ENTER));
      onView(withId(R.id.Text_password)).perform(typeText("admin123"));
      onView(withId(R.id.Text_password)).perform(pressKey(KeyEvent.KEYCODE_ENTER));
      onView(withId(R.id.Btn_submit)).perform(click());
      onView(withText("ACCOUNTS")).perform(click());
      onView(withId(R.id.add_student)).perform(click());
      onView(withId(R.id.studentNameEditText)).perform(typeText("Create Student Test"));
      onView(withId(R.id.studentNameEditText)).perform(ViewActions.pressBack());
      onView(withId(R.id.studentEmailEditText)).perform(typeText("CreateStudent@gmail.com"));
      onView(withId(R.id.studentEmailEditText)).perform(ViewActions.pressBack());
      onView(withId(R.id.studentUsernameEditText)).perform(typeText("Test1234"));
      onView(withId(R.id.studentUsernameEditText)).perform(ViewActions.pressBack());
      onView(withId(R.id.studentPasswordEditText)).perform(typeText("Password"));
      onView(withId(R.id.studentPasswordEditText)).perform(ViewActions.pressBack());
      onView(withId(R.id.addStudentButton)).perform(click());
   }

   @Test
   public void testDeleteStudent() {
      onView(withId(R.id.Text_username)).perform(typeText("admin" + ""));
      onView(withId(R.id.Text_username)).perform(pressKey(KeyEvent.KEYCODE_ENTER));
      onView(withId(R.id.Text_password)).perform(typeText("admin123"));
      onView(withId(R.id.Text_password)).perform(pressKey(KeyEvent.KEYCODE_ENTER));
      onView(withId(R.id.Btn_submit)).perform(click());
      onView(withText("ACCOUNTS")).perform(click());
      onView(withText("DELETE A STUDENT ACCOUNT")).perform(click());
      onView(withId(R.id.editTextStudentUsernameDelete)).perform(typeText("Test1234"));
      onView(withId(R.id.editTextStudentUsernameDelete)).perform(ViewActions.pressBack());
      onView(withText("DELETE")).perform(click());
   }

   @Test
   public void testCreateInstructor() {
      onView(withId(R.id.Text_username)).perform(typeText("admin" + ""));
      onView(withId(R.id.Text_username)).perform(pressKey(KeyEvent.KEYCODE_ENTER));
      onView(withId(R.id.Text_password)).perform(typeText("admin123"));
      onView(withId(R.id.Text_password)).perform(pressKey(KeyEvent.KEYCODE_ENTER));
      onView(withId(R.id.Btn_submit)).perform(click());
      onView(withText("ACCOUNTS")).perform(click());
      onView(withText("ADD AN INSTRUCTOR ACCOUNT")).perform(click());
      onView(withId(R.id.editTextInstructorName)).perform(typeText("Test Add Instructor"));
      onView(withId(R.id.editTextInstructorName)).perform(ViewActions.pressBack());
      onView(withId(R.id.editTextInstructorEmail)).perform(typeText("addInstructor@gmail.com"));
      onView(withId(R.id.editTextInstructorEmail)).perform(ViewActions.pressBack());
      onView(withId(R.id.editTextInstructorUsername)).perform(typeText("TestAddInstructor1234"));
      onView(withId(R.id.editTextInstructorUsername)).perform(ViewActions.pressBack());
      onView(withId(R.id.editTextInstructorPassword)).perform(typeText("Password"));
      onView(withId(R.id.editTextInstructorPassword)).perform(ViewActions.pressBack());
      onView(withId(R.id.addInstructorButton)).perform(click());
   }

   @Test
   public void testDeleteInstructor() {
      onView(withId(R.id.Text_username)).perform(typeText("admin" + ""));
      onView(withId(R.id.Text_username)).perform(pressKey(KeyEvent.KEYCODE_ENTER));
      onView(withId(R.id.Text_password)).perform(typeText("admin123"));
      onView(withId(R.id.Text_password)).perform(pressKey(KeyEvent.KEYCODE_ENTER));
      onView(withId(R.id.Btn_submit)).perform(click());
      onView(withText("ACCOUNTS")).perform(click());
      onView(withText("DELETE AN INSTRUCTOR ACCOUNT")).perform(click());
      onView(withId(R.id.editTextInstructorUsernameDelete)).perform(typeText("TestAddInstructor1234"));
      onView(withId(R.id.editTextInstructorUsernameDelete)).perform(ViewActions.pressBack());
      onView(withText("DELETE")).perform(click());
   }

   @Test
   public void testCreateCourse() {
      onView(withId(R.id.Text_username)).perform(typeText("admin" + ""));
      onView(withId(R.id.Text_username)).perform(pressKey(KeyEvent.KEYCODE_ENTER));
      onView(withId(R.id.Text_password)).perform(typeText("admin123"));
      onView(withId(R.id.Text_password)).perform(pressKey(KeyEvent.KEYCODE_ENTER));
      onView(withId(R.id.Btn_submit)).perform(click());
      onView(withText("CREATE NEW COURSE")).perform(click());
      onView(withId(R.id.editTextCourseName)).perform(typeText("Test Create Course"));
      onView(withId(R.id.editTextCourseName)).perform(ViewActions.pressBack());
      onView(withId(R.id.editTextCourseCode)).perform(typeText("tes1234"));
      onView(withId(R.id.editTextCourseCode)).perform(ViewActions.pressBack());
      onView(withText("CREATE")).perform(click());
   }

   @Test
   public void testDeleteCourse() {
      onView(withId(R.id.Text_username)).perform(typeText("admin" + ""));
      onView(withId(R.id.Text_username)).perform(pressKey(KeyEvent.KEYCODE_ENTER));
      onView(withId(R.id.Text_password)).perform(typeText("admin123"));
      onView(withId(R.id.Text_password)).perform(pressKey(KeyEvent.KEYCODE_ENTER));
      onView(withId(R.id.Btn_submit)).perform(click());
      onView(withText("DELETE A COURSE")).perform(click());
      onView(withId(R.id.deleteCourseCode)).perform(typeText("tes1234"));
      onView(withId(R.id.deleteCourseCode)).perform(ViewActions.pressBack());
      onView(withText("DELETE")).perform(click());
   }
}