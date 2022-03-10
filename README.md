Student name: Lucas Bandeira
Student Identification: 23884

# Requirements checklist #

## Main Activity (or Launcher Activity): ##

- [x] Button Links open new Activity
- [x] Home icon opens Main Activity from back-stack instead of creating newly
- []  Exit Button finishes the activity and closes the app
- [x] Text is not hardcoded in the layout but is present in "strings" resources xml file
- [x] Image Assets
- [?] Images (Raster) are used
- [x] Vector icons (inbuilt material icons) are used
- [x] SVG icon is used

## Layout and Design: ##

- [x] All text presented should be clear and legible and should have sufficient contrast (Hint: Dark Gray Text on Dark Blue background is bad)
- [x] All activities should contain ScrollViews to display lengthy content
In Main Activity, 
- [x] Basic details are centered horizontally
- [x] Photo has at least 5dp margin on all sides
- [] 4 buttons have same length
_Copyright Text  
- [x] has a small font size
- [x] has dark gray color
- [] has a top padding 10dp with a top gray border of 1dp (to separate it out from the main content)
In all 4 extra activities, 
- [] title row is at the top of the app and does not scroll
- [x] title row has a dark background (and hence white/light colored text and icon)
- [] button row is at the bottom of the app and does not scroll
- [x] button row has 3 buttons (or 2 buttons) are present in one row with at least 5dp space in between them
button row spans full width of the app (i.e. each button's width will be set based on app's width)
- [x] icon and title are displayed on top and in one row horizontally centered. Contents inside this row should be vertically aligned in the centre (while the row itself is at the top of the page)

- [x] Coding Practices (Hint: Check online if you don't know what the right/best practice is):
Variable and File Naming conventions are followed
- [x] Code is properly indented
- [x] Right File Structure is followed (e.g. Layout xml files placed directly under resources directory is bad, place it in "layout" folder instead)
## Hard: ##

Use at least one FrameLayout as a separator e.g. to separate two LinearLayouts or TextViews (Hint: Set height 1dp with a light gray background)
Show both icons and text in buttons (except home icon)
Make ImageView display your photo with rounded corners (without editing your photo)

# Report #

On this mobile app continuous assignment the purpose was to develop an application containing a main activity and another 4 extra activities which have to be interactive with each other. As I own a macbook, I had to create new kotlin files and new layout.xml files manually as MacOS do not generate layout files automatically.

Once I had created all the activities and layouts that I needed for this project, I started by design by creating a toolbar for my application. To give my project a neater design, I opted to hide the action bar that comes as default when you create a new project.

Next step was creating the copyright footer which would help me to set the constraints of my variables. I created all the features I needed on my first activity such as buttons, text views, scrollViews, ImageVies using the layout file and then simply imported to the extra acitivies and then modifying some of references, so the layouts and kotlin files would relate to the correct activity.

Android Studio has proven to be a very complete tool in the development of mobile applicaitons. As useful as this software is, I have found very challenging to get comfortable with the different files that are part of one single application. However, after spending some hours working on my project, I was able to understand the logic behind Android Studio.

The most challenging part of this assignment for me other than not having much free time to work on it was the fact that it took me a while to understand I had to implement the new activities credentials on the AndroidManifest file. 

I also encountered an unusual error where I would have to delete the id 'kotlin-android-extensions' and type it down again in order to make it work properly as if AndroidStudio had crashed or failed to retrieve the extension package.

I could not finish the design part of the last two activies, but I made them perfectly functional and with scrollView, although there is not enough information on the screen that requires scrolling the page.

# Youtube Link #

## Student name: Lucas Bandeira
Student Identification: 23884

# Requirements checklist #

## Main Activity (or Launcher Activity): ##

- [x] Button Links open new Activity
- [x] Home icon opens Main Activity from back-stack instead of creating newly
- []  Exit Button finishes the activity and closes the app
- [x] Text is not hardcoded in the layout but is present in "strings" resources xml file
- [x] Image Assets
- [?] Images (Raster) are used
- [x] Vector icons (inbuilt material icons) are used
- [x] SVG icon is used

## Layout and Design: ##

- [x] All text presented should be clear and legible and should have sufficient contrast (Hint: Dark Gray Text on Dark Blue background is bad)
- [x] All activities should contain ScrollViews to display lengthy content
In Main Activity, 
- [x] Basic details are centered horizontally
- [x] Photo has at least 5dp margin on all sides
- [] 4 buttons have same length
_Copyright Text  
- [x] has a small font size
- [x] has dark gray color
- [] has a top padding 10dp with a top gray border of 1dp (to separate it out from the main content)
In all 4 extra activities, 
- [] title row is at the top of the app and does not scroll
- [x] title row has a dark background (and hence white/light colored text and icon)
- [] button row is at the bottom of the app and does not scroll
- [x] button row has 3 buttons (or 2 buttons) are present in one row with at least 5dp space in between them
button row spans full width of the app (i.e. each button's width will be set based on app's width)
- [x] icon and title are displayed on top and in one row horizontally centered. Contents inside this row should be vertically aligned in the centre (while the row itself is at the top of the page)

- [x] Coding Practices (Hint: Check online if you don't know what the right/best practice is):
Variable and File Naming conventions are followed
- [x] Code is properly indented
- [x] Right File Structure is followed (e.g. Layout xml files placed directly under resources directory is bad, place it in "layout" folder instead)
## Hard: ##

Use at least one FrameLayout as a separator e.g. to separate two LinearLayouts or TextViews (Hint: Set height 1dp with a light gray background)
Show both icons and text in buttons (except home icon)
Make ImageView display your photo with rounded corners (without editing your photo)

# Report #

On this mobile app continuous assignment the purpose was to develop an application containing a main activity and another 4 extra activities which have to be interactive with each other. As I own a macbook, I had to create new kotlin files and new layout.xml files manually as MacOS do not generate layout files automatically.

Once I had created all the activities and layouts that I needed for this project, I started by design by creating a toolbar for my application. To give my project a neater design, I opted to hide the action bar that comes as default when you create a new project.

Next step was creating the copyright footer which would help me to set the constraints of my variables. I created all the features I needed on my first activity such as buttons, text views, scrollViews, ImageVies using the layout file and then simply imported to the extra acitivies and then modifying some of references, so the layouts and kotlin files would relate to the correct activity.

Android Studio has proven to be a very complete tool in the development of mobile applicaitons. As useful as this software is, I have found very challenging to get comfortable with the different files that are part of one single application. However, after spending some hours working on my project, I was able to understand the logic behind Android Studio.

The most challenging part of this assignment for me other than not having much free time to work on it was the fact that it took me a while to understand I had to implement the new activities credentials on the AndroidManifest file. 

I also encountered an unusual error where I would have to delete the id 'kotlin-android-extensions' and type it down again in order to make it work properly as if AndroidStudio had crashed or failed to retrieve the extension package.

I could not finish the design part of the last two activies, but I made them perfectly functional and with scrollView, although there is not enough information on the screen that requires scrolling the page.

# Youtube Link #

## link ##



Student name: Lucas Bandeira
Student Identification: 23884

# Requirements checklist #

## Main Activity (or Launcher Activity): ##

- [x] Button Links open new Activity
- [x] Home icon opens Main Activity from back-stack instead of creating newly
- []  Exit Button finishes the activity and closes the app
- [x] Text is not hardcoded in the layout but is present in "strings" resources xml file
- [x] Image Assets
- [?] Images (Raster) are used
- [x] Vector icons (inbuilt material icons) are used
- [x] SVG icon is used

## Layout and Design: ##

- [x] All text presented should be clear and legible and should have sufficient contrast (Hint: Dark Gray Text on Dark Blue background is bad)
- [x] All activities should contain ScrollViews to display lengthy content
In Main Activity, 
- [x] Basic details are centered horizontally
- [x] Photo has at least 5dp margin on all sides
- [] 4 buttons have same length
_Copyright Text  
- [x] has a small font size
- [x] has dark gray color
- [] has a top padding 10dp with a top gray border of 1dp (to separate it out from the main content)
In all 4 extra activities, 
- [] title row is at the top of the app and does not scroll
- [x] title row has a dark background (and hence white/light colored text and icon)
- [] button row is at the bottom of the app and does not scroll
- [x] button row has 3 buttons (or 2 buttons) are present in one row with at least 5dp space in between them
button row spans full width of the app (i.e. each button's width will be set based on app's width)
- [x] icon and title are displayed on top and in one row horizontally centered. Contents inside this row should be vertically aligned in the centre (while the row itself is at the top of the page)

- [x] Coding Practices (Hint: Check online if you don't know what the right/best practice is):
Variable and File Naming conventions are followed
- [x] Code is properly indented
- [x] Right File Structure is followed (e.g. Layout xml files placed directly under resources directory is bad, place it in "layout" folder instead)
## Hard: ##

Use at least one FrameLayout as a separator e.g. to separate two LinearLayouts or TextViews (Hint: Set height 1dp with a light gray background)
Show both icons and text in buttons (except home icon)
Make ImageView display your photo with rounded corners (without editing your photo)

# Report #

On this mobile app continuous assignment the purpose was to develop an application containing a main activity and another 4 extra activities which have to be interactive with each other. As I own a macbook, I had to create new kotlin files and new layout.xml files manually as MacOS do not generate layout files automatically.

Once I had created all the activities and layouts that I needed for this project, I started by design by creating a toolbar for my application. To give my project a neater design, I opted to hide the action bar that comes as default when you create a new project.

Next step was creating the copyright footer which would help me to set the constraints of my variables. I created all the features I needed on my first activity such as buttons, text views, scrollViews, ImageVies using the layout file and then simply imported to the extra acitivies and then modifying some of references, so the layouts and kotlin files would relate to the correct activity.

Android Studio has proven to be a very complete tool in the development of mobile applicaitons. As useful as this software is, I have found very challenging to get comfortable with the different files that are part of one single application. However, after spending some hours working on my project, I was able to understand the logic behind Android Studio.

The most challenging part of this assignment for me other than not having much free time to work on it was the fact that it took me a while to understand I had to implement the new activities credentials on the AndroidManifest file. 

I also encountered an unusual error where I would have to delete the id 'kotlin-android-extensions' and type it down again in order to make it work properly as if AndroidStudio had crashed or failed to retrieve the extension package.

I could not finish the design part of the last two activies, but I made them perfectly functional and with scrollView, although there is not enough information on the screen that requires scrolling the page.

# Youtube Link #

## https://www.youtube.com/watch?v=4VYmrROLD7k ##




