# MultiTheme  





In some app, we have display settings, and the option to set the entire mobile theme such as light blue colour theme, red color theme or any other colour. This will make the entire mobile functionality with this theme setting.  
One needs to understand the style in Android so as to set the theme of an Android application.  
Style is an XML file that resides in `project/res/values` directory and usually comprises of settings of appearances. The basic structure of `style.xml` is as below:     

```xml
<?xml version="1.0" encoding="utf-8"?>
<resources>
    <style name="nameOfTheTheme">
        <item name="android:attributeSets">value</item>
    </style>
</resources>
```

We can notice here that that in the style tag, there is one attribute named `name` which has the value. This value determines the `name of theme`, for example, "MyTheme".  
The next is an `item` tag that comprises of several attribute sets of views like `android:textColor`, `android:textSize` etc. We need to specify this attribute and then write the value corresponding to it. Here is an example of a `style.xml` file:  
```xml
<?xml version="1.0" encoding="utf-8"?>
<resources>
    <style name="MyTheme">
        <item name="android:textColor">#FF0000</item>
    </style>
</resources>
```
It can be observed clearly that the name of the style is `My Theme` and the item tag has the attribute `Text Color` that possesses the value "#FF0000" which is the colour "Red".  
The following code needs to be written before the setting of a layout file in `setContentView`. This will set the theme while your activity is loading.  

```java
activity.setTheme(R.style.MyTheme);
setContentView(R.layout.main);
```
The application theme will be set before loading layout using the above code.
