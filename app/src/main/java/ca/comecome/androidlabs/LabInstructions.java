package ca.comecome.androidlabs;

/**
 * Created by Fasen on 4/15/2017.
 */

public class LabInstructions {


    /**
     * CST2335 – Graphical Interface Programming
     Lab 2

     Introduction:
     The goal of this lab is become familiar with how XML and Java are combined for creating user interfaces. The layouts and widgets are created in XML, and Java then gets references to the objects created in XML to control the behavior of the application

     References:
     Chapter 6 and 7 in Android Application Development in 24 Hours

     Steps:

     1.	Create a branch of your software from Lab 1. Select the VCS menu in Android Studio, and click “Git” -> “branches”.
     From the dialog box, select “New Branch” and call it “Lab 2”.

     Using a new branch means that all of your software changes only change this branch, and not the original branch.
     This means you can go back to the “master” branch at any time.

     2.	Create a new activity by: right-click on the “app”->”java” folder in the Android project view,
     and click “New”-> “Activity” -> “Basic Activity”. Give it the name “LoginActivity” and click “Finish”.
     Android Studio will offer to add the new files to Git for tracking, you should click “Ok”.

     3.	In the “content_login.xml” layout file, select the “Text” view tab at the bottom left and
     change the RelativeLayout tag to a LinearLayout tag: <LinearLayout> </LinearLayout>. Set the orientation to be vertical.

     4.	The next step is to add some widgets to the screen. In the LinearLayout, add a <TextView> widget,
     with the text: “Login”. Remember to add it to the strings.xml file, and the TextView uses an @strings reference.
     Below the login text, add an <EditText> widget that uses the entire width of the screen (match_parent).

     5.	In the properties window on the bottom right of the screen, set the hint text of the EditText to be “login name”.
     Set the input type to be textEmailAddress. This will make the keyboard for inputting text show characters for email addresses,
     and it should also validate the string that the user writes. You are re-using the built-in functionality of Android!

     6.	Below the EditText, add another PlainText widget, with the text: “Password”.

     7.	Below the password, add another <EditText> widget. Set the input type to be textPassword.
     This will make the text field show dots (.) or stars (*) instead of the text that the user wrote.
     8.	Follow the steps from step 2 to create a third activity. Create an EmptyActivity called ListItemsActivity.
     Add the created files to Git for tracking. Change the activity_list_items so that it uses a GridLayout as the root tag.
     Select a row count of 2, and a column count of 2. Set the layout_width to be match_parent, but the layout_height to be wrap_content.

     9.	Add a RadioButton, a CheckBox, a Switch, and an ImageButton to the 4 positions of the GridLayout.
     Change the text for the Switch to “Enable Something”.
     For the ImageButton, select it from the Component tree window, and find the “background” item in the Properties list.
     Click the “…” button. From the Resources dialog window, select the “Drawable” items on the left side of the window,
     and find “btn_star_big_on” picture, and click “Ok”. You should now have a star on your image button , like Figure 1.

     10.	Set the android:column_Weight=”1”, and android:gravity=”fill” for the 4 items in the GridLayout so that
     the columns stretch to take the available space on the screen:



     Figure 1 Layout of widgets for ListItemsActivity

     11.	Now that you have 3 activities, run your application again.
     It should start with your Lab1 activity being the initial activity.
     Now open the AndroidManifest.xml file, and find the <Activity> tags.
     There should be one for each of StartActivity, LoginActivity, and ListItemsActivity.
     The starting activity should have the <intent-filter> tag.
     That specifies that it is the Activity that you intend to start. Move the <intent-filter> tag
     to the LoginActivity section and restart your application. Now the LoginActivity should be displayed.
     Repeat the steps to make the ListItemsActivity the start activity and re-run the application.
     Demonstrate your application showing the 3 different starting activities.

     12.	Finally, update your strings.xml files so that the text for your GUI is translated into
     your second language for your application. Show the professor that the strings file has been updated,
     but you don’t need to switch the locales for your demonstration.

     13.	In your project view, right-click on the “App” folder, and select “Git” -> “Commit Directory”.
     The changes window should show all of the files that were changed in this lab. Put a commit message saying
     “Added 3 activies for Lab 2”, and click the “Commit” button. Now your changes have been saved to the “Lab 2” branch of
     your repository. Right-click again on the “App” folder, and select “Git” -> “Repository” -> “Push”.
     Now your changes are pushed to either your local repository on your hard drive, or to Github if you configured your account in AndroidStudio.

     Marks:
     LoginActivity uses a LinearLayout.							+1
     LoginActivity has two edit text widgets with proper text input types. 		+2
     ListItemsActivity uses a grid layout							+1
     ListItemsActivity widgets are customized according to step 10.			+2
     Demonstrate the app with 3 different starting Activity classes.			+3
     strings.xml file has been updated with text for second language (step 12)		+1

     */


}
